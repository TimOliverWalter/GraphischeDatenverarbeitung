package auto;

import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils; // to create a float buffer in place of the glfloat array

public class KotfluegelObject {
	
	public void drawKotfluegelDreieck(){
		int m = 20, n = 20; // für Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa=-50, xe=0, ya= -100; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
	    float deltax=(xe-xa)/m; // Größe einer Facette

	    for(int i=0;i<m;i++){
           
                x_i= xa + i * deltax;
                x_i_1 = x_i + deltax;
                
               
             
                glBegin(GL_POLYGON);  // ij-te Facette zeichnen
                  glNormal3f(0, 0, 1);
                  glVertex3f(ya, x_i, 0);
                  glNormal3f(0, 0, 1);
                  glVertex3f(ya, x_i_1, 0);
                  glNormal3f(0, 0, 1);
                  glVertex3f(-50, 0, 0);                 
                glEnd();            
	    }
	
	}
	
	
	public void drawfacettiertesRechteck(){
	    int m = 20, n = 20; // für Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa=-50, xe=100, ya=0, ye=50; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
	    float deltax=(xe-xa)/m, deltay=(ye-ya)/n; // Größe einer Facette

	    for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                x_i=xa+i*deltax;
                x_i_1=x_i+deltax;

                y_j=ya+j*deltay;
                y_j_1=y_j+deltay;
                
               

                glBegin(GL_POLYGON);  // ij-te Facette zeichnen
                  glNormal3f(0, 0, 1);
                  glVertex3f(x_i, y_j, 0);
                  glNormal3f(0, 0, 1);
                  glVertex3f(x_i_1, y_j, 0);
                  glNormal3f(0, 0, 1);
                  glVertex3f(x_i_1, y_j_1, 0);
                  glNormal3f(0, 0, 1);
                  glVertex3f(x_i, y_j_1, 0);
                glEnd();

            }
	    }

	}
	
	public void drawSchutzblech1(){
	    int m = 20, n = 20; // für Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa=0, xe=50, ya=0, ye = 20; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
	    float deltax=(xe-xa)/m, deltay=(ye-ya)/n; // Größe einer Facette

	    for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                x_i=xa+i*deltax;
                x_i_1=x_i+deltax;

                y_j=ya+j*deltay;
                y_j_1=y_j+deltay;
                
               

                glBegin(GL_POLYGON);  // ij-te Facette zeichnen
                  glNormal3f(0, 0, 1);
                  glVertex3f(x_i, y_j, 0);
                  glNormal3f(0, 0, 1);
                  glVertex3f(x_i_1, y_j, 0);
                  glNormal3f(0, 0, 1);
                  glVertex3f(x_i_1, y_j_1, 0);
                  glNormal3f(0, 0, 1);
                  glVertex3f(x_i, y_j_1, 0);
                glEnd();

            }
	    }

	}
	
	public void drawSchutzblech2(){
	    int m = 20, n = 20; // für Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa=0, xe=70.71f, ya=0, ye = 20; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
	    float deltax=(xe-xa)/m, deltay=(ye-ya)/n; // Größe einer Facette

	    for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                x_i=xa+i*deltax;
                x_i_1=x_i+deltax;

                y_j=ya+j*deltay;
                y_j_1=y_j+deltay;
                
                

                glBegin(GL_POLYGON);  // ij-te Facette zeichnen
                  glNormal3f(0, 0, 1);
                  glVertex3f(x_i, y_j, 0);
                  glNormal3f(0, 0, 1);
                  glVertex3f(x_i_1, y_j, 0);
                  glNormal3f(0, 0, 1);
                  glVertex3f(x_i_1, y_j_1, 0);
                  glNormal3f(0, 0, 1);
                  glVertex3f(x_i, y_j_1, 0);
                glEnd();

            }
	    }

	}

}
