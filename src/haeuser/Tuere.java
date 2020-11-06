package haeuser;
import static org.lwjgl.opengl.GL11.*;

public class Tuere {
	
	public void draw() {
		
		Tuere();
	}

	
	private void Tuere() {
		
		int m = 10, n = 5; // für Anzahl der Facetten
		float x_i, y_j, x_i_1, y_j_1; // Hilfsvariablen
		float xa = -100, xe = 100, ya = -125, ye = 175; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		float deltax = (xe - xa) / m, deltay = (ye - ya) / n; // Größe einer Facette
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				x_i = xa + i * deltax;
				x_i_1 = x_i + deltax;

				y_j = ya + j * deltay;
				y_j_1 = y_j + deltay;
				

				glBegin(GL_TRIANGLE_FAN); // ij-te Facette zeichnen
				glNormal3f(0, 0, 1);
				glVertex3f(x_i, y_j, 552f);
				glNormal3f(0, 0, 1);
				glVertex3f(x_i_1, y_j, 552f);
				glNormal3f(0, 0, 1);
				glVertex3f(x_i_1, y_j_1, 552f);
				glNormal3f(0, 0, 1);
				glVertex3f(x_i, y_j_1, 552f);
				glEnd();

			}
		}

	}
}
