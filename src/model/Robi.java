package model;

import processing.core.PApplet;

public class Robi{
	  int mycolor;
	  private float x;
	  private float y;
	  private int score;
	  
	  /*
	  konstruktor, übernimmt Positionvariabeln und Farbe
	  this greift aud das Attribut des aktuellen objekt
	  */
	  public Robi(float x, float y, int mycolor){
	    this.x = x;
	    this.y = y;
	    this.mycolor = mycolor;
	  }
	  
	  public void drawRobi(PApplet window){
		  window.stroke(mycolor);
		  window.fill(mycolor);
		  window.rectMode(PApplet.CENTER); // Center ist eine PApplet definierte Konstante
		  window.rect(x,y,50,50);
		  window.fill(0xFFFFFFFF);
		  window.circle(x-5,y,15);
		  window.circle(x+5,y,15);
		  window.stroke(0x00000000);
		  window.fill(0x00000000);
		  window.circle(x-4,y+1,8);
		  window.circle(x+4,y+1,8);
	}
		public void setX(float x) {
			this.x = x;
		}
		public float getX() {
			return x;
		}
		public void setY(float y) {
			this.y = y;
		}
		public float getY() {
			return y;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public int getScore() {
			return score;
		}
	}

