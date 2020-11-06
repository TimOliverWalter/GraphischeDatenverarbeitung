package haeuser;
import static org.lwjgl.opengl.GL11.*;

public class Haeuser {
	
	Haus haus = new Haus();
	
	public void draw(){
		
	haeuser_Abschnitt1();
	haeuser_Abschnitt2();
	haeuser_Abschnitt3();
	haeuser_Abschnitt4();
	haeuser_Abschnitt5();
	haeuser_Abschnitt6();
	
	}
	
	private void haeuser_Abschnitt1(){
		
		for(int i=0;i<15;i++){
			glPushMatrix();
				glRotatef(270, 0, 1, 0);
				glTranslatef(-23100 + i * 3300, 570, -1650);
				haus.drawhaus();
			glPopMatrix();
		}
	}
	
	private void haeuser_Abschnitt2(){
		
		for(int i=0; i<15;i++){
			glPushMatrix();
				glTranslatef(-3250-i*3300, 570, -27750);
				haus.drawhaus();
			glPopMatrix();
		}

	}
	
	private void haeuser_Abschnitt3(){
		
		for(int i=0;i<15;i++){
			glPushMatrix();
				glRotatef(270, 0, 1, 0);
				glTranslatef(-29950 -i*3300, 570, 50550);
				haus.drawhaus();
			glPopMatrix();
		}
	}
	
	private void haeuser_Abschnitt4(){
		
		for(int i=0; i<15;i++){
			glPushMatrix();
				glTranslatef(-55000-i*3300, 570, -79950);
				haus.drawhaus();
			glPopMatrix();
		}
	}
	
	private void haeuser_Abschnitt5(){
		
		for(int i=0;i<31;i++){
			glPushMatrix();
				glRotatef(90, 0, 1, 0);
				glTranslatef(75550-i*3300, 570, -106050);
				haus.drawhaus();
			glPopMatrix();
		}
	}
	
	private void haeuser_Abschnitt6(){
		
		for(int i=0;i<31;i++){
			glPushMatrix();
				glRotatef(180, 0, 1, 0);
				glTranslatef(2650+i*3300, 570, -27750);
				haus.drawhaus();
			glPopMatrix();
		}
	}
}
