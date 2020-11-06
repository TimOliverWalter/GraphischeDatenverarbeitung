import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.glfw.GLFW.*;
import java.nio.FloatBuffer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL20;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import haeuser.Haus;
import auto.Sihlouette;
import baum.Baum;
import bushaeuschen.Bushaeuschen;
import licht.Licht;
import parkbank.Parkbank;
import see.See;
import strecke.Strecke;
import tannenbaum.Tannenbaum;
import wiese.Wiese;


public class MyScene{
	
	private FloatBuffer fb = BufferUtils.createFloatBuffer(16);
	private Matrix4f m = new Matrix4f();
	
	private float xpos;
	private float ypos;
	private float zpos;
	
	//Zeitvariablen
	int zeitzaehler;
	int sekunden;
	int minuten;
	
	private boolean isAccelerating = false;
	// -1 down 1 up
	private int zDirection = 0;
	// -1 left 1 right
	private int xDirection = 0;
	
	private float rot;
	
	private float distX;
	private float distZ;
		
	private float acceleration;
	private float maxAcceleration = 2.0f;
	private float backAccleratoon = 1.0f;
		
	Karte karte = new Karte();
	Auto auto 	= new Auto();
	Fahrbahnbegrenzung fahrbahnbegrenzung = new Fahrbahnbegrenzung();
 	
	private boolean kamera = true;
	private boolean sonne  = true;
	
	
	public void renderLoop(){
		//Kamera  
		if (kamera) {
			if (acceleration >= 0) {
				m.setLookAt(xpos + distX, 400, zpos + distZ, xpos, 100, zpos, 0, 1, 0);
				m.get(fb);

			}
			if (acceleration < 0) {
				m.setLookAt(xpos - distX, 400, zpos - distZ, xpos, 100, zpos, 0, 1, 0);
				m.get(fb);
			}
		} else {
			m.setLookAt(xpos + distX, 3000, zpos + distZ, xpos, 0, zpos, 0, 1, 0);
			m.get(fb);
		}

		if (!isAccelerating) {
			if (acceleration < 0.0f) {
				if (acceleration + 0.02f >= 0) {
					acceleration = 0.0f;
				} else {
					acceleration = acceleration + 0.02f;
				}
			}
			if (acceleration > 0.0f) {
				if (acceleration - 0.02f <= 0) {
					acceleration = 0.0f;
				} else {
					acceleration = acceleration - 0.02f;
				}
			}
		}
		if (xDirection == -1) {
			decreasexpos();
		} else if (xDirection == 1) {
			increasexpos();
		}
		if (zDirection == -1) {
			decreasezpos();
		} else if (zDirection == 1) {
			increasezpos();
		}
		
		//Zeitmessung
		if(fahrbahnbegrenzung.isZeitzaehlen()){
			zeitzaehler++;
			fahrbahnbegrenzung.setZeitzaehler(zeitzaehler);
		}
		
		sekunden = (int)(zeitzaehler/10.65 - minuten*60);
		if(sekunden == 60){
			sekunden = 0;
			minuten++;
		}
		
		zpos  = zpos - (float) Math.cos(Math.toRadians(rot)) * acceleration * 100.0f;
		xpos  = xpos + (float) Math.sin(Math.toRadians(rot)) * acceleration * 100.0f;
	
		distX  = -(float) Math.sin(Math.toRadians(rot)) * 1000.0f;
		distZ  = (float) Math.cos(Math.toRadians(rot)) * 1000.0f;

		// Auf der Strecke bleiben
		if(!fahrbahnbegrenzung.PrüfungAufStrecke(xpos, zpos)){
			acceleration = 0.01f;
		}
		fahrbahnbegrenzung.zieleinfahrt(xpos, zpos);
		fahrbahnbegrenzung.muenzenSammeln(xpos, zpos);
		
		//Sonne an- und abschalten
		if(sonne){
			glEnable(GL_LIGHT5);
		}else{
			glDisable(GL_LIGHT5);
		}

		
		
		glPushMatrix();
			glLoadMatrixf(fb);
			glCallList(karte.getDisplayList());
			
			
				glTranslatef(xpos - distX, 0, zpos - distZ);
				if (xpos < 0) {
					glRotatef(-rot, 0, -xpos, 0);
				} else {
					glRotatef(-rot, 0, xpos, 0);
				}
			glCallList(auto.getDisplayList());
		glPopMatrix();
	
	}
	
	
	
