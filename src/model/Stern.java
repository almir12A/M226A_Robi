package model;

import processing.core.PApplet;

public class Stern{
	  private float x;
	  private float y;
	  
	  public Stern(float x, float y){
	    this.x = x;
	    this.y = y;
	  }
	  
	  public void draw(PApplet window){
		window.stroke(0xFFFFFFFF);
	    window.fill(0xFFFFFFFF);
	    window.circle(x,y,10); 
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
	}

