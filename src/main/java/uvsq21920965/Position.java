package uvsq21920965;

public class Position {
	private int x;
	private int y;
	
	public Position(final int initialX, final int initialY) {
	  this.x = initialX;
	  this.y = initialY;
	}
	
	public void moveX(final int nbCases) {
	      this.x += nbCases;
	}
	public void moveY(final int nbCases) {
	      this.y += nbCases;
	}
	
	public int getX() {
	      return this.x;
	}

	public int getY() {
	      return this.y;
	}

}
