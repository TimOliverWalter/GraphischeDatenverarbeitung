package bushaeuschen;
//Imports
import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;

import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL20;


public class Scheibelinks
{
	// private Variablen
	
	public void drawscheibelinks(){
		drawScheibelinks();
	}
	
	private void drawScheibelinks()
	{ 
		

		glPushMatrix();
			glTranslatef(0, 0, 0);
			glRotatef(270, 0, 1, 0);
			drawSeite(); 
		glPopMatrix();

	}



	private void drawSeite(){
	    int m = 10, n=10; // f�r Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa=0, xe=201, ya=0, ye=320; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
	    float deltax=(xe-xa)/m, deltay=(ye-ya)/n; // Gr��e einer Facette

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
