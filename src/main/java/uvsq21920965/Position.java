package uvsq21920965;
/**
 * 
 * @author sarra Belmahdi.
 *
 */
public class Position {
	/**
	 * coordonnee x du position.
	 */
	private int x;
	/**
	 * coordonnee y du position.
	 */
	private int y;
	/**
	 * constructeur.
	 * @param initialX cordonnee x initial.
	 * @param initialY  cordonne  y initial.
	 */
	public Position(final int initialX, final int initialY) {
	  this.x = initialX;
	  this.y = initialY;
	}
	/**
	 *  bouger par nbcase àpartir de position x.
	 * @param nbCases nombre de case à avancer
	 */
	public void moveX(final int nbCases) {
	      this.x += nbCases;
	}
	/**
	 *  bouger par nbcase à partir de position y.
	 * @param nbCases nombre de case à avancer
	 */
	public void moveY(final int nbCases) {
	      this.y += nbCases;
	}
	/**
	 * acceder à la position x.
	 * @return coordonne x du position actuelle.
	 */
	
	public int getX() {
	      return this.x;
	}
    /**
     * acceder à la aposition y .
     * @return cordonne y du position actuelle.
     */
	public int getY() {
	      return this.y;
	}

}
