package parkbank;

import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils; // to create a float buffer in place of the glfloat array

public class Parkbank {
	
	private Sitz1 sitz1							= new Sitz1();
	private Sitz2 sitz2							= new Sitz2();
	private Sitz3 sitz3							= new Sitz3();
	private Beine beine							= new Beine();
	private Lehne1 lehne1						= new Lehne1();
	private Lehne2 lehne2						= new Lehne2();
	private Lehne3 lehne3						= new Lehne3();
	private Lehnegestell lehnegestell			= new Lehnegestell();
	
	float material_Plastik1 [] = {0.0f, 0.0f, 0.0f, 1.0f};
	float material_Plastik2 [] = {0.01f, 0.01f, 0.01f, 1.0f};
	float material_Plastik3 [] = {0.50f, 0.50f, 0.50f, 1.0f};
	
	float material_braun1 [] = {0.55f, 0.27f, 0.07f, 1.0f};
	float material_braun2 [] = {0.40f, 0.74f, 0.69f, 0.8f};
	float material_braun3 [] = {0.30f, 0.31f, 0.31f, 1.0f};
	
	
	public void drawParkbank(){
		glPushMatrix();
			//Sitze & Beine
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_braun1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_braun2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_braun3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			sitz1.drawsitz1();
			sitz2.drawsitz2();
			sitz3.drawsitz3();
			beine.drawbeine();
			lehne1.drawlehne1();
			lehne2.drawlehne2();
			lehne3.drawlehne3();
			
			//Lehnen
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Plastik1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Plastik2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Plastik3);
			glMaterialf(GL_FRONT, GL_SHININESS, 32.0f);			
			lehnegestell.drawlehnegestell();
		glPopMatrix();
	}

}
