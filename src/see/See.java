package see;

import static org.lwjgl.opengl.GL11.*;

public class See {

	float material_Wasser1 [] = {0f, 0.255f, 0.255f, 1.0f};
	float material_Wasser2 [] = {0f, 0.255f, 0.255f, 1.0f};
	float material_Wasser3 [] = {0f, 0.255f, 0.255f, 1.0f};
	
	public void drawsee(){
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Wasser1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Wasser2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Wasser3);
		glMaterialf(GL_FRONT, GL_SHININESS, 90.8f);
		drawSee();
	}
	
	private void drawSee() {
		
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
					glTranslatef(-31300, 4, -1300);
					glRotatef(60, 0, 1, 0);
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
		int r1= 20000;
		float xx = (float) (r0*(Math.cos(u))+(v*Math.cos(u))*(r1-r0));
		return xx;
	}

	private float y1(float u, float v) {
		float yy = (float) (0);
		return yy;
	}

	private float z1(float u, float v) {
		int r0= 0;
		int r1= 30000;
		float zz = (float)(r0*(Math.sin(u))+(v*Math.sin(u))*(r1-r0));
		return zz;
	

	}
}
