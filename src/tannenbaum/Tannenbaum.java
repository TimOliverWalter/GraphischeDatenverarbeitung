package tannenbaum;

import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils; // to create a float buffer in place of the glfloat array

public class Tannenbaum {
	
	private Tanne tanne				= new Tanne();
	private Tannenstamm tannenstamm	= new Tannenstamm();
	
	float material_dunklesGruen1 [] = {0.02f, 0.17f, 0.02f, 0.05f};
	float material_dunklesGruen2 [] = {0.08f, 0.61f, 0.08f, 0.05f};
	float material_dunklesGruen3 [] = {0.63f, 0.73f, 0.63f, 0.05f};
	
	float material_dunklesbraun1 [] = {0.65f, 0.5f, 0.03f, 1.0f};
	float material_dunklesbraun2 [] = {0.40f, 0.74f, 0.69f, 0.8f};
	float material_dunklesbraun3 [] = {0.30f, 0.31f, 0.31f, 1.0f};
	
	public void drawTannenbaum(){
		
		
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_dunklesGruen1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_dunklesGruen2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_dunklesGruen3);
			glMaterialf(GL_FRONT, GL_SHININESS, 76.8f);
			tanne.drawTanne();
		glPopMatrix();
		
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_dunklesbraun1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_dunklesbraun2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_dunklesbraun3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			tannenstamm.drawTannenstamm();
		glPopMatrix();
	}

}
