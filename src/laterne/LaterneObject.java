package laterne;

import static org.lwjgl.opengl.GL11.*;


public class LaterneObject {
	float radius = 20;
	float laenge = 500;
	  
	
	
	public void drawZylinder(){
		float nx;
		float ny;
		float nz;
		float norm;
		float xx,yy,zz;
		
		int m = 20;
		int n = 20;
     
		float u_l = 0.0f;
		float u_r = (float)(2*Math.PI);
		float v_l = 0.0f;
		float v_r = laenge;
		float u_i, v_j, u_i_1, v_j_1;
		float delta_u = (u_r-u_l)/(float)(m);
		float delta_v = (v_r-v_l)/(float)(n);
		
     
		for ( int i=0; i < m; i++) {
			u_i = u_l + delta_u * i;
			u_i_1 = u_i + delta_u;

	         for (int j=0; j < n; j++) {
	             v_j = v_l + delta_v * j;
	             v_j_1 = v_j + delta_v;
	             
	             glBegin(GL_TRIANGLE_FAN);
					xx=x(u_i,v_j);
					yy=y(u_i,v_j);
					zz=z(u_i,v_j);
					norm=(float)(Math.sqrt(xx*xx+zz*zz));
					nx= xx/norm;
					ny=yy/norm;
					nz=0;
					glNormal3f(nx, ny, nz);
					glVertex3f(xx, yy, zz);
					
					xx=x(u_i_1,v_j);
					yy=y(u_i_1,v_j);
					zz=z(u_i_1,v_j);
					norm=(float)(Math.sqrt(xx*xx+zz*zz));
					nx= xx/norm;
					ny=yy/norm;
					nz=0;
					glNormal3f(nx, ny, nz);
					glVertex3f(xx, yy, zz);
					
					xx=x(u_i_1,v_j_1);
					yy=y(u_i_1,v_j_1);
					zz=z(u_i_1,v_j_1);
					norm=(float)(Math.sqrt(xx*xx+zz*zz));
					nx= xx/norm;
					ny=yy/norm;
					nz=0;
					glNormal3f(nx, ny, nz);
					glVertex3f(xx, yy, zz);
					
					xx=x(u_i,v_j_1);
					yy=y(u_i,v_j_1);
					zz=z(u_i,v_j_1);
					norm=(float)(Math.sqrt(xx*xx+zz*zz));
					nx= xx/norm;
					ny=yy/norm;
					nz=0;
					glNormal3f(nx, ny, nz);
					glVertex3f(xx, yy, zz);

					glEnd();
	         }
	     }
	 }

	 private float x(float u, float v) {
		 return (float)(radius*Math.cos(u));
	 }

	 private float y(float u, float v) {
	     return (float)(radius*Math.sin(u));
	 }

	 private float z(float u, float v) {
	     return v;
	 }
	 
	 public void drawLaternenKopf(){
			
			float breite = 35.0f;
			float laenge = 150.0f;
			
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
						glVertex3f(x1(u_i_l, v_j_l), y1(u_i_l, v_j_l), z1(u_i_l, v_j_l));
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
		float hoehe = 20.0f;
		float breite = 25.0f;
		
		float zz = hoehe*(1.0f - 4.0f * u * u/(breite * breite));
		return zz;
	}
	
	public void drawfacettiertesRechteck(){
	    int m = 20, n = 20; // für Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa=-17.5f, xe=17.5f, ya=0, ye=150; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
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
