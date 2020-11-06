package strecke;

import static org.lwjgl.opengl.GL11.*;

public class Kurve {
	
	float material_Asphalt1 [] = {0.12f, 0.12f, 0.12f, 1.0f};
	float material_Asphalt2 [] = {0.01f, 0.01f, 0.01f, 1.0f};
	float material_Asphalt3 [] = {0.50f, 0.50f, 0.50f, 1.0f};
	
	float material_Beton1 [] = {0.52f, 0.52f, 0.52f, 1.0f};
	float material_Beton2 [] = {0.01f, 0.01f, 0.01f, 1.0f};
	float material_Beton3 [] = {0.50f, 0.50f, 0.50f, 1.0f};
	
	
	public void draw(){
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Asphalt1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Asphalt2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Asphalt3);
		glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
		fahrweg();
		gehwegAussen();
		gehwegInnen();
		
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Beton1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Beton2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Beton3);
		glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
		bordsteinAussen();
		bordsteinInnen();
	}
	
	private void fahrweg() {
		
		int m = 40;
		int n = 30;
		float ul = 0f;
		float ur = (float)((Math.PI)/2);
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

				
				
				glBegin(GL_TRIANGLE_FAN);
					glNormal3f(0, 1, 0);
					glVertex3f(x(ui, vj), y(ui, vj), z(ui, vj));
					glNormal3f(0, 1, 0);
					glVertex3f(x(ui_1, vj), y(ui_1, vj), z(ui_1, vj));
					glNormal3f(0, 1, 0);
					glVertex3f(x(ui_1, vj_1), y(ui_1, vj_1), z(ui_1, vj_1));
					glNormal3f(0, 1, 0);
					glVertex3f(x(ui, vj_1), y(ui, vj_1), z(ui, vj_1));
				glEnd();
			}
		}
	}

	private float x(float u, float v) {
		int r0= 350;
		int r1= 1850;
		float xx = (float) (r0*(Math.cos(u))+(v*Math.cos(u))*(r1-r0));
		return xx;
	}

	private float y(float u, float v) {
		float yy = (float) (0);
		return yy;
	}

	private float z(float u, float v) {
		int r0= 350;
		int r1= 1850;
		float zz = (float)(r0*(Math.sin(u))+(v*Math.sin(u))*(r1-r0));
		return zz;
	}
	
	private void gehwegAussen() {
		
		int m = 40;
		int n = 30;
		float ul = 0f;
		float ur = (float)((Math.PI)/2);
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
			}
		}
	}

	private float x1(float u, float v) {
		int r0= 1850;
		int r1= 2200;
		float xx = (float) (r0*(Math.cos(u))+(v*Math.cos(u))*(r1-r0));
		return xx;
	}

	private float y1(float u, float v) {
		float yy = (float) (20);
		return yy;
	}

	private float z1(float u, float v) {
		int r0= 1850;
		int r1= 2200;
		float zz = (float)(r0*(Math.sin(u))+(v*Math.sin(u))*(r1-r0));
		return zz;
	}
	
	private void bordsteinAussen() {
		float nx,ny,nz;
		float norm;
		int m = 20;
		int n = 10;
		float ul = 0f;
		float ur = (float)((Math.PI)/2);
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

				
				glBegin(GL_TRIANGLE_FAN);
					nx=-1*(x2(ui, vj));
					ny=0;
					nz=-1*(z2(ui, vj));
					norm=(float)Math.sqrt(nx*nx+ny*ny+nz*nz);
					glNormal3f(nx/norm, ny/norm, nz/norm);
					glVertex3f(x2(ui, vj), y2(ui, vj), z2(ui, vj));
					
					nx=-1*(x2(ui_1, vj));
					ny=0;
					nz=-1*(z2(ui_1, vj));
					norm=(float)Math.sqrt(nx*nx+ny*ny+nz*nz);
					glNormal3f(nx/norm, ny/norm, nz/norm);
					glVertex3f(x2(ui_1, vj), y2(ui_1, vj), z2(ui_1, vj));
					
					nx=-1*(x2(ui_1, vj_1));
					ny=0;
					nz=-1*(z2(ui_1, vj_1));
					norm=(float)Math.sqrt(nx*nx+ny*ny+nz*nz);
					glNormal3f(nx/norm, ny/norm, nz/norm);
					glVertex3f(x2(ui_1, vj_1), y2(ui_1, vj_1), z2(ui_1, vj_1));
					
					nx=-1*(x2(ui, vj_1));
					ny=0;
					nz=-1*(z2(ui, vj_1));
					norm=(float)Math.sqrt(nx*nx+ny*ny+nz*nz);
					glNormal3f(nx/norm, ny/norm, nz/norm);
					glVertex3f(x2(ui, vj_1), y2(ui, vj_1), z2(ui, vj_1));
				glEnd();
			}
		}
	}

	private float x2(float u, float v) {
		int r0= 1850;
		int r1= 1850;
		float xx = (float) (r0*(Math.cos(u))+(v*Math.cos(u))*(r1-r0));
		return xx;
	}

	private float y2(float u, float v) {
		float yy = (float) (20-v*20);
		return yy;
	}

	private float z2(float u, float v) {
		int r0= 1850;
		int r1= 1850;
		float zz = (float)(r0*(Math.sin(u))+(v*Math.sin(u))*(r1-r0));
		return zz;
	}
	
	private void gehwegInnen() {
		
		int m = 40;
		int n = 30;
		float ul = 0f;
		float ur = (float)((Math.PI)/2);
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
			}
		}
	}

	private float x3(float u, float v) {
		int r0= 0;
		int r1= 350;
		float xx = (float) (r0*(Math.cos(u))+(v*Math.cos(u))*(r1-r0));
		return xx;
	}

	private float y3(float u, float v) {
		float yy = (float) (20);
		return yy;
	}

	private float z3(float u, float v) {
		int r0= 0;
		int r1= 350;
		float zz = (float)(r0*(Math.sin(u))+(v*Math.sin(u))*(r1-r0));
		return zz;
	}
	
	private void bordsteinInnen() {
		float nx,ny,nz;
		float norm;
		int m = 20;
		int n = 10;
		float ul = 0f;
		float ur = (float)((Math.PI)/2);
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

				
				glBegin(GL_TRIANGLE_FAN);
					nx=-1*(x4(ui, vj));
					ny=0;
					nz=-1*(z4(ui, vj));
					norm=(float)Math.sqrt(nx*nx+ny*ny+nz*nz);
					glNormal3f(nx/norm, ny/norm, nz/norm);
					glVertex3f(x4(ui, vj), y4(ui, vj), z4(ui, vj));
					
					nx=-1*(x4(ui_1, vj));
					ny=0;
					nz=-1*(z4(ui_1, vj));
					norm=(float)Math.sqrt(nx*nx+ny*ny+nz*nz);
					glNormal3f(nx/norm, ny/norm, nz/norm);
					glVertex3f(x4(ui_1, vj), y4(ui_1, vj), z4(ui_1, vj));
					
					nx=-1*(x4(ui_1, vj_1));
					ny=0;
					nz=-1*(z2(ui_1, vj_1));
					norm=(float)Math.sqrt(nx*nx+ny*ny+nz*nz);
					glNormal3f(nx/norm, ny/norm, nz/norm);
					glVertex3f(x4(ui_1, vj_1), y4(ui_1, vj_1), z4(ui_1, vj_1));
					
					nx=-1*(x4(ui, vj_1));
					ny=0;
					nz=-1*(z4(ui, vj_1));
					norm=(float)Math.sqrt(nx*nx+ny*ny+nz*nz);
					glNormal3f(nx/norm, ny/norm, nz/norm);
					glVertex3f(x4(ui, vj_1), y4(ui, vj_1), z4(ui, vj_1));
				glEnd();
			}
		}
	}

	private float x4(float u, float v) {
		int r0= 350;
		int r1= 350;
		float xx = (float) (r0*(Math.cos(u))+(v*Math.cos(u))*(r1-r0));
		return xx;
	}

	private float y4(float u, float v) {
		float yy = (float) (20-v*20);
		return yy;
	}

	private float z4(float u, float v) {
		int r0= 350;
		int r1= 350;
		float zz = (float)(r0*(Math.sin(u))+(v*Math.sin(u))*(r1-r0));
		return zz;
	}
}
