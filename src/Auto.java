import auto.Sihlouette;

import static org.lwjgl.opengl.GL11.*;

public class Auto {

	Sihlouette auto = new Sihlouette();
	
	int displayList=-1;
	
	public void setDisplayList(int d){
		displayList = d;
	}
	
	public int getDisplayList(){
		return displayList;
	}
	
	public void auto(){
		
		glPushMatrix();
			glTranslatef(0, 200, 500);
			auto.draw();
		glPopMatrix();
	}
	
}
