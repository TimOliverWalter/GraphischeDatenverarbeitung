package wiese;

import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils; // to create a float buffer in place of the glfloat array

public class Wiese {

	private Wiese1 wiese1						= new Wiese1();
	
	
	float material_gruen1 [] = {0.02f, 0.17f, 0.02f, 0.05f};
	float material_gruen2 [] = {0.08f, 0.61f, 0.08f, 0.05f};
	float material_gruen3 [] = {0.63f, 0.73f, 0.63f, 0.05f};
		
		
	public void drawWiese(){
		
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_gruen1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_gruen2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_gruen3);
			glMaterialf(GL_FRONT, GL_SHININESS, 76.8f);
			wiese1.draw();
		glPopMatrix();
	}
}
