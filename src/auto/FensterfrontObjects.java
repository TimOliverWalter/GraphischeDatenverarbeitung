package auto;

import static org.lwjgl.opengl.GL11.*;

public class FensterfrontObjects {

	public void drawASaeule(){
		
		 int m = 20, n = 20; // für Anzahl der Facetten
		    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
		    float xa=-10, xe=110, ya=110, ye=100; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		    float deltax=(xe-xa)/m, deltay=(ye-ya)/n; // Größe einer Facette

		    for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                x_i=xa+i*deltax;
	                x_i_1=x_i+deltax;

	                y_j=ya+j*deltay;
	                y_j_1=y_j+deltay;
	                
	                

	                glBegin(GL_POLYGON);  // ij-te Facette zeichnen
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i, y_j, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i_1, y_j, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i_1, y_j_1, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i, y_j_1, 0);
	                glEnd();

	            }
		    }
	}
	
	public void drawCSaeule(){
		
		 int m = 20, n = 20; // für Anzahl der Facetten
		    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
		    float xa=5, xe=110, ya=110, ye=100; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		    float deltax=(xe-xa)/m, deltay=(ye-ya)/n; // Größe einer Facette

		    for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                x_i=xa+i*deltax;
	                x_i_1=x_i+deltax;

	                y_j=ya+j*deltay;
	                y_j_1=y_j+deltay;
	                
	              

	                glBegin(GL_POLYGON);  // ij-te Facette zeichnen
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i, y_j, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i_1, y_j, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i_1, y_j_1, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i, y_j_1, 0);
	                glEnd();

	            }
		    }
	}
	
	public void drawDachleiste(){
		
		 int m = 20, n = 20; // für Anzahl der Facetten
		    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
		    float xa=0, xe=349.239f-50, ya=110, ye=100; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		    float deltax=(xe-xa)/m, deltay=(ye-ya)/n; // Größe einer Facette

		    for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                x_i=xa+i*deltax;
	                x_i_1=x_i+deltax;

	                y_j=ya+j*deltay;
	                y_j_1=y_j+deltay;
	                
	                

	                glBegin(GL_POLYGON);  // ij-te Facette zeichnen
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i, y_j, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i_1, y_j, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i_1, y_j_1, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i, y_j_1, 0);
	                glEnd();

	            }
		    }
	}
	
	public void drawDachleisteVorne(){
		
		 int m = 20, n = 20; // für Anzahl der Facetten
		    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
		    float xa=0, xe=200, ya=110, ye=100; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		    float deltax=(xe-xa)/m, deltay=(ye-ya)/n; // Größe einer Facette

		    for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                x_i=xa+i*deltax;
	                x_i_1=x_i+deltax;

	                y_j=ya+j*deltay;
	                y_j_1=y_j+deltay;
	                
	                

	                glBegin(GL_POLYGON);  // ij-te Facette zeichnen
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i, y_j, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i_1, y_j, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i_1, y_j_1, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i, y_j_1, 0);
	                glEnd();

	            }
		    }
	}
	
	public void drawFensterMitte(){
		
		 int m = 20, n = 20; // für Anzahl der Facetten
		    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
		    float xa=0, xe=295, ya=0, ye=100; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		    float deltax=(xe-xa)/m, deltay=(ye-ya)/n; // Größe einer Facette

		    for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                x_i=xa+i*deltax;
	                x_i_1=x_i+deltax;

	                y_j=ya+j*deltay;
	                y_j_1=y_j+deltay;
	                
	                

	                glBegin(GL_POLYGON);  // ij-te Facette zeichnen
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i, y_j, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i_1, y_j, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i_1, y_j_1, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i, y_j_1, 0);
	                glEnd();

	            }
		    }
	}
	
	public void drawFensterDreieckVorne(){
		
		
		int m = 20; // für Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa=100, xe=0, ya= 50; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
	    float deltax=(xe-xa)/m; // Größe einer Facette

	    for(int i=0;i<m;i++){
           
                x_i= xa + i * deltax;
                x_i_1 = x_i + deltax;
                
                
             
                glBegin(GL_POLYGON);  // ij-te Facette zeichnen
                  glNormal3f(0, 0, 1);
                  glVertex3f(ya, x_i, 0);
                  glNormal3f(0, 0, 1);
                  glVertex3f(ya, x_i_1, 0);
                  glNormal3f(0, 0, 1);
                  glVertex3f(0, 0, 0);                 
                glEnd();            
	    }
	}
	
	public void drawFensterDreieckHinten(){
			
			
		int m = 20; // für Anzahl der Facetten
	    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
	    float xa=100, xe=0, ya= -17.3f; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
	    float deltax=(xe-xa)/m; // Größe einer Facette

	    for(int i=0;i<m;i++){
           
                x_i= xa + i * deltax;
                x_i_1 = x_i + deltax;
                
                
             
                glBegin(GL_POLYGON);  // ij-te Facette zeichnen
                  glNormal3f(0, 0, 1);
                  glVertex3f(ya, x_i, 0);
                  glNormal3f(0, 0, 1);
                  glVertex3f(ya, x_i_1, 0);
                  glNormal3f(0, 0, 1);
                  glVertex3f(0, 0, 0);                 
                glEnd();            
	    }
	}
	
	public void drawTuerkante1(){
		
		 int m = 20, n = 20; // für Anzahl der Facetten
		    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
		    float xa=0, xe=70, ya=102, ye=100; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		    float deltax=(xe-xa)/m, deltay=(ye-ya)/n; // Größe einer Facette

		    for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                x_i=xa+i*deltax;
	                x_i_1=x_i+deltax;

	                y_j=ya+j*deltay;
	                y_j_1=y_j+deltay;
	                
	              

	                glBegin(GL_POLYGON);  // ij-te Facette zeichnen
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i, y_j, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i_1, y_j, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i_1, y_j_1, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i, y_j_1, 0);
	                glEnd();

	            }
		    }
	}
	
	public void drawTuerkante2(){
		
		 int m = 20, n = 20; // für Anzahl der Facetten
		    float x_i, y_j, x_i_1, y_j_1;  // Hilfsvariablen
		    float xa=0, xe=130, ya=102, ye=100; // unterer linker und oberer rechter Eckpunkt des darzustellenden Rechtecks
		    float deltax=(xe-xa)/m, deltay=(ye-ya)/n; // Größe einer Facette

		    for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                x_i=xa+i*deltax;
	                x_i_1=x_i+deltax;

	                y_j=ya+j*deltay;
	                y_j_1=y_j+deltay;
	                
	                

	                glBegin(GL_POLYGON);  // ij-te Facette zeichnen
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i, y_j, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i_1, y_j, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i_1, y_j_1, 0);
	                  glNormal3f(0, 0, 1);
	                  glVertex3f(x_i, y_j_1, 0);
	                glEnd();

	            }
		    }
	}
}
