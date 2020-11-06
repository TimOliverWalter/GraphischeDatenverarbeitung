package bushaeuschen;

import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils; // to create a float buffer in place of the glfloat arra

public class Bushaeuschen {
	
	private Gestell gestell						= new Gestell();
	private Gestelloben gestelloben				= new Gestelloben();
	private Gestelloben1 gestelloben1			= new Gestelloben1();
	private Dach dach							= new Dach();
	private Scheibehinten scheibehinten			= new Scheibehinten();
	private Scheibelinks scheibelinks			= new Scheibelinks();
	private Scheiberechts scheiberechts			= new Scheiberechts();
	private Fahrplanauskunft fahrplanauskunft	= new Fahrplanauskunft();
	private Bank1 bank1							= new Bank1();
	private Bank2 bank2							= new Bank2();
	private Bank3 bank3							= new Bank3();
	private Boden boden							= new Boden();
	
	
	float material_Plastik1 [] = {0.0f, 0.0f, 0.0f, 1.0f};
	float material_Plastik2 [] = {0.01f, 0.01f, 0.01f, 1.0f};
	float material_Plastik3 [] = {0.50f, 0.50f, 0.50f, 1.0f};
	
	float material_Tuerkis1 [] = {0.10f, 0.19f, 0.17f, 0.8f};
	float material_Tuerkis2 [] = {0.40f, 0.74f, 0.69f, 0.8f};
	float material_Tuerkis3 [] = {0.30f, 0.31f, 0.31f, 0.8f};
	
	float material_Perle1 [] = {0.25f, 0.21f, 0.21f, 0.9f};
	float material_Perle2 [] = {0.99f, 0.83f, 0.83f, 0.9f};
	float material_Perle3 [] = {0.30f, 0.30f, 0.30f, 0.9f};		
	
	float material_Rubin1 [] = {0.17f, 0.01f, 0.17f, 0.5f};
	float material_Rubin2 [] = {0.61f, 0.04f, 0.04f, 0.5f};
	float material_Rubin3 [] = {0.73f, 0.63f, 0.63f, 0.5f};
	
	float material_Asphalt1 [] = {0.12f, 0.12f, 0.12f, 1.0f};
	float material_Asphalt2 [] = {0.01f, 0.01f, 0.01f, 1.0f};
	float material_Asphalt3 [] = {0.50f, 0.50f, 0.50f, 1.0f};
	
	
	public void drawBushaeuschen(){
		
		glPushMatrix();
			//Gestell
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Plastik1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Plastik2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Plastik3);
			glMaterialf(GL_FRONT, GL_SHININESS, 32.0f);
			gestell.drawgestell();
			gestelloben.drawoben();	
			gestelloben1.drawoben1();
			
			//Scheiben
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			dach.drawdach();
			scheibehinten.drawscheibehinten();
			scheibelinks.drawscheibelinks();
			scheiberechts.drawscheiberechts();
			
			
			//Fahrplanauskunft
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Perle1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Perle2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Perle3);
			glMaterialf(GL_FRONT, GL_SHININESS, 11.3f);	
			fahrplanauskunft.drawfahrplanauskunft();
			
			//Bank
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Rubin1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Rubin2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Rubin3);
			glMaterialf(GL_FRONT, GL_SHININESS, 76.8f);	
			bank1.drawbank1();
			bank2.drawbank2();
			bank3.drawbank3();
			
			//Boden
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Asphalt1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Asphalt2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Asphalt3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			boden.draw_Boden();
		glPopMatrix();
	}

}
