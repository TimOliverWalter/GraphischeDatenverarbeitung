package tannenbaum;
import static org.lwjgl.opengl.GL11.*;


public class Tanne {
	
	// private Variablen
	private float r = 400;
	private float h = 800f;

	
public void drawTanne() {
	float x1,y1,z1;
	float x2,y2,z2;
	float xx,yy,zz;
	float nx;
	float ny;
	float nz;
	float norm;
	int m = 30;
	int n = 30;	
	float u_l = 0;
	float u_r = h;
	float v_l = (float) -(Math.PI);
	float v_r = (float) (Math.PI);
	float u_i, v_j, u_i_1, v_j_1;
	float delta_u = (u_r - u_l) / m;
	float delta_v = (v_r - v_l) / n;

	
	
	for (int i = 0; i < m; i++) {
		u_i = u_l + delta_u * i;
		u_i_1 = u_i +delta_u;
		
		for (int j = 0; j < n; j++) {
			v_j = v_l +delta_v *j;
			v_j_1 = v_j +delta_v;
			
			
			
			glPushMatrix();
				glTranslatef(0, 1200, 0);
				glRotatef(180, 0, 0, 1);
				glBegin(GL_POLYGON);
					x1=x(u_i_1, v_j)-x(u_i, v_j);
					y1=y(u_i_1, v_j)-y(u_i, v_j);
					z1=z(u_i_1, v_j)-z(u_i, v_j);
					
					x2=x(u_i, v_j_1)-x(u_i, v_j);
					y2=y(u_i, v_j_1)-y(u_i, v_j);
					z2=z(u_i, v_j_1)-z(u_i, v_j);
					
					xx=(y1*z2)-(z1*y2);
					yy=(z1*y2)-(x1*y2);
					zz=(x1*y2)-(y1*x2);
					
					norm=(float)Math.sqrt(xx*xx+yy*yy+zz*zz);
					
					glNormal3f(xx/norm, yy/norm, zz/norm);
					glVertex3f(x(u_i, v_j), y(u_i, v_j), z(u_i, v_j));
					
					glNormal3f(xx/norm, yy/norm, zz/norm);
					glVertex3f(x(u_i_1, v_j), y(u_i_1, v_j), z(u_i_1, v_j));
					
					glNormal3f(xx/norm, yy/norm, zz/norm);
					glVertex3f(x(u_i_1, v_j_1), y(u_i_1, v_j_1), z(u_i_1, v_j_1));
					
					glNormal3f(xx/norm, yy/norm, zz/norm);
					glVertex3f(x(u_i, v_j_1), y(u_i, v_j_1), z(u_i, v_j_1));
				glEnd();
			glPopMatrix();

		
		}
	}
	}	
		
	private float x(float u, float v){
		return (float) ((float) (r/h) * u * (Math.cos(v)));
	}
	private float y(float u , float v){
		return u;
	}
	private float z(float u, float v){
		return (float) ((float) (r/h) * u * (Math.sin(v)));
	}

}

