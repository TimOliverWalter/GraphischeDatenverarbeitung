package auto;

import licht.Licht;

import static org.lwjgl.opengl.GL11.*;

public class Sihlouette {
	
	MyObject object = new MyObject();
	Rad rad = new Rad();
	KotfluegelHinten kotfluegelhinten = new KotfluegelHinten();
	KotfluegelVorne kotfluegelvorne = new KotfluegelVorne();
	FensterfrontLinks fensterlinks = new FensterfrontLinks();
	FensterfrontRechts fensterrechts = new FensterfrontRechts();
	Licht licht = new Licht();
	
	float material_Kupfer1 [] = {0.23f, 0.09f, 0.03f, 1.0f};
	float material_Kupfer2 [] = {0.70f, 0.27f, 0.08f, 1.0f};
	float material_Kupfer3 [] = {0.26f, 0.14f, 0.09f, 1.0f};
	
	float material_Gummi1 [] = {0.02f, 0.02f, 0.02f, 1.0f};
	float material_Gummi2 [] = {0.01f, 0.01f, 0.01f, 1.0f};
	float material_Gummi3 [] = {0.40f, 0.40f, 0.40f, 1.0f};

	float material_Tuerkis1 [] = {0.10f, 0.19f, 0.17f, 0.8f};
	float material_Tuerkis2 [] = {0.40f, 0.74f, 0.69f, 0.8f};
	float material_Tuerkis3 [] = {0.30f, 0.31f, 0.31f, 0.8f};
	
	float material_Rubin1 [] = {0.17f, 0.01f, 0.17f, 0.5f};
	float material_Rubin2 [] = {0.61f, 0.04f, 0.04f, 0.5f};
	float material_Rubin3 [] = {0.73f, 0.63f, 0.63f, 0.5f};
	
	float material_Perle1 [] = {0.25f, 0.21f, 0.21f, 0.9f};
	float material_Perle2 [] = {0.99f, 0.83f, 0.83f, 0.9f};
	float material_Perle3 [] = {0.30f, 0.30f, 0.30f, 0.9f};
	
	float Emission_licht [] = {1, 0, 0, 1};
	float Emission_aus [] = {0, 0, 0, 1};

	public void draw() {
		drawWuerfel();
	}
	
	private void drawWuerfel() {
	
		
	//Frontscheibe
	glPushMatrix();
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
		glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
		glTranslatef(0, 104.031f, 249.239f);
		glRotatef(210,1,0,0);		
		object.drawfacettiertesRechteck();
	glPopMatrix();
	
	// Haube
	glPushMatrix();
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Kupfer1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Kupfer2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Kupfer3);
		glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
		glTranslatef(0, 8.71f, 99.61f);
		glRotatef(85f,1,0,0);
		object.drawfacettiertesQuadrat();
	glPopMatrix();
	
