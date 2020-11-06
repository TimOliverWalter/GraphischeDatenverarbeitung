package baum;

import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils; // to create a float buffer in place of the glfloat array

public class Baum {
	
	private Baumstamm baumstamm 				= new Baumstamm(); 
	private Baumkrone baumkrone 				= new Baumkrone();
	
	float material_gruen1 [] = {0.02f, 0.17f, 0.02f, 0.05f};
	float material_gruen2 [] = {0.08f, 0.61f, 0.08f, 0.05f};
	float material_gruen3 [] = {0.63f, 0.73f, 0.63f, 0.05f};
	
	float material_braun1 [] = {0.55f, 0.27f, 0.07f, 1.0f};
	float material_braun2 [] = {0.40f, 0.74f, 0.69f, 0.8f};
	float material_braun3 [] = {0.30f, 0.31f, 0.31f, 1.0f};
	
	public void drawBaum(){
	
		
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_braun1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_braun2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_braun3);
			glMaterialf(GL_FRONT, GL_SHININESS, 76.8f);
			baumstamm.drawBaumstamm();
			
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_gruen1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_gruen2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_gruen3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(0, 750, 0);
			baumkrone.drawBaumkrone();
		glPopMatrix();
	}
}
