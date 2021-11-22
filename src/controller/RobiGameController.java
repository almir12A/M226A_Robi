package controller;

import java.util.ArrayList;

import model.Robi;
import model.Stern;
import processing.core.PApplet;
/**
 * Start und Controller unseres Processing-Games
 * "extends PApplet" ermöglicht Zugriff auf Processing-Funktionalität
 * @author almir
 *
 */
public class RobiGameController extends PApplet{
	Robi r1;
	ArrayList<Stern> sterne;

	public static void main(String[] args) {
		//startet das fenster
		PApplet.main("controller.RobiGameController");

	}
	public void settings() {
		size(800,600);
	}
	@Override
	public void setup() {
		r1= new Robi(100,100,0xFF00FF00);
		
		sterne = new ArrayList<Stern>();  //konstruktur aufruf
		for (int i = 0; i<100;i++){
			Stern s1 = new Stern(random(width),random(height));
			sterne.add(s1);
		}
	}
	@Override
	public void draw() {
		background(0);
		r1.drawRobi(this);
		for(Stern s : sterne){
			if(s.getX() >= 0) {
				s.draw(this); 
			}
		  }
		fill(255);
		textSize(20);
		text("Punkte: "+r1.getScore(), 20,30);
	}
	@Override
	public void keyPressed() {
		switch (keyCode) {
			case UP: r1.setY(max(r1.getY() -20,0)); break;
			case DOWN: r1.setY(min(r1.getY() +20,height)); break;
			case LEFT: r1.setX(max(r1.getX() -20,0)); break;
			case RIGHT: r1.setX(min(r1.getX() +20,width)); break;
		}
		for (Stern s : sterne) {
			if (checkCollision(r1, s)) {
				r1.setScore(r1.getScore()+1);
				//stern "verschwinden" lassen
				s.setX(-100); s.setY(-100);
			}
		}
		int i = 0;
		while(i<sterne.size()) {
			if (sterne.get(i).getX()<0) {
				sterne.remove(i);
			}else {
				i++;
			}
		}
		System.out.println();
	}
	/**
	 * prüft, on roni r gerade auf Stern s trifft
	 * @param r
	 * @param s
	 * @return true wenn r auf s
	 */
	boolean checkCollision(Robi r, Stern s) {
		boolean result = false;
		float a = dist(r.getX(), r.getY(), s.getX(), s.getY());
		return a<32;
	}
}




