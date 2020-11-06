package laterne;

import static org.lwjgl.opengl.GL11.*;

public class Laternen {
	
	Laterne laterne = new Laterne();
	
	public void draw(){
		laternen();
	}
	
	private void laternen(){
		
		for(int i=0;i<6;i++){
			glPushMatrix();
				glTranslatef(-1200, 20, -24900+i*9700);
				glRotatef(270, 0, 1, 0);
				laterne.drawLaterne();
			glPopMatrix();
		}
		
		for(int i=0; i<6; i++){
			glPushMatrix();
				glTranslatef(-1800-i*9700, 20, -24900);
				laterne.drawLaterne();
			glPopMatrix();
		}
		
		for(int i=0; i<6; i++){
			glPushMatrix();
				glTranslatef(-53400, 20, -27800-i*9700);
				glRotatef(270, 0, 1, 0);
				laterne.drawLaterne();
			glPopMatrix();
		}
		
		for(int i=0; i<6; i++){
			glPushMatrix();
				glTranslatef(-54200-i*9700, 20, -77100);
				laterne.drawLaterne();
			glPopMatrix();
		}
		
		for(int i=0; i<11; i++){
			glPushMatrix();
				glTranslatef(-103200, 20, -75700+i*9700);
				glRotatef(90, 0, 1, 0);
				laterne.drawLaterne();
			glPopMatrix();
		}
		
		for(int i=0; i<11; i++){
			glPushMatrix();
				glTranslatef(-1800-i*9700, 20, 24900);
				glRotatef(180, 0, 1, 0);
				laterne.drawLaterne();
			glPopMatrix();
		}
	}
}
