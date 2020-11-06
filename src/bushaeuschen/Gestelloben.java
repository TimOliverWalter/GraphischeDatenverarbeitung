package bushaeuschen;
//Imports
import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;

import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL20;


public class Gestelloben
{
	
	
	public void drawoben(){
		drawGestelloben();
	}
	
	private void drawGestelloben()
	{ 
		//Gestell 1
	    glPushMatrix();
	    	glTranslatef(0, 301, 0);	
	    	glRotatef(90, 1, 0, 0);
	    	drawSeite();  // untere Seite
	    glPopMatrix();
  
	    glPushMatrix();
    		glTranslatef(0, 320, 0);	
    		glRotatef(90, 1, 0, 0);
    		drawSeite();  // obere Seite
    	glPopMatrix();
	     
	    glPushMatrix();
    		glTranslatef(0, 300, 0);	
    		glRotatef(90, 0, 0, 1);
    		glRotatef(90, 1, 0, 0);
    		drawSeite();  // linke Seite
    	glPopMatrix();
	     
	    glPushMatrix();
			glTranslatef(19, 300, 0);	
			glRotatef(90, 0, 0, 1);
			glRotatef(90, 1, 0, 0);
			drawSeite();  // rechte Seite
		glPopMatrix();
	    
		
		//Gestell 2
	    glPushMatrix();
	    	glTranslatef(165, 301, 0);	
	    	glRotatef(90, 1, 0, 0);
	    	drawSeite();  // untere Seite
	    glPopMatrix();
  
	    glPushMatrix();
    		glTranslatef(165, 320, 0);	
    		glRotatef(90, 1, 0, 0);
    		drawSeite();  // obere Seite
    	glPopMatrix();
	     
	    glPushMatrix();
	    	glTranslatef(165, 300, 0);	
	    	glRotatef(90, 0, 0, 1);
	    	glRotatef(90, 1, 0, 0);
	    	drawSeite();  // linke Seite
	    glPopMatrix();
     
	    glPushMatrix();
			glTranslatef(184, 300, 0);	
			glRotatef(90, 0, 0, 1);
			glRotatef(90, 1, 0, 0);
			drawSeite();  // rechte Seite
		glPopMatrix();
		

		//Gestell 3
	    glPushMatrix();
	    	glTranslatef(340, 301, 0);	
	    	glRotatef(90, 1, 0, 0);
	    	drawSeite();  // untere Seite
	    glPopMatrix();
  
	    glPushMatrix();
    		glTranslatef(340, 320, 0);	
    		glRotatef(90, 1, 0, 0);
    		drawSeite();  // obere Seite
    	glPopMatrix();
	     
	    glPushMatrix();
			glTranslatef(340, 300, 0);	
			glRotatef(90, 0, 0, 1);
			glRotatef(90, 1, 0, 0);
			drawSeite();  // linke Seite
		glPopMatrix();
     
		glPushMatrix();
			glTranslatef(359, 300, 0);	
			glRotatef(90, 0, 0, 1);
			glRotatef(90, 1, 0, 0);
			drawSeite();  // rechte Seite
		glPopMatrix();
	    
	    
		//Gestell 4
	    glPushMatrix();
	    	glTranslatef(515, 301, 0);	
	    	glRotatef(90, 1, 0, 0);
	    	drawSeite();  // untere Seite
	    glPopMatrix();
  
	    glPushMatrix();
	    	glTranslatef(515, 320, 0);	
    		glRotatef(90, 1, 0, 0);
    		drawSeite();  // obere Seite
    	glPopMatrix();
	     
	    glPushMatrix();
			glTranslatef(534, 300, 0);	
			glRotatef(90, 0, 0, 1);
			glRotatef(90, 1, 0, 0);
			drawSeite();  // rechte Seite
		glPopMatrix();
     
		glPushMatrix();
			glTranslatef(515, 300, 0);	
			glRotatef(90, 0, 0, 1);
			glRotatef(90, 1, 0, 0);
			drawSeite();  // linke Seite
		glPopMatrix();
		
		
		//Gestell 5
	    glPushMatrix();
	    	glTranslatef(680, 301, 0);	
	    	glRotatef(90, 1, 0, 0);
	    	drawSeite();  // untere Seite
	    glPopMatrix();
  
	    glPushMatrix();
	    	glTranslatef(680, 320, 0);	
    		glRotatef(90, 1, 0, 0);
    		drawSeite();  // obere Seite
    	glPopMatrix();
	     
	    glPushMatrix();
			glTranslatef(699, 300, 0);	
			glRotatef(90, 0, 0, 1);
			glRotatef(90, 1, 0, 0);
			drawSeite();  // rechte Seite
		glPopMatrix();
     
		glPushMatrix();
			glTranslatef(680, 300, 0);	
			glRotatef(90, 0, 0, 1);
			glRotatef(90, 1, 0, 0);
			drawSeite();  // linke Seite
		glPopMatrix();

	}



	private void drawSeite(){
	    int m = 10, n=10; // für Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa=0, xe=20, ya=0, ye=200; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
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
