package ziellinie;

import static org.lwjgl.opengl.GL11.*;

public class Ziellinie {
	
	float material_Plastik_schwarz1 [] = {0.0f, 0.0f, 0.0f, 1.0f};
	float material_Plastik_schwarz2 [] = {0.01f, 0.01f, 0.01f, 1.0f};
	float material_Plastik_schwarz3 [] = {0.50f, 0.50f, 0.50f, 1.0f};
	
	float material_Plastik_weiﬂ1 [] = {1.0f, 1.0f, 1.0f, 1.0f};
	float material_Plastik_weiﬂ2 [] = {0.01f, 0.01f, 0.01f, 1.0f};
	float material_Plastik_weiﬂ3 [] = {0.50f, 0.50f, 0.50f, 1.0f};
	
	public void drawZiellinie(){
		for(int i = 0; i < 15; i++){
			glPushMatrix();
				glMaterialfv(GL_FRONT, GL_AMBIENT, material_Plastik_schwarz1);
				glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Plastik_schwarz2);
				glMaterialfv(GL_FRONT, GL_SPECULAR, material_Plastik_schwarz3);
				glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
				glTranslatef(-750+i*100, (int)(600+Math.pow(-1, i)*50), 1000);
				drawfacettiertesQuadrat();
			glPopMatrix();
		}
		
		for(int i = 0; i < 15; i++){
			glPushMatrix();
				glMaterialfv(GL_FRONT, GL_AMBIENT, material_Plastik_weiﬂ1);
				glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Plastik_weiﬂ2);
				glMaterialfv(GL_FRONT, GL_SPECULAR, material_Plastik_weiﬂ3);
				glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
				glTranslatef(-750+i*100, (int)(600+Math.pow(-1, i+1)*50), 1000);
				drawfacettiertesQuadrat();
			glPopMatrix();
		}
	}

	
	public void drawfacettiertesQuadrat(){
	    int m = 20, n = 20; // f¸r Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa=-50, xe=50, ya=-50, ye=50; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
	    float deltax=(xe-xa)/m, deltay=(ye-ya)/n; // Grˆﬂe einer Facette

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
