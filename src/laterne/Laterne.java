package laterne;

import static org.lwjgl.opengl.GL11.*;


public class Laterne {
	
	LaterneObject object = new LaterneObject();
	
	float material_polSilber1 [] = {0.23f, 0.23f, 0.23f, 1.0f};
	float material_polSilber2 [] = {0.28f, 0.28f, 0.28f, 1.0f};
	float material_polSilber3 [] = {0.77f, 0.77f, 0.77f, 1.0f};
	
	float Emission_licht [] = {1, 1, 1, 1};
	float Emission_aus [] = {0, 0, 0, 1};
	
	public void drawLaterne(){
	
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_polSilber1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_polSilber2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_polSilber3);
			glMaterialf(GL_FRONT, GL_SHININESS, 89.6f);
			glRotatef(90, -1, 0, 0);
			object.drawZylinder();
		glPopMatrix();
		
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_polSilber1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_polSilber2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_polSilber3);
			glMaterialf(GL_FRONT, GL_SHININESS, 89.6f);
			glRotatef(90, -1, 0, 0);
			glTranslatef(0, -20, 520);
			object.drawLaternenKopf();
		glPopMatrix();
		
		glPushMatrix();
			glMaterialfv(GL_FRONT_AND_BACK, GL_AMBIENT, material_polSilber1);
			glMaterialfv(GL_FRONT_AND_BACK, GL_EMISSION, Emission_licht);
			glRotatef(90, -1, 0, 0);
			glTranslatef(0, -20, 500);
			object.drawfacettiertesRechteck();
			glMaterialfv(GL_FRONT_AND_BACK, GL_EMISSION, Emission_aus);
		glPopMatrix();
	
	}

}
