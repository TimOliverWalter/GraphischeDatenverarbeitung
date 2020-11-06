package strecke;

import static org.lwjgl.opengl.GL11.*;


public class Muenze {
	
	float material_polGold1 [] = {0.25f, 0.22f, 0.06f, 1.0f};
	float material_polGold2 [] = {0.35f, 0.31f, 0.09f, 1.0f};
	float material_polGold3 [] = {0.80f, 0.72f, 0.21f, 1.0f};
	
	public void drawMuenze(){
		glPushMatrix();
			glMaterialf(GL_FRONT_AND_BACK, GL_SHININESS, 83.2f);
			glMaterialfv(GL_FRONT_AND_BACK, GL_AMBIENT, material_polGold1);
			glMaterialfv(GL_FRONT_AND_BACK, GL_DIFFUSE, material_polGold2);
			glMaterialfv(GL_FRONT_AND_BACK, GL_SPECULAR, material_polGold3);
			drawReifen();
		glPopMatrix();
		
		//Reifenseite
		glPushMatrix();
			glMaterialf(GL_FRONT_AND_BACK, GL_SHININESS, 83.2f);
			glMaterialfv(GL_FRONT_AND_BACK, GL_AMBIENT, material_polGold1);
			glMaterialfv(GL_FRONT_AND_BACK, GL_DIFFUSE, material_polGold2);
			glMaterialfv(GL_FRONT_AND_BACK, GL_SPECULAR, material_polGold3);
			glRotatef(90, 1, 0, 0);
			drawReifenSeite();
		glPopMatrix();
		
		//Reifenseite
		glPushMatrix();
			glMaterialf(GL_FRONT_AND_BACK, GL_SHININESS, 83.2f);
			glMaterialfv(GL_FRONT_AND_BACK, GL_AMBIENT, material_polGold1);
			glMaterialfv(GL_FRONT_AND_BACK, GL_DIFFUSE, material_polGold2);
			glMaterialfv(GL_FRONT_AND_BACK, GL_SPECULAR, material_polGold3);
			glTranslatef(0, 0, 45);
			glRotatef(90, 1, 0, 0);
			drawReifenSeite();
		glPopMatrix();
	}
	
	public void drawReifen(){
		float nx,ny,nz;
		float norm;
		int m = 4;
		int n = 4;
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
				
				glBegin(GL_POLYGON);
					nx=-1*(x(u_i, v_j));
					ny=-1*(x(u_i,v_j));
					nz=-1*(z(u_i, v_j));
					norm=(float)Math.sqrt(nx*nx+ny*ny+nz*nz);
					glNormal3f(nx/norm, ny/norm, nz/norm);
					glVertex3f(x(u_i, v_j), y(u_i, v_j), z(u_i, v_j));
					
					nx=-1*(x(u_i_l, v_j));
					ny=-1*(x(u_i_l,v_j));
					nz=-1*(z(u_i_l, v_j));
					norm=(float)Math.sqrt(nx*nx+ny*ny+nz*nz);
					glNormal3f(nx/norm, ny/norm, nz/norm);
					glVertex3f(x(u_i_l, v_j), y(u_i_l, v_j), z(u_i_l, v_j));
					
					nx=-1*(x(u_i_l, v_j_l));
					ny=-1*(x(u_i_l,v_j_l));
					nz=-1*(z(u_i_l, v_j_l));
					norm=(float)Math.sqrt(nx*nx+ny*ny+nz*nz);
					glNormal3f(nx/norm, ny/norm, nz/norm);
					glVertex3f(x(u_i_l, v_j_l), y(u_i_l, v_j_l), z(u_i_l, v_j_l));
					
					nx=-1*(x(u_i, v_j_l));
					ny=-1*(x(u_i,v_j_l));
					nz=-1*(z(u_i, v_j_l));
					norm=(float)Math.sqrt(nx*nx+ny*ny+nz*nz);
					glNormal3f(nx/norm, ny/norm, nz/norm);
					glVertex3f(x(u_i, v_j_l), y(u_i, v_j_l), z(u_i, v_j_l));
				glEnd();
			}
		}
		}	
		
		private float x(float u, float v) {
			float xx = (float)(28 * Math.cos(u) + 28*Math.cos(u));
			return xx;
		}
		
		private float y(float u, float v) {
			float yy = (float)(28 * Math.sin(u) + 28 * Math.sin(u));
			return yy;
		}
		
		private float z(float u, float v) {
			return v*30;
		}
		
		public void drawReifenSeite() {
			
			int m = 4;
			int n = 4;
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
