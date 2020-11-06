package parkbank;
//Imports
import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;

import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL20;


public class Lehnegestell
{
	// private Variablen
	
	public void drawlehnegestell(){
		drawLehnegestell();
	}
	
	private void drawLehnegestell()
	{ 

		//Lehnegestell1
	    glPushMatrix();
	    	glTranslatef(70, 90, 0);
	    	drawSeite(); 	//vordere Seite 
	    glPopMatrix();
	    	    
	    glPushMatrix();
	    	glTranslatef(70, 90, -10);
	    	drawSeite();  	//hintere Seite
	    glPopMatrix();
	    
	    glPushMatrix();
	    	glTranslatef(70, 90, -10);
	    	glRotatef(90, 0, -1, 0);
	    	drawSeite();  	//linke Seite
	    glPopMatrix();
	    
	    glPushMatrix();
	    	glTranslatef(80, 90, -10);
	    	glRotatef(90, 0, -1, 0);
	    	drawSeite();  	//rechte Seite
	    glPopMatrix();
	    
	    
	    
		//Lehnegestell2
	    glPushMatrix();
	    	glTranslatef(270, 90, -0);
	    	drawSeite(); 	//vordere Seite 
	    glPopMatrix();
	    	    
	    glPushMatrix();
	    	glTranslatef(270, 90, -10);
	    	drawSeite();  	//hintere Seite
	    glPopMatrix();
	    
	    glPushMatrix();
	    	glTranslatef(270, 90, -10);
	    	glRotatef(90, 0, -1, 0);
	    	drawSeite();  	//linke Seite
	    glPopMatrix();
	    
	    glPushMatrix();
	    	glTranslatef(280, 90, -10);
	    	glRotatef(90, 0, -1, 0);
	    	drawSeite();  	//rechte Seite
	    glPopMatrix();




	}



	private void drawSeite(){
	    int m = 10, n=10; // für Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa=0, xe=10, ya=0, ye=80; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
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
