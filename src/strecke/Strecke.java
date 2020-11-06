package strecke;

import static org.lwjgl.opengl.GL11.*;

public class Strecke {
	
	Gerade gerade	= new Gerade();
	Kurve kurve		= new Kurve();
	
	public void drawStrecke(){
		
		//1
		glPushMatrix();
			gerade.draw();
		glPopMatrix();
		
		//2
		glPushMatrix();
			glTranslatef(-1100, 0, -25000);
			glRotatef(90, 0, 1, 0);
			kurve.draw();
		glPopMatrix();
		
		//3
		glPushMatrix();
			glTranslatef(-26100, 0, -26100);
			glRotatef(90, 0, 1, 0);
			gerade.draw();
		glPopMatrix();
		
		//4
		glPushMatrix();
			glTranslatef(-51100, 0, -27200);
			glRotatef(270, 0, 1, 0);
			kurve.draw();
		glPopMatrix();
		
		//5
		glPushMatrix();
			glTranslatef(-52200, 0, -52200);
			gerade.draw();
		glPopMatrix();
		
		//6
		glPushMatrix();
			glTranslatef(-53300, 0, -77200);
			glRotatef(90, 0, 1, 0);
			kurve.draw();
		glPopMatrix();
		
		//7
		glPushMatrix();
			glTranslatef(-78300, 0, -78300);
			glRotatef(90, 0, 1, 0);
			gerade.draw();
		glPopMatrix();
		
		//8
		glPushMatrix();
			glTranslatef(-103300, 0, -77200);
			glRotatef(180, 0, 1, 0);
			kurve.draw();
		glPopMatrix();
		
		//9
		glPushMatrix();
			glTranslatef(-104400, 0, -26100);
			gerade.draw1();
		glPopMatrix();
		
		//10
		glPushMatrix();
			glTranslatef(-103300, 0, 25000);
			glRotatef(270, 0, 1, 0);
			kurve.draw();
		glPopMatrix();
		
		//11
		glPushMatrix();
			glTranslatef(-52200, 0, 26100);
			glRotatef(90, 0, 1, 0);
			gerade.draw1();
		glPopMatrix();
		
		//12
		glPushMatrix();
			glTranslatef(-1100, 0, 25000);
			kurve.draw();
		glPopMatrix();
	}
}
