package auto;


import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils; // to create a float buffer in place of the glfloat array



public class Rad {
	
	Reifen reifen = new Reifen();

	
	float material_Gummi1 [] = {0.02f, 0.02f, 0.02f, 1.0f};
	float material_Gummi2 [] = {0.01f, 0.01f, 0.01f, 1.0f};
	float material_Gummi3 [] = {0.40f, 0.40f, 0.40f, 1.0f};
	
	float material_Plastik1 [] = {0.0f, 0.0f, 0.0f, 1.0f};
	float material_Plastik2 [] = {0.01f, 0.01f, 0.01f, 1.0f};
	float material_Plastik3 [] = {0.50f, 0.50f, 0.50f, 1.0f};
	
	float material_polSilber1 [] = {0.23f, 0.23f, 0.23f, 1.0f};
	float material_polSilber2 [] = {0.28f, 0.28f, 0.28f, 1.0f};
	float material_polSilber3 [] = {0.77f, 0.77f, 0.77f, 1.0f};
	
	int n = 10;
	int m = 10;
	
	public void drawRad(){
		
		//Reifen
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gummi1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gummi2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gummi3);
			glMaterialf(GL_FRONT, GL_SHININESS, 10.0f);
			reifen.drawReifen();
		glPopMatrix();
		
		//Reifenseite
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gummi1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gummi2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gummi3);
			glMaterialf(GL_FRONT, GL_SHININESS, 10.0f);
			glRotatef(90, 1, 0, 0);
			reifen.drawReifenSeite();
		glPopMatrix();
		
		//Reifenseite
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gummi1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gummi2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gummi3);
			glMaterialf(GL_FRONT, GL_SHININESS, 10.0f);
			glTranslatef(0, 0, 45);
			glRotatef(90, 1, 0, 0);
			reifen.drawReifenSeite();
		glPopMatrix();
		
		//Felge
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_polSilber1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_polSilber2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_polSilber3);
			glMaterialf(GL_FRONT, GL_SHININESS, 89.6f);
			glTranslatef(0, 0, 50.5f);
			glRotatef(90, 1, 0, 0);			
			reifen.drawScheibe();
		glPopMatrix();
		
		//Radnabe
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Plastik1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Plastik2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Plastik3);
			glMaterialf(GL_FRONT, GL_SHININESS, 32.0f);
			glTranslatef(0,0,51);
			glRotatef(90, 1, 0, 0);	
			reifen.drawNabe();
		glPopMatrix();
		
		
	}
}
