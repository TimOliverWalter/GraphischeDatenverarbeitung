package wiese;
import static org.lwjgl.opengl.GL11.*;

public class Wiese1 {
	
	
	public void draw()
	{ 

		drawSeite(); 	
  
	}



	private void drawSeite(){
	    int m = 50, n=50; // für Anzahl der Facetten
	    float x_i, z_j, x_i_1, z_j_1;  // Hilfsvariablen
	    float xa=-110000, xe=30000, za=30000, ze=-82000; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
	    float deltax=(xe-xa)/m, deltaz=(ze-za)/n; // Größe einer Facette

	    for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                x_i=xa+i*deltax;
                x_i_1=x_i+deltax;

                z_j=za+j*deltaz;
                z_j_1=z_j+deltaz;
                
               
                
                glBegin(GL_TRIANGLE_FAN);  // ij-te Facette zeichnen
                  glNormal3f(0, 1, 0);
                  glVertex3f(x_i,-5f, z_j);
                  glNormal3f(0, 1, 0);
                  glVertex3f(x_i_1,-5f, z_j);
                  glNormal3f(0, 1, 0);
                  glVertex3f(x_i_1,-5f, z_j_1);
                  glNormal3f(0, 1, 0);
                  glVertex3f(x_i,-5f, z_j_1);
                glEnd();

            }
	    }

	}
}
