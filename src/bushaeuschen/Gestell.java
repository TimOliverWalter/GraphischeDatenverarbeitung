package bushaeuschen;
//Imports
import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;

import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL20;


public class Gestell
{
	// private Variablen
	
	public void drawgestell(){
		drawGestell();
	}
	
	private void drawGestell()
	{ 
		//Gestell 1
	    glPushMatrix();
	    	glTranslatef(0, 0, 0);	
	    	drawSeite();  // Rückseite
	    glPopMatrix();
  
	    glPushMatrix();
	     	glTranslatef(0, 0, 20);	
	     	drawSeite();  // Vorderseite
	    glPopMatrix();
	     
	    glPushMatrix();
	     	glTranslatef(19, 0, 20);
	     	glRotatef(90, 0, 1, 0);
	     	drawSeite();  // rechte Seite
	    glPopMatrix();
	     
	    glPushMatrix();
	    	glTranslatef(0, 0, 20);
	     	glRotatef(90, 0, 1, 0);
	     	drawSeite();  // linke Seite
	    glPopMatrix();
	    
	     
		//Gestell 2
	    glPushMatrix();
	     	glTranslatef(165, 0, 0);	
	     	drawSeite();  // Rückseite
	    glPopMatrix();
  
	    glPushMatrix();
	     	glTranslatef(165, 0, 20);	
	     	drawSeite();  // Vorderseite
	    glPopMatrix();
	     
	    glPushMatrix();
	     	glTranslatef(184, 0, 20);
	     	glRotatef(90, 0, 1, 0);
	     	drawSeite();  // rechte Seite
	    glPopMatrix();
	     
	    glPushMatrix();
	     	glTranslatef(165, 0, 20);
	     	glRotatef(90, 0, 1, 0);
	     	drawSeite();  // linke Seite
	    glPopMatrix();
	    
	    
		//Gestell 3
	    glPushMatrix();
	     	glTranslatef(340, 0, 0);	
	     	drawSeite();  // Vorderseite
	    glPopMatrix();
  
	    glPushMatrix();
	     	glTranslatef(340, 0, 20);	
	     	drawSeite();  // Rückseite
	    glPopMatrix();
	     
	    glPushMatrix();
	     	glTranslatef(359, 0, 20);
	     	glRotatef(90, 0, 1, 0);
	     	drawSeite();  // rechte Seite
	    glPopMatrix();
	     
	    glPushMatrix();
	     	glTranslatef(340, 0, 20);
	     	glRotatef(90, 0, 1, 0);
	     	drawSeite();  // linke Seite
	    glPopMatrix();
	    
	    
		//Gestell 4
	    glPushMatrix();
	     	glTranslatef(515, 0, 0);	
	     	drawSeite();  // Vorderseite
	    glPopMatrix();
  
	    glPushMatrix();
	     	glTranslatef(515, 0, 20);	
	     	drawSeite();  // Rückseite
	    glPopMatrix();
	     
	    glPushMatrix();
	     	glTranslatef(534, 0, 20);
	     	glRotatef(90, 0, 1, 0);
	     	drawSeite();  // rechte Seite
	    glPopMatrix();
	     
	    glPushMatrix();
	     	glTranslatef(515, 0, 20);
	     	glRotatef(90, 0, 1, 0);
	     	drawSeite();  // linke Seite
	    glPopMatrix();
	    
	    
		//Gestell 5
	    glPushMatrix();
	     	glTranslatef(680, 0, 0);	
	     	drawSeite();  // Vorderseite
	    glPopMatrix();
  
	    glPushMatrix();
	     	glTranslatef(680, 0, 20);	
	     	drawSeite();  // Rückseite
	    glPopMatrix();
	     
	    glPushMatrix();
	     	glTranslatef(699, 0, 20);
	     	glRotatef(90, 0, 1, 0);
	     	drawSeite();  // rechte Seite
	    glPopMatrix();
	     
	    glPushMatrix();
	     	glTranslatef(680, 0, 20);
	     	glRotatef(90, 0, 1, 0);
	     	drawSeite();  // linke Seite
	    glPopMatrix();

	}



	private void drawSeite(){
	    int m = 10, n=10; // für Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa=0, xe=20, ya=0, ye=300; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
	    float deltax=(xe-xa)/m, deltay=(ye-ya)/n; // Größe einer Facette

	    for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                x_i=xa+i*deltax;
                x_i_1=x_i+deltax;

                y_j=ya+j*deltay;
                y_j_1=y_j+deltay;
                
                

                glBegin(GL_POLYGON);  // ij-te Facette zeichnen
                  glNormal3f(0, 0, 1);
                  glVertex3f(x_i, y_j, 1);
                  glNormal3f(0, 0, 1);
                  glVertex3f(x_i_1, y_j, 1);
                  glNormal3f(0, 0, 1);
                  glVertex3f(x_i_1, y_j_1, 1);
                  glNormal3f(0, 0, 1);
                  glVertex3f(x_i, y_j_1, 1);
                glEnd();

            }
	    }

	}
}
