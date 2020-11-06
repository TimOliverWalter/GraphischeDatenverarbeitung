import static org.lwjgl.opengl.GL11.*;
import java.nio.FloatBuffer;
import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import javax.swing.*;

public class Fahrbahnbegrenzung {
	
	// Kartengesamtgröße
	int breite = 60;
	boolean[][] kartenarray = new boolean [3530][3530];
	boolean[][] muenzenarray = new boolean [3530][3530];
	
	boolean zeitzaehlen = true;
	int zeitzaehler;
	int gesammelteMuenzen;
	
	int sekunden = 0;
	int minuten = 0;
	
	public void zulässigkeitsbereichErzeugen(){
		
		//lange Geraden
		for(int i = 0; i < 3530; i++){
			for(int j = 0; j < breite; j++){
				kartenarray[j][i]=true; // Gerade 5
				kartenarray[i][3529-j]=true; // Gerade 6
			}			
		}
		//kurze Geraden
		for(int i = 0; i<1790; i++){
			for(int j = 0; j < breite; j++){
				kartenarray[3520-j][i+1740] = true; // Gerade 1
				kartenarray[i][j] = true; // Gerade 4				
			}
			for(int j = 0; j < breite; j++){
				kartenarray[1790-j][i] = true; // Gerade 3
				kartenarray[1740+i][1800-j] = true; // Gerade 2
			}
		}		
	}
	
	
	public void muenzenPositionieren(){
		int münzenbreite = 8;
		int verschiebung = 13;
		
		//Gerade 1 
		for(int i = 0; i < 10; i++){			
			for(int k = 0; k<münzenbreite; k++){
				for(int l = 0; l< 8; l++){
					muenzenarray [3507+((int)(Math.pow(-1, i%2)))*verschiebung-k][3465-i*166+l] = true;
				}
			}			
		}
		
		//Gerade 2
		for(int i = 0; i < 10; i++){			
			for(int k = 0; k<münzenbreite; k++){
				for(int l = 0; l< 8; l++){
					muenzenarray [3485-i*166+l][1763+((int)(Math.pow(-1, i%2+1)))*verschiebung+k] = true;
				}
			}			
		}
		
		//Gerade 3 
		for(int i = 0; i < 10; i++){			
			for(int k = 0; k<münzenbreite; k++){
				for(int l = 0; l< 8; l++){
					muenzenarray [1768+((int)(Math.pow(-1, i%2)))*verschiebung-k][1728-i*166+l] = true;
				}
			}			
		}
		
		//Gerade 4
		for(int i = 0; i < 10; i++){			
			for(int k = 0; k<münzenbreite; k++){
				for(int l = 0; l< 8; l++){
					muenzenarray [1740-i*166+l][24+((int)(Math.pow(-1, i%2+1)))*verschiebung+k] = true;
				}
			}			
		}
		
		//Gerade 5
		for(int i = 0; i < 20; i++){			
			for(int k = 0; k<münzenbreite; k++){
				for(int l = 0; l< 8; l++){
					muenzenarray [25+((int)(Math.pow(-1, i%2)))*verschiebung-k][3460-i*166+l] = true;
				}
			}			
		}
		
		//Gerade 6
		for(int i = 0; i < 20; i++){			
			for(int k = 0; k<münzenbreite; k++){
				for(int l = 0; l< 8; l++){
					muenzenarray [3460-i*166+l][3500+((int)(Math.pow(-1, i%2+1)))*verschiebung+k] = true;
				}
			}			
		}
		
	}
	
	
	public int muenzenSammeln(float xpos, float zpos){
		int xArray = (int)(((xpos + 105150)/105900)*3530);
		int zArray = (int)(((zpos + 79050)/105900)*3530);
		
		if(xArray >= 3530 || zArray >= 3530 || xArray <= 0 || zArray <= 0)
			gesammelteMuenzen = gesammelteMuenzen;
		else if(muenzenarray[xArray][zArray])
			gesammelteMuenzen++;		
		
		return gesammelteMuenzen;		
	}
	
	public boolean PrüfungAufStrecke(float xpos, float zpos){
		int xArray = (int)(((xpos + 105150)/105900)*3530);
		int zArray = (int)(((zpos + 79050)/105900)*3530);
		
		if(xArray >= 3530 || zArray >= 3530 || xArray <= 0 || zArray <= 0)
			return false;
		else if(kartenarray[xArray][zArray])
			return true;
		else
			return false;
	}
	
	
	public void zieleinfahrt(float xpos, float zpos){
		int xArray = (int)(((xpos + 105150)/105900)*3530);
		int zArray = (int)(((zpos + 79050)/105900)*3530);
		
		sekunden = (int)(zeitzaehler /10.66 - minuten*60);
		if(sekunden == 60){
			sekunden = 0;
			minuten++;
		}
		
		for(int j = 0; j < 20; j++){
			for(int i = 0; i < breite; i++){
				if( (zArray == (2640+j)) && (xArray == (3520-i))){
					JFrame f = new JFrame( "Runde beendet!" );
					f.setSize( 300, 250 );
					f.add( new JLabel("<html> <p/>" + "<html>Sie haben die Runde beendet! <p/>" + "<html> <p/>" + "<html>Ihre Zeit: 0" + minuten + ":" + sekunden  
							+ "<html> <p/>" + "<html> <p/>" + "<html>Gesammelte Münzen: " + gesammelteMuenzen + "<html><p/>" + "<html> <p/>" + "<html>Glückwunsch!" + "<html> <p/>"));					
					f.setVisible( true );
					f.setLocationRelativeTo(null);
					zeitzaehlen = false;
				}
			}
		}
	}

	public boolean isZeitzaehlen() {
		return zeitzaehlen;
	}

	public void setZeitzaehler(int zeitzaehler) {
		this.zeitzaehler = zeitzaehler;
	}


	public int getGesammelteMuenzen() {
		return gesammelteMuenzen;
	}

}
