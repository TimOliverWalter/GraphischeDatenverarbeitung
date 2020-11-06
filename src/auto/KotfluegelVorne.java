package auto;

import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils; // to create a float buffer in place of the glfloat array


public class KotfluegelVorne {
	
	KotfluegelObject objekt = new KotfluegelObject();
	MyObject viereck = new MyObject();
	
	public void drawKotfluegel(){
		
		glPushMatrix();
			glTranslatef(50, 0, 0);				
			objekt.drawKotfluegelDreieck();
		glPopMatrix();
		
		glPushMatrix();
			objekt.drawfacettiertesRechteck();
		glPopMatrix();
		
		glPushMatrix();
			glRotatef(180, 0, 1, 0);
			objekt.drawKotfluegelDreieck();
		glPopMatrix();
		
		glPushMatrix();
			glTranslatef(0, 0, 0);
			glRotatef(270, 1, 0, 0);
			objekt.drawSchutzblech1();
		glPopMatrix();
		
		glPushMatrix();
			glTranslatef(-50, -50, 0);
			glRotatef(45, 0, 0, 1);
			glRotatef(270, 1, 0, 0);
			objekt.drawSchutzblech2();
		glPopMatrix();
		
		glPushMatrix();
			glTranslatef(50, 0, 0);
			glRotatef(45, 0, 0, -1);
			glRotatef(270, 1, 0, 0);
			objekt.drawSchutzblech2();
		glPopMatrix();
		
			
	}

}


