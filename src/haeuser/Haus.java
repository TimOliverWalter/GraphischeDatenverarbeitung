package haeuser;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;

import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL20;



public class Haus {
	
	float material_Perle1 [] = {0.25f, 0.21f, 0.21f, 0.9f};
	float material_Perle2 [] = {0.99f, 0.83f, 0.83f, 0.9f};
	float material_Perle3 [] = {0.30f, 0.30f, 0.30f, 0.9f};
	
	float material_Gold1 [] = {0.25f, 0.22f, 0.06f, 1f};
	float material_Gold2 [] = {0.35f, 0.31f, 0.09f, 1f};
	float material_Gold3 [] = {0.80f, 0.72f, 0.21f, 1f};
	
	float material_Silber1 [] = {0.23f, 0.23f, 0.23f, 1.0f};
	float material_Silber2 [] = {0.28f, 0.28f, 0.28f, 1.0f};
	float material_Silber3 [] = {0.77f, 0.77f, 0.77f, 1.0f};
	
	Etage haus3 = new Etage();
	Etage haus2 = new Etage();
	Etage haus1 = new Etage();
	
	public void drawhaus(){
	
	glPushMatrix();
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Perle1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Perle2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Perle3);
		glMaterialf(GL_FRONT, GL_SHININESS, 11.3f);		
		haus1.mitTuereFensterDach();
	glPopMatrix();
	
	glPushMatrix();
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gold1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gold2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gold3);
		glMaterialf(GL_FRONT, GL_SHININESS, 83.2f);		
		glTranslatef(1100,0, 0);
		haus2.mitTuereFenster();
	glPopMatrix();
	
	glPushMatrix();
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gold1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gold2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gold3);
		glMaterialf(GL_FRONT, GL_SHININESS, 83.2f);		
		glTranslatef(1100, 1100, 0);
		haus2.nurFenster();
	glPopMatrix();
	
	glPushMatrix();
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gold1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gold2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gold3);
		glMaterialf(GL_FRONT, GL_SHININESS, 83.2f);		
		glTranslatef(1100, 2200, 0);
		haus2.mitDachFenster();
	glPopMatrix();
	
	glPushMatrix();
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Silber1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Silber2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Silber3);
		glMaterialf(GL_FRONT, GL_SHININESS, 89.6f);		
		glTranslatef(-1100,0, 0);
		haus3.mitTuereFenster();
	glPopMatrix();
	
	glPushMatrix();
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Silber1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Silber2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Silber3);
		glMaterialf(GL_FRONT, GL_SHININESS, 89.6f);		
		glTranslatef(-1100, 1100, 0);
		haus3.mitDachFenster();
	glPopMatrix();
	
	
	
	
	
	}
}