	//Dach
	glPushMatrix();
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Kupfer1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Kupfer2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Kupfer3);
		glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
		glTranslatef(0, 104.031f, 349.239f);
		glRotatef(90f,1,0,0);
		object.drawfacettiertesQuadrat();
	glPopMatrix();
	
	//Dach pink
	glPushMatrix();
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Kupfer1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Kupfer2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Kupfer3);
		glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
		glTranslatef(0, 104.031f, 449.239f);
		glRotatef(90f,1,0,0);
		object.drawfacettiertesQuadrat();
	glPopMatrix();
	
	//Kühler
	glPushMatrix();
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Kupfer1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Kupfer2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Kupfer3);
		glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
		glRotatef(180f,1,0,0);		
		object.drawfacettiertesRechteck();
	glPopMatrix();
	
	//Heckscheibe
	glPushMatrix();
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Tuerkis1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Tuerkis2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Tuerkis3);
		glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);		
		glTranslatef(0, 104.031f, 549.239f);			
		glRotatef(170f,1,0,0);
		object.drawHeckscheibe();
	glPopMatrix();
		
	//Heckklappe
	glPushMatrix();
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Kupfer1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Kupfer2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Kupfer3);
		glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
		glRotatef(180f,1,0,0);
		glTranslatef(0, 0, -567.582f);
		object.drawfacettiertesRechteck();
	glPopMatrix();
		
	//Seitenwand rechts
	glPushMatrix();
		glMaterialfv(GL_FRONT, GL_AMBIENT, material_Kupfer1);
		glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Kupfer2);
		glMaterialfv(GL_FRONT, GL_SPECULAR, material_Kupfer3);
		glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
		glRotatef(270f,0,1,0);
		glTranslatef(150, -100, -100);
		object.drawAutoseite();
	glPopMatrix();
		
	//Seitenwand rechts hellblau
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Kupfer1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Kupfer2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Kupfer3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glRotatef(90,0,1,0);
			glTranslatef(-417.582f, -100, -100);
			object.drawAutoseite();
		glPopMatrix();
		
	//Kotflügel hinten links 
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Kupfer1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Kupfer2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Kupfer3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glRotatef(90f,0,1,0);
			glTranslatef(-517.582f, -50, -100);
			kotfluegelhinten.drawKotfluegel();
		glPopMatrix();
		
	//Kotflügel hinten rechts 
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Kupfer1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Kupfer2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Kupfer3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glRotatef(270f,0,1,0);
			glTranslatef(467.582f, -50, -100);
			kotfluegelhinten.drawKotfluegel();
		glPopMatrix();
		
	//Kotflügel vorne links
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Kupfer1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Kupfer2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Kupfer3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glRotatef(90f,0,1,0);
			glTranslatef(-100, -50, -100);
			kotfluegelvorne.drawKotfluegel();
		glPopMatrix();
		
	//Kotflügel vorne rechts 
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Kupfer1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Kupfer2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Kupfer3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glRotatef(270f,0,1,0);
			glTranslatef(50, -50, -100);
			kotfluegelvorne.drawKotfluegel();
		glPopMatrix();
		
	//Rad vorne links
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gummi1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gummi2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gummi3);
			glMaterialf(GL_FRONT, GL_SHININESS, 10.0f);
			glRotatef(270f,0,1,0);
			glTranslatef(75, -120, 80);
			rad.drawRad();
		glPopMatrix();
		
	//Rad vorne rechts
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gummi1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gummi2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gummi3);
			glMaterialf(GL_FRONT, GL_SHININESS, 10.0f);
			glRotatef(90f,0,1,0);
			glTranslatef(-75, -120, 80);
			rad.drawRad();
		glPopMatrix();
			
	//Rad hinten rechts
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gummi1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gummi2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gummi3);
			glMaterialf(GL_FRONT, GL_SHININESS, 10.0f);			
			glRotatef(90f,0,1,0);
			glTranslatef(-492.582f, -120, 80);
			rad.drawRad();
		glPopMatrix();
		
	//Rad hinten links
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gummi1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gummi2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gummi3);
			glMaterialf(GL_FRONT, GL_SHININESS, 10.0f);
			glRotatef(270f,0,1,0);
			glTranslatef(492.582f, -120, 80);
			rad.drawRad();
		glPopMatrix();
		
	//Ersatzreifen
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gummi1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gummi2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gummi3);
			glMaterialf(GL_FRONT, GL_SHININESS, 10.0f);
			glTranslatef(0, -20, 567.6f);
			rad.drawRad();
		glPopMatrix();
		
	//AbdeckungHaubeKotflügel rechts
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Kupfer1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Kupfer2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Kupfer3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(100, 0, 0);
			glRotatef(90, 0, 1, 0);
			object.drawAbdeckungHaubeKotfluegel();
		glPopMatrix();

	//AbdeckungHaubeKotflügel rechts
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Kupfer1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Kupfer2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Kupfer3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glTranslatef(-100, 0, 0);
			glRotatef(90, 0, 1, 0);
			object.drawAbdeckungHaubeKotfluegel();
		glPopMatrix();

	//Fensterfront links
		glPushMatrix();
			glRotatef(90, 0, -1, 0);
			glTranslatef(300, -100, 100);
			fensterlinks.drawFensterfrontLinks();
		glPopMatrix();
		
	//Fensterfront rechts
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Kupfer1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Kupfer2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Kupfer3);
			glMaterialf(GL_FRONT, GL_SHININESS, 12.8f);
			glRotatef(90, 0, -1, 0);
			glTranslatef(300, -100, -100);
			fensterrechts.drawFensterfrontRechts();
		glPopMatrix();
		
	//Kühler vorne1
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gummi1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gummi2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gummi3);
			glMaterialf(GL_FRONT, GL_SHININESS, 10.0f);
			glRotatef(90, 0, 0, 1);
			glRotatef(180, 1, 0, 0);
			glTranslatef(-15, -70, 0);
			object.drawKuehler();
		glPopMatrix();
		
	//Kühler vorne2
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gummi1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gummi2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gummi3);
			glMaterialf(GL_FRONT, GL_SHININESS, 10.0f);
			glRotatef(90, 0, 0, 1);
			glRotatef(180, 1, 0, 0);
			glTranslatef(-35, -70, 0);
			object.drawKuehler();
		glPopMatrix();
		
	//Kühler vorne2
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gummi1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gummi2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gummi3);
			glMaterialf(GL_FRONT, GL_SHININESS, 10.0f);
			glRotatef(90, 0, 0, 1);
			glRotatef(180, 1, 0, 0);
			glTranslatef(-55, -70, 0);
			object.drawKuehler();
		glPopMatrix();
		
	//Stoßstange vorne
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gummi1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gummi2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gummi3);
			glMaterialf(GL_FRONT, GL_SHININESS, 10.0f);
			glRotatef(90, 0, 0, 1);
			glRotatef(180, 1, 0, 0);
			glTranslatef(-90, -100, 0);
			object.drawStossstange1();
		glPopMatrix();
		
	//Stoßstange hinten
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gummi1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gummi2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gummi3);
			glMaterialf(GL_FRONT, GL_SHININESS, 10.0f);
			glRotatef(90, 0, 0, 1);
			glTranslatef(-90, -100,  567.582f);
			object.drawStossstange1();
		glPopMatrix();
		
	//Stoßstange rechts
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gummi1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gummi2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gummi3);
			glMaterialf(GL_FRONT, GL_SHININESS, 10.0f);
			glRotatef(90, 0, 0, 1);
			glRotatef(90, 1, 0, 0);
			glTranslatef(-87.5f, 150, 100);
			object.drawStossstange2();
		glPopMatrix();
		
	//Stoßstange links
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Gummi1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Gummi2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Gummi3);
			glMaterialf(GL_FRONT, GL_SHININESS, 10.0f);
			glRotatef(90, 0, 0, 1);
			glRotatef(270, 1, 0, 0);
			glTranslatef(-87.5f, -415, 100);
			object.drawStossstange2();
		glPopMatrix();
		
	//Rücklicht rechts oben
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Rubin1);
			glMaterialfv(GL_FRONT, GL_EMISSION, Emission_licht);				
			glTranslatef(80, -15, 567.65f);
			glRotatef(180, 1, 0, 0);
			object.drawScheibe();
			glMaterialfv(GL_FRONT, GL_EMISSION, Emission_aus);
		glPopMatrix();
		
	//Rücklicht rechts unten
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Rubin1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Rubin2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Rubin3);
			glMaterialf(GL_FRONT, GL_SHININESS, 76.8f);			
			glTranslatef(80, -30, 567.6f);
			glRotatef(180, 1, 0, 0);
			object.drawScheibe();
		glPopMatrix();
		
	//Rücklicht links unten
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Rubin1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Rubin2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Rubin3);
			glMaterialf(GL_FRONT, GL_SHININESS, 76.8f);			
			glTranslatef(-80, -30, 567.6f);
			glRotatef(180, 1, 0, 0);
			object.drawScheibe();
		glPopMatrix();
		
	//Rücklicht links oben
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Rubin1);
			glMaterialfv(GL_FRONT, GL_EMISSION, Emission_licht);		
			glTranslatef(-80, -15, 567.65f);
			glRotatef(180, 1, 0, 0);
			object.drawScheibe();
			glMaterialfv(GL_FRONT, GL_EMISSION, Emission_aus);
		glPopMatrix();
		
		
	//Scheinwerfer links oben
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Perle1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Perle2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Perle3);
			glMaterialf(GL_FRONT, GL_SHININESS, 11.3f);			
			glTranslatef(80, -15, -0.1f);
			glRotatef(180, 1, 0, 0);
			object.drawScheibe();
		glPopMatrix();
		
	//Scheinwerfer links unten
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Perle1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Perle2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Perle3);
			glMaterialf(GL_FRONT, GL_SHININESS, 11.3f);			
			glTranslatef(80, -30, -0.1f);
			glRotatef(180, 1, 0, 0);
			object.drawScheibe();
		glPopMatrix();
		
	//Scheinwerfer rechts unten
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Perle1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Perle2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Perle3);
			glMaterialf(GL_FRONT, GL_SHININESS, 11.3f);			
			glTranslatef(-80, -30, -0.1f);
			glRotatef(180, 1, 0, 0);
			object.drawScheibe();
		glPopMatrix();
		
	//Scheinwerfer rechts oben
		glPushMatrix();
			glMaterialfv(GL_FRONT, GL_AMBIENT, material_Perle1);
			glMaterialfv(GL_FRONT, GL_DIFFUSE, material_Perle2);
			glMaterialfv(GL_FRONT, GL_SPECULAR, material_Perle3);
			glMaterialf(GL_FRONT, GL_SHININESS, 11.3f);	
			glTranslatef(-80, -15, -0.1f);
			glRotatef(180, 1, 0, 0);
			object.drawScheibe();
		glPopMatrix();
		
		//Lichtquellen
		glPushMatrix();
			licht.scheinwerferLinks();
			licht.scheinwerferRechts();
		glPopMatrix();
			
	}
	
}
