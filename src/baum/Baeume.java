package baum;
import static org.lwjgl.opengl.GL11.*;

public class Baeume {
	
	Baum baum = new Baum();
	
	public void draw(){
		baeume();
	}
	
	private void baeume(){
		// Erste Kurve
		glPushMatrix();
			glTranslatef(1500, 0, -26000);
			baum.drawBaum();
		glPopMatrix();

		glPushMatrix();
			glTranslatef(1500, 0, -27400);
			baum.drawBaum();
		glPopMatrix();

		glPushMatrix();
			glTranslatef(1050, 0, -28400);
			baum.drawBaum();
		glPopMatrix();

		glPushMatrix();
			glTranslatef(300, 0, -28800);
			baum.drawBaum();
		glPopMatrix();

		glPushMatrix();
			glTranslatef(-800, 0, -28500);
			baum.drawBaum();
		glPopMatrix();

		// Dritte Kurve
		glPushMatrix();
			glTranslatef(-105800, 0, -78200);
			baum.drawBaum();
		glPopMatrix();

		glPushMatrix();
			glTranslatef(-106400, 0, -79200);
			baum.drawBaum();
		glPopMatrix();

		glPushMatrix();
			glTranslatef(-106000, 0, -80400);
			baum.drawBaum();
		glPopMatrix();

		glPushMatrix();
			glTranslatef(-104700, 0, -80000);
			baum.drawBaum();
		glPopMatrix();

		glPushMatrix();
			glTranslatef(-103600, 0, -80200);
			baum.drawBaum();
		glPopMatrix();

		// letzte Kurve
		glPushMatrix();
			glTranslatef(1500, 0, 25800);
			baum.drawBaum();
		glPopMatrix();

		glPushMatrix();
			glTranslatef(1150, 0, 26900);
			baum.drawBaum();
		glPopMatrix();

		glPushMatrix();
			glTranslatef(700, 0, 27800);
			baum.drawBaum();
		glPopMatrix();

		glPushMatrix();
			glTranslatef(-300, 0, 27600);
			baum.drawBaum();
		glPopMatrix();

		// Wald
		// horizonzal 1
		// 1
		for (int i = 0; i < 2; i++) {
			glPushMatrix();
				glTranslatef(-66500 - i * 24000, 0, -74600);
				baum.drawBaum();
			glPopMatrix();
		}
		// 2
		for (int i = 0; i < 2; i++) {
			glPushMatrix();
				glTranslatef(-66500 - i * 24000, 0, -50600);
				baum.drawBaum();
			glPopMatrix();
		}
		// 3
		for (int i = 0; i < 2; i++) {
			glPushMatrix();
				glTranslatef(-66500 - i * 24000, 0, -26600);
				baum.drawBaum();
			glPopMatrix();
		}
		// horizonzal 2
		// 1
		for (int i = 0; i < 3; i++) {
			glPushMatrix();
				glTranslatef(-54500 - i * 24000, 0, -62600);
				baum.drawBaum();
			glPopMatrix();
		}
		// 2
		for (int i = 0; i < 3; i++) {
			glPushMatrix();
				glTranslatef(-54500 - i * 24000, 0, -38600);
				baum.drawBaum();
			glPopMatrix();
		}
		// 3
		for (int i = 0; i < 2; i++) {
			glPushMatrix();
				glTranslatef(-78500 - i * 24000, 0, -14600);
				baum.drawBaum();
			glPopMatrix();
		}
	}
}