	public void initGLState(){
		glEnable( GL_DEPTH_TEST );
    	glMatrixMode(GL_PROJECTION);
    	glLoadIdentity();
    	m.setPerspective(1, 1, 2, 3000000);
    	m.get(fb);
    	glLoadMatrixf(fb);

		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
        
		// Hintergrundfarbe definieren
		glClearColor(0, 0, 0, 0);
		
		

	     /* Flat-Shading soll benutzt werden */
		 glShadeModel( GL_FLAT );
	     glPolygonMode(GL_FRONT_AND_BACK, GL_LINE);
	     
	     auto.setDisplayList(glGenLists(1));
	    glNewList(auto.getDisplayList(), GL_COMPILE);
	    auto.auto();;
	    glEndList();
	    
	    
	    karte.setDisplayList(glGenLists(1));
	    glNewList(karte.getDisplayList(), GL_COMPILE);
	    karte.zusammenBauen();;
	    glEndList();
	    
	    fahrbahnbegrenzung.zulässigkeitsbereichErzeugen();
	    fahrbahnbegrenzung.muenzenPositionieren();
	    JFrame f = new JFrame( "Steuerung" );
        f.setSize( 300, 400 );
        f.add( new JLabel("<html> <p/>" + "<html>Willkommen bei [Sport Utility Vehicle]! <p/>" + "<html> <p/>" + "<html>Die Steuerung funktioniert folgendermaßen:<p/>" + "<html> <p/>"
                            + "<html>Pfeiltaste oben:    Vorwärts<p/>" + "<html> <p/>" + "<html>Pfeiltaste unten:    Bremsen bzw. Rückwärts<p/>" + "<html> <p/>"
                            + "<html>Pfeiltaste links:    nach links fahren<p/>"  + "<html> <p/>" + "<html>Pfeiltaste rechts:    nach rechts fahren<p/>" + "<html> <p/>"
                            + "<html>Taste 'S':    Ansicht wechseln<p/>" + "<html> <p/>"  + "<html>Taste 'X':    Sonne einschalten<p/>" + "<html> <p/>"
                            + "<html>Taste 'C':    Sonne abschalten<p/>" + "<html> <p/>"
                            + "<html> <p/>" + "<html>Viel Spaß!" + "<html> <p/>"));                    
        f.setVisible( true );
        f.setLocationRelativeTo(null);
    }
	

	public void keyboard(int key, int action) {

		if (acceleration != 0) {
			if (key == GLFW_KEY_LEFT && (action == GLFW_REPEAT || action == GLFW_PRESS)) {
				xDirection = -1;
			}
			if (key == GLFW_KEY_RIGHT && (action == GLFW_REPEAT || action == GLFW_PRESS)) {
				xDirection = 1;
			}
		}
		if (key == GLFW_KEY_LEFT && action == GLFW_RELEASE) {
			xDirection = 0;
		}
		if (key == GLFW_KEY_RIGHT && action == GLFW_RELEASE) {
			xDirection = 0;
		}
		if (key == GLFW_KEY_UP && (action == GLFW_REPEAT || action == GLFW_PRESS)) {
			isAccelerating = true;
			zDirection = 1;
		}
		if (key == GLFW_KEY_DOWN && (action == GLFW_REPEAT || action == GLFW_PRESS)) {
			isAccelerating = true;
			zDirection = -1;
		}
		if (key == GLFW_KEY_UP && action == GLFW_RELEASE) {
			isAccelerating = false;
			zDirection = 0;
		}
		if (key == GLFW_KEY_DOWN && action == GLFW_RELEASE) {
			isAccelerating = false;
			zDirection = 0;
		}
		if (acceleration > 0) {
			if (key == GLFW_KEY_N && action == GLFW_PRESS) {
				maxAcceleration = 4.0f;
			}
			if (key == GLFW_KEY_N && action == GLFW_RELEASE) {
				maxAcceleration = 2.0f;
			}
		}
		if (key == GLFW_KEY_A && (action == GLFW_PRESS)) {
			kamera = true;
		}
		if (key == GLFW_KEY_S && (action == GLFW_PRESS)) {
			kamera = false;
		}
		if (key == GLFW_KEY_X && (action == GLFW_PRESS)) {
			sonne = true;
		}
		if (key == GLFW_KEY_C && (action == GLFW_PRESS)) {
			sonne = false;
		}
	}
	

	private void increasexpos() {
		if (acceleration >= 0) {
			rot = rot + 5;
		} else {
			rot = rot - 5;
		}

	}

	private void decreasezpos() {
		if (acceleration > 0.0f) {
			acceleration = acceleration - 0.2f;
		} else if (acceleration > -backAccleratoon) {
			acceleration = acceleration - 0.1f;
		} else if (acceleration <= -backAccleratoon) {
			acceleration = -backAccleratoon;
		}

	}

	private void decreasexpos() {
		if (acceleration >= 0) {
			rot = rot - 5;
		} else {
			rot = rot + 5;
		}
	}

	private void increasezpos() {
		if (acceleration < maxAcceleration) {
			acceleration = acceleration + 0.2f;
		} else if (acceleration >= maxAcceleration) {
			if (acceleration - 0.2 < maxAcceleration) {
				acceleration = maxAcceleration;
			} else {
				acceleration = acceleration - 0.2f;
			}
		}
	}
}

	