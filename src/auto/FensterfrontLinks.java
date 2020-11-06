package auto;

import static org.lwjgl.opengl.GL11.*;

public class FensterfrontLinks {
	
	FensterfrontObjects basics = new FensterfrontObjects();
	
	float material_Tuerkis1 [] = {0.10f, 0.19f, 0.17f, 0.8f};
	float material_Tuerkis2 [] = {0.40f, 0.74f, 0.69f, 0.8f};
	float material_Tuerkis3 [] = {0.30f, 0.31f, 0.31f, 0.8f};
	
	float material_Plastik1 [] = {0.0f, 0.0f, 0.0f, 1.0f};
	float material_Plastik2 [] = {0.01f, 0.01f, 0.01f, 1.0f};
	float material_Plastik3 [] = {0.50f, 0.50f, 0.50f, 1.0f};
	
	public void drawFensterfrontLinks(){
		
		//A-Säule Seite
		glPushMatrix();	
			glTranslatef(-10, 54.031f, -0.1f);
			glRotatef(60, 0, 0, 1);			
			basics.drawASaeule();
		glPopMatrix();
		
		//A-Säule Front Links
		glPushMatrix();	
			glTranslatef(-105.58f, 110, -109.05f);
			glRotatef(90, 1, 0, 0);	
			glRotatef(60, 0, 1, 0);			
			basics.drawASaeule();
		glPopMatrix();
		
		//A-Säule Front Rechts
		glPushMatrix();	
			glTranslatef(-105.58f, 110, -300.5f);
			glRotatef(90, 1, 0, 0);	
			glRotatef(60, 0, 1, 0);			
			basics.drawASaeule();
		glPopMatrix();

		//Dachleiste links
		glPushMatrix();	
			glTranslatef(-49.239f, 104.031f-10, 0);
			basics.drawDachleiste();
		glPopMatrix();
		
		//Dachleiste Vorne
		glPushMatrix();
			glTranslatef(-105.88f, 109.031f, 0);
			glRotatef(90, 0, 1, 0);
			glRotatef(30, 1, 0, 0);
			basics.drawDachleisteVorne();
		glPopMatrix();

		//Dachleiste hinten oben
		glPushMatrix();	
			glTranslatef(270, 97.031f, 0);
			glRotatef(90, 0, 1, 0);
			glRotatef(-10, 1, 0, 0);
			basics.drawDachleisteVorne();
		glPopMatrix();
		
		//Dachleiste hinten unten
		glPushMatrix();	
			glTranslatef(286, 0, 0);
			glRotatef(90, 0, 1, 0);
			glRotatef(-10, 1, 0, 0);
			basics.drawDachleisteVorne();
		glPopMatrix();
		
		//B-Säule 1
		glPushMatrix();				
			glTranslatef(140, 104.031f-10, -0.1f);
			glRotatef(90, 0, 0, 1);
			basics.drawASaeule();
		glPopMatrix();
		
		//B-Säule 2
		glPushMatrix();	
			glTranslatef(260, 104.031f-10, -0.1f);
			glRotatef(90, 0, 0, 1);
			basics.drawASaeule();
		glPopMatrix();
			
		//C-Säule Seite
		glPushMatrix();		
			glTranslatef(391.5f-23, 104.031f+9, 0);
			glRotatef(100, 0, 0, 1);
			basics.drawCSaeule();
		glPopMatrix();
		
		//C-Säule links
		glPushMatrix();		
			glTranslatef(270, 95, -110);
			glRotatef(90, 1, 0, 0);	
			glRotatef(100, 0, 1, 0);	
			basics.drawCSaeule();
		glPopMatrix();
		
		//C-Säule rechts
		glPushMatrix();		
			glTranslatef(270, 95, -300);
			glRotatef(90, 1, 0, 0);	
			glRotatef(100, 0, 1, 0);
			basics.drawCSaeule();
		glPopMatrix();
		
		//Fenster links
		glPushMatrix();		
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(-50, 100, -0.11f);
			basics.drawFensterMitte();
		glPopMatrix();
		
		//Fenster rechts
		glPushMatrix();		
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(-50, 100, -199.89f);
			basics.drawFensterMitte();
		glPopMatrix();
		
		//Fenster Dreieck vorne rechts
		glPushMatrix();		
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(-100, 100, -199.89f);
			basics.drawFensterDreieckVorne();
		glPopMatrix();
		
		//Fenster Dreieck vorne links
		glPushMatrix();		
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(-100, 100, -0.11f);
			basics.drawFensterDreieckVorne();
		glPopMatrix();
		
		//Fenster Dreieck hinten links
		glPushMatrix();		
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(260, 100, -0.11f);			
			basics.drawFensterDreieckHinten();
		glPopMatrix();
		
		//Fenster Dreieck hinten rechts
		glPushMatrix();		
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(260, 100, -199.89f);			
			basics.drawFensterDreieckHinten();
		glPopMatrix();
		
	}
}
