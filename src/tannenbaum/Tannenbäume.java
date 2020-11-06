package tannenbaum;

import static org.lwjgl.opengl.GL11.*;

public class Tannenbäume {
	
	Tannenbaum tannenbaum = new Tannenbaum();
	
	public void draw(){
		tannenbäume();
	}
	
	private void tannenbäume(){
		
		// Dritte Kurve
		glPushMatrix();
			glTranslatef(-50900, 0, -78800);
			tannenbaum.drawTannenbaum();
		glPopMatrix();
		
		glPushMatrix();
			glTranslatef(-51400, 0, -79800);
			tannenbaum.drawTannenbaum();
		glPopMatrix();
		
		glPushMatrix();
			glTranslatef(-52400, 0, -80000);
			tannenbaum.drawTannenbaum();
		glPopMatrix();
		
		//Fünfte Kurve 
		glPushMatrix();
			glTranslatef(-105900, 0, 25800);
			tannenbaum.drawTannenbaum();
		glPopMatrix();
		
		glPushMatrix();
			glTranslatef(-105800, 0, 27000);
			tannenbaum.drawTannenbaum();
		glPopMatrix();
		
		glPushMatrix();
			glTranslatef(-105000, 0, 27800);
			tannenbaum.drawTannenbaum();
		glPopMatrix();
		
		glPushMatrix();
			glTranslatef(-104000, 0, 28000);
			tannenbaum.drawTannenbaum();
		glPopMatrix();
		
		
		// Wald
		// horizonzal 1
		// 1
		for (int i = 0; i < 3; i++) {
			glPushMatrix();
				glTranslatef(-54500 - i * 24000, 0, -74600);
				tannenbaum.drawTannenbaum();
			glPopMatrix();
		}
		
		// 2
		for (int i = 0; i < 3; i++) {
			glPushMatrix();
				glTranslatef(-54500 - i * 24000, 0, -50600);
				tannenbaum.drawTannenbaum();
			glPopMatrix();
		}
		
		// 3
		for (int i = 0; i < 3; i++) {
			glPushMatrix();
				glTranslatef(-54500 - i * 24000, 0, -26600);
				tannenbaum.drawTannenbaum();
			glPopMatrix();
		}
		// horizonzal 2
		// 1
		for (int i = 0; i < 2; i++) {
			glPushMatrix();
				glTranslatef(-66500 - i * 24000, 0, -62600);
				tannenbaum.drawTannenbaum();
			glPopMatrix();
		}
		
		// 2
		for (int i = 0; i < 2; i++) {
			glPushMatrix();
				glTranslatef(-66500 - i * 24000, 0, -38600);
				tannenbaum.drawTannenbaum();
			glPopMatrix();
		}
		
		// 3
		for (int i = 0; i < 2; i++) {
			glPushMatrix();
				glTranslatef(-66500 - i * 24000, 0, -14600);
				tannenbaum.drawTannenbaum();
			glPopMatrix();
		}
	}

}
