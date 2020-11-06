package bushaeuschen;

import static org.lwjgl.opengl.GL11.*;

public class Bushaeuser {
	
	Bushaeuschen bushaeuschen = new Bushaeuschen();
	
	public void draw(){
		bushaeuser();
	}

	private void bushaeuser(){
		
		//1
		for(int i=0;i<4;i++){
			glPushMatrix();
				glRotatef(90, 0, 1, 0);
				glTranslatef(24000-i*15800, 20, -1300);
				bushaeuschen.drawBushaeuschen();
			glPopMatrix();
		}
		//3		
		glPushMatrix();
			glRotatef(180, 0, 1, 0);
			glTranslatef(24650, 20, 24800);
			bushaeuschen.drawBushaeuschen();
		glPopMatrix();
		
		//5
		glPushMatrix();
			glRotatef(90, 0, 1, 0);
			glTranslatef(51850, 20, -53500);
			bushaeuschen.drawBushaeuschen();
		glPopMatrix();
		
		//7
		glPushMatrix();
			glRotatef(180, 0, 1, 0);
			glTranslatef(77950, 20, 77000);
			bushaeuschen.drawBushaeuschen();
		glPopMatrix();
		
		//9
		glPushMatrix();
			glRotatef(270, 0, 1, 0);
			glTranslatef(-51850, 20, 103100);
			bushaeuschen.drawBushaeuschen();
		glPopMatrix();
		
		glPushMatrix();
			glRotatef(270, 0, 1, 0);
			glTranslatef(0, 20, 103100);
			bushaeuschen.drawBushaeuschen();
		glPopMatrix();
		
		//9
		glPushMatrix();
			glTranslatef(-78300, 20, 24800);
			bushaeuschen.drawBushaeuschen();
		glPopMatrix();
		
		glPushMatrix();
			glTranslatef(-26100, 20, 24800);
			bushaeuschen.drawBushaeuschen();
		glPopMatrix();

	}
}
