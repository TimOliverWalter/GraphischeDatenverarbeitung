package auto;

//Imports
import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils; // to create a float buffer in place of the glfloat array


public class MyObject {
	
	//variablen Scheibe
	float a = 14;
	float b = 14;
	float c = 14;
	
	int m = 50;
	int n = 50;
	
	public void drawfacettiertesQuadrat(){
	    int m = 20, n = 20; // für Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa=-100, xe=100, ya=-100, ye=100; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
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
	
	public void drawfacettiertesRechteck(){
	    int m = 20, n = 20; // für Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa=-100, xe=100, ya=0, ye=100; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
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
	
	public void drawHeckscheibe(){
	    int m = 20, n = 20; // für Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa=-100, xe=100, ya=0, ye=106.636f; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
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
	
	
	public void drawAutoseite(){
	    int m = 20, n = 20; // für Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa=0, xe=267.582f, ya=0, ye=100; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
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
	
	public void drawAbdeckungHaubeKotfluegel(){
		int m = 20, n = 20; // für Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa= 17.431f, xe=0, ya= -199.239f; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
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
                  glVertex3f(0, 0, 0);                 
                glEnd();            
	    }
	
	}
	
	public void drawKuehler(){
		
		// Stoßstangen-Variablen
		float breite = 20.0f;
		float laenge = 140.0f;
		
		int m = 50;
		int n = 50;
		float u_l = -breite/2.0f;
		float u_r = breite/2.0f;
		float v_l = 0;
		float v_r = laenge;
		float u_i, v_j, u_i_l, v_j_l;
		float delta_u = (u_r-u_l)/m;
		float delta_v = (v_r-v_l)/n;
		
		for(int i = 0; i<m; i++){
			u_i = u_l + delta_u*i;
			u_i_l = u_i + delta_u;
			
			for(int j = 0; j<n; j++){
				v_j = v_l + delta_v * j;
				v_j_l = v_j + delta_v;
				
				glBegin(GL_POLYGON);
					glVertex3f(x1(u_i, v_j), y1(u_i, v_j), z1(u_i, v_j));
					glVertex3f(x1(u_i_l, v_j), y1(u_i_l, v_j), z1(u_i_l, v_j));
					glVertex3f(x1(u_i, v_j_l), y1(u_i, v_j_l), z1(u_i, v_j_l));
					glVertex3f(x1(u_i, v_j_l), y1(u_i, v_j_l), z1(u_i, v_j_l));
				glEnd();
			}
		}		
	}

	private float x1(float u, float v) {
		return u;
	}

	private float y1(float u, float v) {
		return v;
	}

	private float z1(float u, float v) {
		float hoehe = 10.0f;
		float breite = 20.0f;
		
		float zz = hoehe*(1.0f - 4.0f * u * u/(breite * breite));
		return zz;
	}
	
	public void drawStossstange1(){
		
		// Stoßstangen-Variablen
		float breite = 25.0f;
		float laenge = 200.0f;
		
		int m = 50;
		int n = 50;
		float u_l = -breite/2.0f;
		float u_r = breite/2.0f;
		float v_l = 0;
		float v_r = laenge;
		float u_i, v_j, u_i_l, v_j_l;
		float delta_u = (u_r-u_l)/m;
		float delta_v = (v_r-v_l)/n;
		
		for(int i = 0; i<m; i++){
			u_i = u_l + delta_u*i;
			u_i_l = u_i + delta_u;
			
			for(int j = 0; j<n; j++){
				v_j = v_l + delta_v * j;
				v_j_l = v_j + delta_v;
				
				glBegin(GL_POLYGON);
					glVertex3f(x(u_i, v_j), y(u_i, v_j), z(u_i, v_j));
					glVertex3f(x(u_i_l, v_j), y(u_i_l, v_j), z(u_i_l, v_j));
					glVertex3f(x(u_i_l, v_j_l), y(u_i_l, v_j_l), z(u_i_l, v_j_l));
					glVertex3f(x(u_i, v_j_l), y(u_i, v_j_l), z(u_i, v_j_l));
				glEnd();
			}
		}		
	}

	private float x(float u, float v) {
		return u;
	}

	private float y(float u, float v) {
		return v;
	}

	private float z(float u, float v) {
		float hoehe = 20.0f;
		float breite = 25.0f;
		
		float zz = hoehe*(1.0f - 4.0f * u * u/(breite * breite));
		return zz;
	}
	
	public void drawStossstange2(){
		
		// Stoßstangen-Variablen
		float breite = 25.0f;
		float laenge = 265.0f;
		
		int m = 50;
		int n = 50;
		float u_l = -breite/2.0f;
		float u_r = breite/2.0f;
		float v_l = 0;
		float v_r = laenge;
		float u_i, v_j, u_i_l, v_j_l;
		float delta_u = (u_r-u_l)/m;
		float delta_v = (v_r-v_l)/n;
		
		for(int i = 0; i<m; i++){
			u_i = u_l + delta_u*i;
			u_i_l = u_i + delta_u;
			
			for(int j = 0; j<n; j++){
				v_j = v_l + delta_v * j;
				v_j_l = v_j + delta_v;
				
				
				glBegin(GL_POLYGON);
					glVertex3f(x(u_i, v_j), y(u_i, v_j), z(u_i, v_j));
					glVertex3f(x(u_i_l, v_j), y(u_i_l, v_j), z(u_i_l, v_j));
					glVertex3f(x(u_i_l, v_j_l), y(u_i_l, v_j_l), z(u_i_l, v_j_l));
					glVertex3f(x(u_i, v_j_l), y(u_i, v_j_l), z(u_i, v_j_l));					
				glEnd();
			}
		}		
	}
	
public void drawScheibe(){
		
		float u_l = (float)(-Math.PI / 2);
		float u_r = (float)(Math.PI / 2);
		float v_l = 0;
		float v_r = (float)(2*Math.PI);
		float u_i, v_j, u_i_1, v_j_1;
		float delta_u = (u_r - u_l)/m;
		float delta_v = (v_r - v_l)/n;
		glPolygonMode(GL_FRONT_AND_BACK, GL_FILL);
		
		for(int i = 0; i < m; i++){
			u_i = u_l + delta_u * i;
			u_i_1 = u_i + delta_u;
			
			for(int j = 0; j < n; j++){
				v_j = v_l + delta_v *j;
				v_j_1 = v_j + delta_v;
				
				glBegin(GL_TRIANGLE_FAN);
					glVertex3f(x2(u_i, v_j),  y2(u_i,v_j), z2(u_i, v_j));
					glVertex3f(x2(u_i_1, v_j),  y2(u_i_1,v_j), z2(u_i_1, v_j));
					glVertex3f(x2(u_i_1, v_j_1),  y2(u_i_1, v_j_1), z2(u_i_1, v_j_1));
					glVertex3f(x2(u_i, v_j_1),  y2(u_i,v_j_1), z2(u_i, v_j_1));
				glEnd();
			}
		}
		
	}

	private float z2(float u, float v) {
		//float zz = (float)(b * Math.cos(u) * Math.sin(v));
		return 0;
	}

	private float y2(float u, float v) {
		float yy = (float)(c * Math.sin(u));
		return yy;
	}

	private float x2(float u, float v) {
		float xx = (float)(a * Math.cos(u) * Math.cos(v));
		return xx;
	}
	
}
