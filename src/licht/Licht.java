package licht;

import static org.lwjgl.opengl.GL11.*;

public class Licht {

	
	

	
	public void scheinwerferLinks(){
		float licht2_position [] = {-100.0f, 0.0f, 0.0f, 1.0f};
		float licht2_ambient [] = {1.0f, 1.0f, 1.0f, 1.0f};
		float licht2_diffus [] = {1.0f, 1.0f, 1.0f, 1.0f};
		float licht2_specular [] = {1.0f, 1.0f, 1.0f, 1.0f};
		float licht2_direction [] = {0.0f, -0.4f, -1.0f, 1.0f};
		
		glLightfv(GL_LIGHT2, GL_POSITION, licht2_position);
		glLightfv(GL_LIGHT2, GL_AMBIENT, licht2_ambient);
		glLightfv(GL_LIGHT2, GL_DIFFUSE, licht2_diffus);
		glLightfv(GL_LIGHT2, GL_SPECULAR, licht2_specular);
		glLightfv(GL_LIGHT2, GL_SPOT_DIRECTION, licht2_direction);
		
		glLightf(GL_LIGHT2, GL_SPOT_CUTOFF, 90.0f);
		glLightf(GL_LIGHT2, GL_SPOT_EXPONENT, 7.0f);
		
		
	
		glEnable(GL_LIGHT2);
	}
	
	public void scheinwerferRechts(){
		float licht3_position [] = {100.0f, 0.0f, 0.0f, 1.0f};
		float licht3_ambient [] = {1.0f, 1.0f, 1.0f, 1.0f};
		float licht3_diffus [] = {1.0f, 1.0f, 1.0f, 1.0f};
		float licht3_specular [] = {1.0f, 1.0f, 1.0f, 1.0f};
		float licht3_direction [] = {0.0f, -0.4f, -1.0f, 1.0f};
		
		glLightfv(GL_LIGHT3, GL_POSITION, licht3_position);
		glLightfv(GL_LIGHT3, GL_AMBIENT, licht3_ambient);
		glLightfv(GL_LIGHT3, GL_DIFFUSE, licht3_diffus);
		glLightfv(GL_LIGHT3, GL_SPECULAR, licht3_specular);
		glLightfv(GL_LIGHT3, GL_SPOT_DIRECTION, licht3_direction);
		
		glLightf(GL_LIGHT3, GL_SPOT_CUTOFF, 90.0f);
		glLightf(GL_LIGHT3, GL_SPOT_EXPONENT, 7.0f);
		
		
		
		glEnable(GL_LIGHT3);
	}
	
	public void sonne(){
		float licht5_position [] = {-5f, 10f, -2.5f, 0f};
		float licht5_ambient [] = {1.0f, 1.0f, 1.0f, 0f};
		float licht5_diffus [] = {1.0f, 1.0f, 1.0f, 0f};
		float licht5_specular [] = {1.0f, 1.0f, 1.0f, 0f};
		
		
		glLightfv(GL_LIGHT5, GL_POSITION, licht5_position);
		glLightfv(GL_LIGHT5, GL_AMBIENT, licht5_ambient);
		glLightfv(GL_LIGHT5, GL_DIFFUSE, licht5_diffus);
		glLightfv(GL_LIGHT5, GL_SPECULAR, licht5_specular);
		
		
		glEnable(GL_LIGHTING);
		glEnable(GL_LIGHT5);
	}
}
