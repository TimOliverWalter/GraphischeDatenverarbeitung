//Imports
import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;

import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL20;
import haeuser.Haeuser;
import baum.Baeume;
import bushaeuschen.Bushaeuser;
import licht.Licht;
import parkbank.Parkbaenke;
import see.See;
import strecke.Strecke;
import tannenbaum.Tannenbäume;
import wiese.Wiese;
import laterne.Laternen;
import ziellinie.Ziellinie;


public class Karte{

	Strecke strecke = new Strecke();
	Haeuser haeuser = new Haeuser();
	Baeume baeume = new Baeume();
	Bushaeuser bushaeuser = new Bushaeuser();
	Parkbaenke parkbaenke = new Parkbaenke();
	See see = new See();
	Tannenbäume tannenbäume =new Tannenbäume();
	Wiese wiese =new Wiese();
	Licht licht = new Licht();
	Laternen laternen = new Laternen();
	Ziellinie ziellinie = new Ziellinie();
	
	int displayList=-1;
	
	public void setDisplayList(int d){
		displayList = d;
	}
	
	public int getDisplayList(){
		return displayList;
	}
	
	
	public void zusammenBauen(){
		
		glPushMatrix();
			strecke.drawStrecke();
		glPopMatrix();
		
		glPushMatrix();
			wiese.drawWiese();
		glPopMatrix();
		
		glPushMatrix();
			haeuser.draw();
		glPopMatrix();
		
		glPushMatrix();
			tannenbäume.draw();
		glPopMatrix();
		
		glPushMatrix();
			bushaeuser.draw();
		glPopMatrix();
		
		glPushMatrix();
			parkbaenke.draw();
		glPopMatrix();
		
		glPushMatrix();
			licht.sonne();
		glPopMatrix();
		
		glPushMatrix();
			baeume.draw();
		glPopMatrix();
		
		glPushMatrix();
			see.drawsee();
		glPopMatrix();
		
		glPushMatrix();
			laternen.draw();
		glPopMatrix();
		
		glPushMatrix();
			ziellinie.drawZiellinie();
		glPopMatrix();
	}
	
}
