package parkbank;
import static org.lwjgl.opengl.GL11.*;

public class Parkbaenke {
	
	Parkbank parkbank = new Parkbank();
	
	public void draw(){
		parkbaenke();
	}

	private void parkbaenke(){
		//Erste Kurve
		glPushMatrix();
			glTranslatef(-200, 0, -28000);
			parkbank.drawParkbank();
		glPopMatrix();
		
		glPushMatrix();
			glTranslatef(1200, 0, -27400);
			glRotatef(280, 0, 1, 0);
			parkbank.drawParkbank();
		glPopMatrix();
		
		//Drittee Kurve
		glPushMatrix();
			glTranslatef(-51900, 0, -79800);
			parkbank.drawParkbank();
		glPopMatrix();
		
		glPushMatrix();
			glTranslatef(-51000, 0, -79800);
			glRotatef(280, 0, 1, 0);
			parkbank.drawParkbank();
		glPopMatrix();
		
		//Vietre Kurve
		glPushMatrix();
			glTranslatef(-105300, 0, -79600);
			parkbank.drawParkbank();
		glPopMatrix();
		
		glPushMatrix();
			glTranslatef(-105600, 0, -79000);
			glRotatef(100, 0, 1, 0);
			parkbank.drawParkbank();
		glPopMatrix();
		
		//Fünfte Kurve
		glPushMatrix();
			glTranslatef(-105200, 0, 27450);
			glRotatef(180, 0, 1, 0);
			parkbank.drawParkbank();
		glPopMatrix();
		
		glPushMatrix();
			glTranslatef(-106000, 0, 26700);
			glRotatef(90, 0, 1, 0);
			parkbank.drawParkbank();
		glPopMatrix();
		
		//Letzte Kurve
		glPushMatrix();
			glTranslatef(700, 0, 27500);
			glRotatef(180, 0, 1, 0);
			parkbank.drawParkbank();
		glPopMatrix();
	
		glPushMatrix();
			glTranslatef(1350, 0, 26200);
			glRotatef(270, 0, 1, 0);
			parkbank.drawParkbank();
		glPopMatrix();
		
	}
	
}
