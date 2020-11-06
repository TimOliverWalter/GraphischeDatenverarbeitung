package tannenbaum;
//Imports
import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils; // to create a float buffer in place of the glfloat array

public class Tannenstamm{
		
	//private Variablen
	private float h = 750;	//höhe
	private float r = 50;	//radius
	
	public void drawTannenstamm() {
		float nx;
		float ny;
		float nz;
		float norm;
		float xx,yy,zz;


		int m = 30;
		int n = 30;	
		float u_l = 0;
		float u_r = (float) (2 * Math.PI);
		float v_l = 0.0f;
		float v_r = 1;
		float u_i, v_j, u_i_1, v_j_1;
		float delta_u = (u_r - u_l) / m;
		float delta_v = (v_r - v_l) / n;

		
		
		for (int i = 0; i < m; i++) {
			u_i = u_l + delta_u * i;
			u_i_1 = u_i + delta_u;
			
			for (int j = 0; j < n; j++) {
				v_j = v_l + delta_v *j;
				v_j_1 = v_j + delta_v;
				
				
				glBegin(GL_TRIANGLE_FAN);
				xx=x(u_i,v_j);
				yy=y(u_i,v_j);
				zz=z(u_i,v_j);
				norm=(float)(Math.sqrt(xx*xx+zz*zz));
				nx= xx/norm;
				ny=0;
				nz=zz/norm;
				glNormal3f(nx, ny, nz);
				glVertex3f(xx, yy, zz);
				
				xx=x(u_i_1,v_j);
				yy=y(u_i_1,v_j);
				zz=z(u_i_1,v_j);
				norm=(float)(Math.sqrt(xx*xx+zz*zz));
				nx= xx/norm;
				ny=0;
				nz=zz/norm;
				glNormal3f(nx, ny, nz);
				glVertex3f(xx, yy, zz);
				
				xx=x(u_i_1,v_j_1);
				yy=y(u_i_1,v_j_1);
				zz=z(u_i_1,v_j_1);
				norm=(float)(Math.sqrt(xx*xx+zz*zz));
				nx= xx/norm;
				ny=0;
				nz=zz/norm;
				glNormal3f(nx, ny, nz);
				glVertex3f(xx, yy, zz);
				
				xx=x(u_i,v_j_1);
				yy=y(u_i,v_j_1);
				zz=z(u_i,v_j_1);
				norm=(float)(Math.sqrt(xx*xx+zz*zz));
				nx= xx/norm;
				ny=0;
				nz=zz/norm;
				glNormal3f(nx, ny, nz);
				glVertex3f(xx, yy, zz);

				glEnd();
				
			}
		}
			
	}
		private float x(float u, float v){
			return (float) (r * Math.cos(u));
		}
		private float y(float u , float v){
			return v * h;
		}
		private float z(float u, float v){
			return (float) (r * Math.sin(u));
		}
	
}