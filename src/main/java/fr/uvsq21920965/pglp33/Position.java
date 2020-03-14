package fr.uvsq21920965.pglp33;

/**
 * position classe.
 *
 * @author sarra Belmahdi.
 */

public class Position {
  /**
  * coordonnee x du position.
  */
  private int positionX;

  /**
  * coordonnee y du position.
  */
  private int positionY;

  /**
  * constructeur.
  * @param initialX cordonnee x initial.
  * @param initialY  cordonne  y initial.
  */
  public Position(final int initialX, final int initialY) {
    this.positionX = initialX;
    this.positionY = initialY;
  }

  /**
   *  bouger par nbcase àpartir de position x.
   * @param nbCases nombre de case à avancer
   */
  public void moveX(final int nbCases) {
    this.positionX += nbCases;
  }

  /**
   *  bouger par nbcase à partir de position y.
   * @param nbCases nombre de case à avancer
   */
  public void moveY(final int nbCases) {
    this.positionY += nbCases;
  }

  /**
   * acceder à la position x.
   * @return coordonne x du position actuelle.
   */
  public int getX() {
    return this.positionX;
  }

  /**
   * acceder à la aposition y .
   * @return cordonne y du position actuelle.
   */
  public int getY() {
    return this.positionY;
  }

}
