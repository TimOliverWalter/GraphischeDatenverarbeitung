package auto;

import static org.lwjgl.opengl.GL11.glColor3f;

import static org.lwjgl.opengl.GL11.glPopMatrix;
import static org.lwjgl.opengl.GL11.glPushMatrix;
import static org.lwjgl.opengl.GL11.glRotatef;
import static org.lwjgl.opengl.GL11.glTranslatef;


public class FensterfrontRechts {
		
	FensterfrontObjects basics = new FensterfrontObjects();
	
	
	public void drawFensterfrontRechts(){
		
		//A-Säule
		glPushMatrix();		
			glTranslatef(-10, 54.031f, 0);
			glRotatef(60, 0, 0, 1);			
			basics.drawASaeule();
		glPopMatrix();
		
		//Dachleiste
		glPushMatrix();		
			glTranslatef(-49.239f, 104.031f-10, 0);
			basics.drawDachleiste();
		glPopMatrix();
		
		//B-Säule 1
		glPushMatrix();	
			glTranslatef(140, 104.031f-10, 0);
			glRotatef(90, 0, 0, 1);
			basics.drawASaeule();
		glPopMatrix();
		
		//B-Säule 2
		glPushMatrix();	
			glTranslatef(260, 104.031f-10, 0);
			glRotatef(90, 0, 0, 1);
			basics.drawASaeule();
		glPopMatrix();
			
		//C-Säule
		glPushMatrix();		
			glTranslatef(391.5f-23, 104.031f+9, 0);
			glRotatef(100, 0, 0, 1);
			basics.drawCSaeule();
		glPopMatrix();
	}
}

