package haeuser;
import static org.lwjgl.opengl.GL11.*;


public class Etage {
	
	Tuere tuere = new Tuere();
	Fenster fenster = new Fenster();
	
	float material_Tuerkis1 [] = {0.10f, 0.19f, 0.17f, 0.8f};
	float material_Tuerkis2 [] = {0.40f, 0.74f, 0.69f, 0.8f};
	float material_Tuerkis3 [] = {0.30f, 0.31f, 0.31f, 0.8f};
	
	float material_Rubin1 [] = {0.17f, 0.01f, 0.17f, 0.5f};
	float material_Rubin2 [] = {0.61f, 0.04f, 0.04f, 0.5f};
	float material_Rubin3 [] = {0.73f, 0.63f, 0.63f, 0.5f};

	
	public void mitTuereFensterDach(){
		
		glPushMatrix();
			fassade();
		glPopMatrix();
		
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(300, 300, 3);
			fenster.draw();
		glPopMatrix();
	
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(-300, 300, 3);
			fenster.draw();
		glPopMatrix();
	
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(300, -300, 3);
			fenster.draw();
		glPopMatrix();
	
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(-300, -300, 3);
			fenster.draw();
		glPopMatrix();
		
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Rubin1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Rubin2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Rubin3);
			glMaterialf(GL_FRONT, GL_SHININESS, 20.8f);	
			glTranslatef(0, -425, 3);
			tuere.draw();
		glPopMatrix();
		
		
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Rubin1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Rubin2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Rubin3);
			glMaterialf(GL_FRONT, GL_SHININESS, 20.8f);	
			drawDach_rechteSeite();
			drawDach_linkeSeite();
			drawSeite_Dachvorne();
		glPopMatrix();
		
	}
	
	public void mitDachFenster(){
		
		glPushMatrix();		
			fassade();
		glPopMatrix();		
		
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(300, 300, 3);
			fenster.draw();
		glPopMatrix();
	
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(-300, 300, 3);
			fenster.draw();
		glPopMatrix();
	
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(300, -300, 3);
			fenster.draw();
		glPopMatrix();
	
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(-300, -300, 3);
			fenster.draw();
		glPopMatrix();
		
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Rubin1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Rubin2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Rubin3);
			glMaterialf(GL_FRONT, GL_SHININESS, 20.8f);	
			drawDach_rechteSeite();
			drawDach_linkeSeite();
			drawSeite_Dachvorne();
		glPopMatrix();
	}
	
	public void mitTuereFenster(){
		
		glPushMatrix();
			fassade();
		glPopMatrix();
		
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(300, 300, 3);
			fenster.draw();
		glPopMatrix();
	
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(-300, 300, 3);
			fenster.draw();
		glPopMatrix();
	
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(300, -300, 3);
			fenster.draw();
		glPopMatrix();
	
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(-300, -300, 3);
			fenster.draw();
		glPopMatrix();
		
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Rubin1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Rubin2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Rubin3);
			glMaterialf(GL_FRONT, GL_SHININESS, 20.8f);	
			glTranslatef(0, -425, 3);
			tuere.draw();
		glPopMatrix();
		
		
	}
	
	public void nurFenster(){
		
		glPushMatrix();
			fassade();
		glPopMatrix();
		
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(300, 300, 3);
			fenster.draw();
		glPopMatrix();
		
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(-300, 300, 3);
			fenster.draw();
		glPopMatrix();
		
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(300, -300, 3);
			fenster.draw();
		glPopMatrix();
		
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(-300, -300, 3);
			fenster.draw();
		glPopMatrix();
		
		
	}


	private void fassade() {
		
		drawSeite_Haus(); // Vorderseite schwarz

		glPushMatrix();	
			glRotatef(90, 0, 1, 0);
			drawSeite_Haus(); // rechte Seite rot
		glPopMatrix();

		glPushMatrix();		
			glRotatef(180, 0, 1, 0);
			drawSeite_Haus(); // Rückseite grün
		glPopMatrix();

		glPushMatrix();		
			glRotatef(270, 0, 1, 0);
			drawSeite_Haus(); // linke Seite blau
		glPopMatrix();
		
		glPushMatrix();
			glRotatef(-90, 1, 0, 0);
			drawSeite_Haus(); // obere Seite gelb
		glPopMatrix();
	}

	private void drawSeite_Haus() {
		
		int m = 10, n = 5; // für Anzahl der Facetten
		float x_i, y_j, x_i_1, y_j_1; // Hilfsvariablen
		float xa = -550, xe = 550, ya = -550, ye = 550; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		float deltax = (xe - xa) / m, deltay = (ye - ya) / n; // Größe einer Facette
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				x_i = xa + i * deltax;
				x_i_1 = x_i + deltax;

				y_j = ya + j * deltay;
				y_j_1 = y_j + deltay;
				
				
				
				glBegin(GL_TRIANGLE_FAN);
					glNormal3f(0, 0, 1);// ij-te Facette zeichnen
					glVertex3f(x_i, y_j, 550);
					glNormal3f(0, 0, 1);
					glVertex3f(x_i_1, y_j, 550);
					glNormal3f(0, 0, 1);
					glVertex3f(x_i_1, y_j_1, 550);
					glNormal3f(0, 0, 1);
					glVertex3f(x_i, y_j_1, 550);
				glEnd();

			}
		}

	}
	private void drawSeite_Dachvorne() {
		
		
		int m = 4;
		int n = 3;
		float ul = 0f;
		float ur = 1f;
		float vl = 0;
		float vr = 1f;
		float ui, vj, ui_1, vj_1;
		float deltau = (ur - ul) / m;
		float deltav = (vr - vl) / n;
		
		for (int i = 0; i < m; i++) {
			ui = ul + deltau * i;
			ui_1 = ui + deltau;
			for (int j = 0; j < n; j++) {
				vj = vl + deltav * j;
				vj_1 = vj + deltav;

				glNormal3f(0, 0, 1);
				
				glBegin(GL_TRIANGLE_FAN);

					glVertex3f(x2(ui, vj), y2(ui, vj), z2(ui, vj));
					glVertex3f(x2(ui_1, vj), y2(ui_1, vj), z2(ui_1, vj));
					glVertex3f(x2(ui_1, vj_1), y2(ui_1, vj_1), z2(ui_1, vj_1));
					glVertex3f(x2(ui, vj_1), y2(ui, vj_1), z2(ui, vj_1));

				glEnd();
			}
		}
	

	}
	private float x2(float u, float v) {
		float xx = (float) (v*(-550+1100*u));
		return xx;
	}

	private float y2(float u, float v) {
		float yy = (float) (1000 - v * 450);
		return yy;
	}

	private float z2(float u, float v) {
		float zz = 550;
		return zz;
	}
	////////////////////////////////////// ab hier rechte dachseiite ///////////////////
	private void drawDach_rechteSeite() {
		
		int m = 4;
		int n = 3;
		float ul = 0f;
		float ur = 1f;
		float vl = 0;
		float vr = 1f;
		float ui, vj, ui_1, vj_1;
		float deltau = (ur - ul) / m;
		float deltav = (vr - vl) / n;
		
		for (int i = 0; i < m; i++) {
			ui = ul + deltau * i;
			ui_1 = ui + deltau;
			for (int j = 0; j < n; j++) {
				vj = vl + deltav * j;
				vj_1 = vj + deltav;

				
				glBegin(GL_TRIANGLE_FAN);

					glVertex3f(x(ui, vj), y(ui, vj), z(ui, vj));
					glVertex3f(x(ui_1, vj), y(ui_1, vj), z(ui_1, vj));
					glVertex3f(x(ui_1, vj_1), y(ui_1, vj_1), z(ui_1, vj_1));
					glVertex3f(x(ui, vj_1), y(ui, vj_1), z(ui, vj_1));

				glEnd();
			}
		}
	}

	private float x(float u, float v) {
		float xx = (float) (550 - v * 550);
		return xx;
	}

	private float y(float u, float v) {
		float yy = (float) (550 + v * 450);
		return yy;
	}

	private float z(float u, float v) {
		float zz = 550 - u * 1100;
		return zz;
	}
	
	///////////////////////////////////////////////// ab hier linke dachseite //////////////////////
	private void drawDach_linkeSeite() {
		
		int m = 4;
		int n = 3;
		float ul = 0f;
		float ur = 1f;
		float vl = 0;
		float vr = 1f;
		float ui, vj, ui_1, vj_1;
		float deltau = (ur - ul) / m;
		float deltav = (vr - vl) / n;
		
		for (int i = 0; i < m; i++) {
			ui = ul + deltau * i;
			ui_1 = ui + deltau;
			for (int j = 0; j < n; j++) {
				vj = vl + deltav * j;
				vj_1 = vj + deltav;

				
				glBegin(GL_TRIANGLE_FAN);

					glVertex3f(x1(ui, vj), y1(ui, vj), z1(ui, vj));
					glVertex3f(x1(ui_1, vj), y1(ui_1, vj), z1(ui_1, vj));
					glVertex3f(x1(ui_1, vj_1), y1(ui_1, vj_1), z1(ui_1, vj_1));
					glVertex3f(x1(ui, vj_1), y1(ui, vj_1), z1(ui, vj_1));

				glEnd();
			}
		}
	}

	private float x1(float u, float v) {
		float xx = (float) (-550 + v * 550);
		return xx;
	}

	private float y1(float u, float v) {
		float yy = (float) (550 + v * 450);
		return yy;
	}

	private float z1(float u, float v) {
		float zz = 550 - u * 1100;
		return zz;
	}
}
