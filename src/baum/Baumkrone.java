package baum;
import static org.lwjgl.opengl.GL11.*;

public class Baumkrone {
	
	// private Variablen
	private float r = 400;


	
public void drawBaumkrone() {
	float nx;
	float ny;
	float nz;
	float norm;
	float xx,yy,zz;
	int m_1 = 30;
	int n_1 = 30;	
	float u_l = 0;
	float u_r = (float) (2 * Math.PI);
	float v_l = 0.0f;
	float v_r = (float) (Math.PI);
	float u_i, v_j, u_i_1, v_j_1;
	float delta_u = (u_r - u_l) / m_1;
	float delta_v = (v_r - v_l) / n_1;

	
	
	for (int i = 0; i < m_1; i++) {
		u_i = u_l + delta_u * i;
		u_i_1 = u_i +delta_u;
		
		for (int j = 0; j < n_1; j++) {
			v_j = v_l +delta_v *j;
			v_j_1 = v_j +delta_v;
			

			glPushMatrix();
				
				glBegin(GL_POLYGON);
					
					xx=x1(u_i,v_j);
					yy=y1(u_i,v_j);
					zz=z1(u_i,v_j);
					norm=(float)(Math.sqrt(xx*xx+yy*yy+zz*zz));
					nx= xx/norm;
					ny=yy/norm;
					nz=zz/norm;
					glNormal3f(nx, ny, nz);
					glVertex3f(xx, yy,zz);
					
					xx=x1(u_i_1,v_j);
					yy=y1(u_i_1,v_j);
					zz=z1(u_i_1,v_j);
					norm=(float)(Math.sqrt(xx*xx+yy*yy+zz*zz));
					nx= xx/norm;
					ny=yy/norm;
					nz=zz/norm;
					glNormal3f(nx, ny, nz);
					glVertex3f(xx, yy, zz);
					
					xx=x1(u_i_1,v_j_1);
					yy=y1(u_i_1,v_j_1);
					zz=z1(u_i_1,v_j_1);
					norm=(float)(Math.sqrt(xx*xx+yy*yy+zz*zz));
					nx= xx/norm;
					ny=yy/norm;
					nz=zz/norm;
					glNormal3f(nx, ny, nz);
					glVertex3f(xx, yy, zz);
					
					xx=x1(u_i,v_j_1);
					yy=y1(u_i,v_j_1);
					zz=z1(u_i,v_j_1);
					norm=(float)(Math.sqrt(xx*xx+yy*yy+zz*zz));
					nx= xx/norm;
					ny=yy/norm;
					nz=zz/norm;
					glNormal3f(nx, ny, nz);
					glVertex3f(xx, yy, zz);
				glEnd();
			glPopMatrix();
				

		}
		}
	}
		
		

	private float x1(float u1, float v1){
		return (float) ((float) r * ((float) Math.sin( u1) * Math.cos(v1)));
	}
	private float y1(float u1 , float v1){
		return (float) ((float) r * ((float) Math.sin(u1) * Math.sin(v1)));
	}
	private float z1(float u1, float v1){
		return (float) r * ((float) Math.cos(u1));
	}

}
