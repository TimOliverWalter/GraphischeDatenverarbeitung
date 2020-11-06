package strecke;

import static org.lwjgl.opengl.GL11.*;

public class Gerade {
	
	float material_Asphalt1 [] = {0.12f, 0.12f, 0.12f, 1.0f};
	float material_Asphalt2 [] = {0.01f, 0.01f, 0.01f, 1.0f};
	float material_Asphalt3 [] = {0.50f, 0.50f, 0.50f, 1.0f};
	
	float material_Beton1 [] = {0.52f, 0.52f, 0.52f, 1.0f};
	float material_Beton2 [] = {0.01f, 0.01f, 0.01f, 1.0f};
	float material_Beton3 [] = {0.50f, 0.50f, 0.50f, 1.0f};
	
	float material_polGold1 [] = {0.25f, 0.22f, 0.06f, 1.0f};
	float material_polGold2 [] = {0.35f, 0.31f, 0.09f, 1.0f};
	float material_polGold3 [] = {0.80f, 0.72f, 0.21f, 1.0f};
	
	Muenze muenze = new Muenze(); 
	
	public void draw(){
		
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Asphalt1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Asphalt2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Asphalt3);
		glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
		fahrbahn();	
		gehweg_Links();
		gehweg_Rechts();
		
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Beton1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Beton2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Beton3);
		glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
		bordstein_Links();		
		bordstein_Rechts();
		
		for(int i = 0; i < 10; i++){
			glPushMatrix();
				glMaterialf(GL_FRONT_AND_BACK, GL_SHININESS, 83.2f);
				glMaterialfv(GL_FRONT_AND_BACK, GL_AMBIENT, material_polGold1);
				glMaterialfv(GL_FRONT_AND_BACK, GL_DIFFUSE, material_polGold2);
				glMaterialfv(GL_FRONT_AND_BACK, GL_SPECULAR, material_polGold3);
				glTranslatef((float)(350 * Math.pow(-1, i%2)), 200, -i*5000+25000);
				muenze.drawMuenze();
			glPopMatrix();
		}
	}
	
	public void draw1(){
		
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Asphalt1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Asphalt2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Asphalt3);
		glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
		fahrbahn1();
		gehweg_Links1();
		gehweg_Rechts1();
		
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Beton1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Beton2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Beton3);
		glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);		
		bordstein_Links1();
		bordstein_Rechts1();
		
		for(int i = 0; i < 20; i++){
			glPushMatrix();
				glMaterialf(GL_FRONT_AND_BACK, GL_SHININESS, 83.2f);
				glMaterialfv(GL_FRONT_AND_BACK, GL_AMBIENT, material_polGold1);
				glMaterialfv(GL_FRONT_AND_BACK, GL_DIFFUSE, material_polGold2);
				glMaterialfv(GL_FRONT_AND_BACK, GL_SPECULAR, material_polGold3);
				glTranslatef((float)(350 * Math.pow(-1, i%2)), 200, -i*5000+51100);
				muenze.drawMuenze();
			glPopMatrix();
		}
	}
	
	
	private void fahrbahn() {
		
		int m = 50, n=50; // für Anzahl der Facetten
		float x_i, z_j, x_i_1, z_j_1;  // Hilfsvariablen
		float xa=-750, xe=750, za=25000, ze=-25000; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		float deltax=(xe-xa)/m, deltaz=(ze-za)/n; // Größe einer Facette

		for(int i=0;i<m;i++){
	      for(int j=0;j<n;j++){
	           x_i=xa+i*deltax;
	           x_i_1=x_i+deltax;

	           z_j=za+j*deltaz;
	           z_j_1=z_j+deltaz;
	           
	           

	           glBegin(GL_TRIANGLE_FAN);  // ij-te Facette zeichnen
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i,0, z_j);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i_1,0, z_j);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i_1,0, z_j_1);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i,0, z_j_1);
	           glEnd();

	            }
		    }
	
	}
	
	private void gehweg_Rechts() {
		
		int m = 50, n=50; // für Anzahl der Facetten
		float x_i, z_j, x_i_1, z_j_1;  // Hilfsvariablen
		float xa=750, xe=1100, za=25000, ze=-25000; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		float deltax=(xe-xa)/m, deltaz=(ze-za)/n; // Größe einer Facette

		for(int i=0;i<m;i++){
	      for(int j=0;j<n;j++){
	           x_i=xa+i*deltax;
	           x_i_1=x_i+deltax;

	           z_j=za+j*deltaz;
	           z_j_1=z_j+deltaz;
	           
	           

	           glBegin(GL_TRIANGLE_FAN);  // ij-te Facette zeichnen
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i,20, z_j);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i_1,20, z_j);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i_1,20, z_j_1);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i,20, z_j_1);
	           glEnd();

	            }
		    }
	
	}
	private void bordstein_Rechts() {
		
		int m = 50, n=50; // für Anzahl der Facetten
		float y_i, z_j, y_i_1, z_j_1;  // Hilfsvariablen
		float ya=0, ye=20, za=25000, ze=-25000; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		float deltay=(ye-ya)/m, deltaz=(ze-za)/n; // Größe einer Facette

		for(int i=0;i<m;i++){
	      for(int j=0;j<n;j++){
	           y_i=ya+i*deltay;
	           y_i_1=y_i+deltay;

	           z_j=za+j*deltaz;
	           z_j_1=z_j+deltaz;
	           
	           

	           glBegin(GL_TRIANGLE_FAN);  // ij-te Facette zeichnen
	             glNormal3f(1, 0, 0);
	             glVertex3f(750,y_i, z_j);
	             glNormal3f(1, 0, 0);
	             glVertex3f(750,y_i_1, z_j);
	             glNormal3f(1, 0, 0);
	             glVertex3f(750,y_i_1, z_j_1);
	             glNormal3f(1, 0, 0);
	             glVertex3f(750,y_i, z_j_1);
	           glEnd();

	            }
		    }
	
	}
	
	private void gehweg_Links() {
		
		int m = 50, n=50; // für Anzahl der Facetten
		float x_i, z_j, x_i_1, z_j_1;  // Hilfsvariablen
		float xa=-750, xe=-1100, za=25000, ze=-25000; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		float deltax=(xe-xa)/m, deltaz=(ze-za)/n; // Größe einer Facette

		for(int i=0;i<m;i++){
	      for(int j=0;j<n;j++){
	           x_i=xa+i*deltax;
	           x_i_1=x_i+deltax;

	           z_j=za+j*deltaz;
	           z_j_1=z_j+deltaz;
	           

	           glBegin(GL_TRIANGLE_FAN);  // ij-te Facette zeichnen
	           	 glNormal3f(0, 1, 0);
	             glVertex3f(x_i,20, z_j);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i_1,20, z_j);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i_1,20, z_j_1);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i,20, z_j_1);
	           glEnd();

	            }
		    }
	
	}
	
	private void bordstein_Links() {
		
		int m = 50, n=50; // für Anzahl der Facetten
		float y_i, z_j, y_i_1, z_j_1;  // Hilfsvariablen
		float ya=0, ye=20, za=25000, ze=-25000; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		float deltay=(ye-ya)/m, deltaz=(ze-za)/n; // Größe einer Facette

		for(int i=0;i<m;i++){
	      for(int j=0;j<n;j++){
	           y_i=ya+i*deltay;
	           y_i_1=y_i+deltay;

	           z_j=za+j*deltaz;
	           z_j_1=z_j+deltaz;
	           
	           

	           glBegin(GL_TRIANGLE_FAN);  // ij-te Facette zeichnen
	             glNormal3f(1, 0, 0);
	             glVertex3f(-750,y_i, z_j);
	             glNormal3f(1, 0, 0);
	             glVertex3f(-750,y_i_1, z_j);
	             glNormal3f(1, 0, 0);
	             glVertex3f(-750,y_i_1, z_j_1);
	             glNormal3f(1, 0, 0);
	             glVertex3f(-750,y_i, z_j_1);
	           glEnd();

	            }
		    }
	
	}
	
	private void fahrbahn1() {
		
		int m = 50, n=50; // für Anzahl der Facetten
		float x_i, z_j, x_i_1, z_j_1;  // Hilfsvariablen
		float xa=-750, xe=750, za=51100, ze=-51100; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		float deltax=(xe-xa)/m, deltaz=(ze-za)/n; // Größe einer Facette

		for(int i=0;i<m;i++){
	      for(int j=0;j<n;j++){
	           x_i=xa+i*deltax;
	           x_i_1=x_i+deltax;

	           z_j=za+j*deltaz;
	           z_j_1=z_j+deltaz;
	           
	           

	           glBegin(GL_TRIANGLE_FAN);  // ij-te Facette zeichnen
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i,0, z_j);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i_1,0, z_j);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i_1,0, z_j_1);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i,0, z_j_1);
	           glEnd();

	            }
		    }
	
	}
	
	private void gehweg_Rechts1() {
		
		int m = 50, n=50; // für Anzahl der Facetten
		float x_i, z_j, x_i_1, z_j_1;  // Hilfsvariablen
		float xa=750, xe=1100, za=51100, ze=-51100; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		float deltax=(xe-xa)/m, deltaz=(ze-za)/n; // Größe einer Facette

		for(int i=0;i<m;i++){
	      for(int j=0;j<n;j++){
	           x_i=xa+i*deltax;
	           x_i_1=x_i+deltax;

	           z_j=za+j*deltaz;
	           z_j_1=z_j+deltaz;
	           
	           

	           glBegin(GL_TRIANGLE_FAN);  // ij-te Facette zeichnen
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i,20, z_j);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i_1,20, z_j);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i_1,20, z_j_1);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i,20, z_j_1);
	           glEnd();

	            }
		    }
	
	}
	private void bordstein_Rechts1() {
		
		int m = 50, n=50; // für Anzahl der Facetten
		float y_i, z_j, y_i_1, z_j_1;  // Hilfsvariablen
		float ya=0, ye=20, za=51100, ze=-51100; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		float deltay=(ye-ya)/m, deltaz=(ze-za)/n; // Größe einer Facette

		for(int i=0;i<m;i++){
	      for(int j=0;j<n;j++){
	           y_i=ya+i*deltay;
	           y_i_1=y_i+deltay;

	           z_j=za+j*deltaz;
	           z_j_1=z_j+deltaz;
	           
	           

	           glBegin(GL_TRIANGLE_FAN);  // ij-te Facette zeichnen
	             glNormal3f(1, 0, 0);
	             glVertex3f(750,y_i, z_j);
	             glNormal3f(1, 0, 0);
	             glVertex3f(750,y_i_1, z_j);
	             glNormal3f(1, 0, 0);
	             glVertex3f(750,y_i_1, z_j_1);
	             glNormal3f(1, 0, 0);
	             glVertex3f(750,y_i, z_j_1);
	           glEnd();

	            }
		    }
	
	}
	
	private void gehweg_Links1() {
		
		int m = 50, n=50; // für Anzahl der Facetten
		float x_i, z_j, x_i_1, z_j_1;  // Hilfsvariablen
		float xa=-750, xe=-1100, za=51100, ze=-51100; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		float deltax=(xe-xa)/m, deltaz=(ze-za)/n; // Größe einer Facette

		for(int i=0;i<m;i++){
	      for(int j=0;j<n;j++){
	           x_i=xa+i*deltax;
	           x_i_1=x_i+deltax;

	           z_j=za+j*deltaz;
	           z_j_1=z_j+deltaz;
	           
	           

	           glBegin(GL_TRIANGLE_FAN);  // ij-te Facette zeichnen
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i,20, z_j);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i_1,20, z_j);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i_1,20, z_j_1);
	             glNormal3f(0, 1, 0);
	             glVertex3f(x_i,20, z_j_1);
	           glEnd();

	            }
		    }
	
	}
	
	private void bordstein_Links1() {
		
		int m = 50, n=50; // für Anzahl der Facetten
		float y_i, z_j, y_i_1, z_j_1;  // Hilfsvariablen
		float ya=0, ye=20, za=51100, ze=-51100; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		float deltay=(ye-ya)/m, deltaz=(ze-za)/n; // Größe einer Facette

		for(int i=0;i<m;i++){
	      for(int j=0;j<n;j++){
	           y_i=ya+i*deltay;
	           y_i_1=y_i+deltay;

	           z_j=za+j*deltaz;
	           z_j_1=z_j+deltaz;
	           
	           glNormal3f(1, 0, 0);

	           glBegin(GL_TRIANGLE_FAN);  // ij-te Facette zeichnen
	             glNormal3f(1, 0, 0);
	             glVertex3f(-750,y_i, z_j);
	             glNormal3f(1, 0, 0);
	             glVertex3f(-750,y_i_1, z_j);
	             glNormal3f(1, 0, 0);
	             glVertex3f(-750,y_i_1, z_j_1);
	             glNormal3f(1, 0, 0);
	             glVertex3f(-750,y_i, z_j_1);
	           glEnd();

	            }
		    }
	
	}
	
}
