package fr.uvsq21920965.pglp33;

/**
  * RobotStatique Class.
  * @author Sarra Belmahdi.
  *
  */
public class RobotStatique {

  /**
   * position du robot.
   */
  private Position position;

  /**
   * directuion du robot.
   */
  private Direction direction;

  /**
   * constructeur.
   * @param posi position du robot initaile.
   * @param dictionAtt direction du robot initiale.
   */
  public RobotStatique(final Position posi, final Direction dictionAtt) {
    this.position = new Position(posi.getX(), posi.getY());
    this.direction = dictionAtt;
  }

  /**
   * avencer le robot.
   */
  public void avance() {

  }

  /**
   * acceder à la direction du robot.
   * @return la direction actuelle.
   */
  public Direction getDirection() {
    return direction;
  }

  /**
   * acceder à la position du robot.
   * @return position actuelle.
   */
  public Position getPosition() {
    return position;
  }

  /**
   * modifier la direction.
   * @param dict nouvelle direction.
   */
  public void setDirection(final Direction dict) {
    this.direction = dict;
  }
}
