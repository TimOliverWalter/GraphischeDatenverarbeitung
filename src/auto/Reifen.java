package auto;

import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils; // to create a float buffer in place of the glfloat array


public class Reifen {
	
	private float radius = 2.0f;
	private int ecken = 30;
	float a = 28;
	float b = 28;
	
	
	public void drawReifen(){
	
		int m = 50;
		int n = 50;
		float u_l = 0;
		float u_r = (float) (2 * Math.PI);
		float v_l = 0;
		float v_r = 1.5f; 
		float u_i, v_j, u_i_l, v_j_l;
		float delta_u = (u_r-u_l)/m;
		float delta_v = (v_r-v_l)/n;
		
		for(int i = 0; i < m; i++){
			u_i = u_l + delta_u * i;
			u_i_l = u_i + delta_u;
			
			for(int j = 0; j < n; j++){
				v_j = v_l + delta_v *j;
				v_j_l = v_j + delta_v;
				
				glBegin(GL_TRIANGLE_FAN);
					glVertex3f(x(u_i, v_j), y(u_i, v_j), z(u_i, v_j));
					glVertex3f(x(u_i_l, v_j), y(u_i_l, v_j), z(u_i_l, v_j));
					glVertex3f(x(u_i_l, v_j_l), y(u_i_l, v_j_l), z(u_i_l, v_j_l));
					glVertex3f(x(u_i, v_j_l), y(u_i, v_j_l), z(u_i, v_j_l));
				glEnd();
			}
		}
		}	
		
		private float x(float u, float v) {
			float xx = (float)(a * Math.cos(u) + a*Math.cos(u));
			return xx;
		}
		
		private float y(float u, float v) {
			float yy = (float)(b * Math.sin(u) + b*Math.sin(u));
			return yy;
		}
		
		private float z(float u, float v) {
			return v*30;
		}
		
		public void drawScheibe() {
			
			int m = 40;
			int n = 30;
			float ul = 0f;
			float ur = (float)(2 * (Math.PI));
			float vl = 0;
			float vr = 1f;
			float ui, vj, ui_1, vj_1;
			float deltau = (ur - ul) / m;
			float deltav = (vr - vl) / n;
			
			for (int i = 0; i < m; i++) {
				ui = ul + deltau * i;
				ui_1 = ui + deltau;
				for (int j = 0; j < n; j++) {
					vj = vl + deltav * j;
					vj_1 = vj + deltav;

					
				
				glPushMatrix();
					glBegin(GL_TRIANGLE_FAN);
						glNormal3f(0, 1, 0);	
						glVertex3f(x1(ui, vj), y1(ui, vj), z1(ui, vj));
						glNormal3f(0, 1, 0);	
						glVertex3f(x1(ui_1, vj), y1(ui_1, vj), z1(ui_1, vj));
						glNormal3f(0, 1, 0);	
						glVertex3f(x1(ui_1, vj_1), y1(ui_1, vj_1), z1(ui_1, vj_1));
						glNormal3f(0, 1, 0);	
						glVertex3f(x1(ui, vj_1), y1(ui, vj_1), z1(ui, vj_1));
					glEnd();
				glPopMatrix();
				}
			}
		}

		private float x1(float u, float v) {
			int r0= 0;
			int r1= 35;
			float xx = (float) (r0*(Math.cos(u))+(v*Math.cos(u))*(r1-r0));
			return xx;
		}

		private float y1(float u, float v) {
			float yy = (float) (0);
			return yy;
		}

		private float z1(float u, float v) {
			int r0= 0;
			int r1= 35;
			float zz = (float)(r0*(Math.sin(u))+(v*Math.sin(u))*(r1-r0));
			return zz;
		

		}
		
		public void drawNabe() {
			
			int m = 40;
			int n = 30;
			float ul = 0f;
			float ur = (float)(2 * (Math.PI));
			float vl = 0;
			float vr = 1f;
			float ui, vj, ui_1, vj_1;
			float deltau = (ur - ul) / m;
			float deltav = (vr - vl) / n;
			
			for (int i = 0; i < m; i++) {
				ui = ul + deltau * i;
				ui_1 = ui + deltau;
				for (int j = 0; j < n; j++) {
					vj = vl + deltav * j;
					vj_1 = vj + deltav;

					
				
				glPushMatrix();
					glBegin(GL_TRIANGLE_FAN);
						glNormal3f(0, 1, 0);	
						glVertex3f(x2(ui, vj), y2(ui, vj), z2(ui, vj));
						glNormal3f(0, 1, 0);	
						glVertex3f(x2(ui_1, vj), y2(ui_1, vj), z2(ui_1, vj));
						glNormal3f(0, 1, 0);	
						glVertex3f(x2(ui_1, vj_1), y2(ui_1, vj_1), z2(ui_1, vj_1));
						glNormal3f(0, 1, 0);	
						glVertex3f(x2(ui, vj_1), y2(ui, vj_1), z2(ui, vj_1));
					glEnd();
				glPopMatrix();
				}
			}
		}

		private float x2(float u, float v) {
			int r0= 0;
			int r1= 5;
			float xx = (float) (r0*(Math.cos(u))+(v*Math.cos(u))*(r1-r0));
			return xx;
		}

		private float y2(float u, float v) {
			float yy = (float) (0);
			return yy;
		}

		private float z2(float u, float v) {
			int r0= 0;
			int r1= 5;
			float zz = (float)(r0*(Math.sin(u))+(v*Math.sin(u))*(r1-r0));
			return zz;
		

		}
		
		public void drawReifenSeite() {
			
			int m = 40;
			int n = 30;
			float ul = 0f;
			float ur = (float)(2 * (Math.PI));
			float vl = 0;
			float vr = 1f;
			float ui, vj, ui_1, vj_1;
			float deltau = (ur - ul) / m;
			float deltav = (vr - vl) / n;
			
			for (int i = 0; i < m; i++) {
				ui = ul + deltau * i;
				ui_1 = ui + deltau;
				for (int j = 0; j < n; j++) {
					vj = vl + deltav * j;
					vj_1 = vj + deltav;

					
				
				glPushMatrix();
					glBegin(GL_TRIANGLE_FAN);
						glNormal3f(0, 1, 0);	
						glVertex3f(x3(ui, vj), y3(ui, vj), z3(ui, vj));
						glNormal3f(0, 1, 0);	
						glVertex3f(x3(ui_1, vj), y3(ui_1, vj), z3(ui_1, vj));
						glNormal3f(0, 1, 0);	
						glVertex3f(x3(ui_1, vj_1), y3(ui_1, vj_1), z3(ui_1, vj_1));
						glNormal3f(0, 1, 0);	
						glVertex3f(x3(ui, vj_1), y3(ui, vj_1), z3(ui, vj_1));
					glEnd();
				glPopMatrix();
				}
			}
		}

		private float x3(float u, float v) {
			int r0= 0;
			int r1= 56;
			float xx = (float) (r0*(Math.cos(u))+(v*Math.cos(u))*(r1-r0));
			return xx;
		}

		private float y3(float u, float v) {
			float yy = (float) (0);
			return yy;
		}

		private float z3(float u, float v) {
			int r0= 0;
			int r1= 56;
			float zz = (float)(r0*(Math.sin(u))+(v*Math.sin(u))*(r1-r0));
			return zz;
		

		}
}
