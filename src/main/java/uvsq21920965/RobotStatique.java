package uvsq21920965;

public class RobotStatique {
private Position position;
private Direction direction;
 
 public RobotStatique(final Position posi, final Direction dictionAtt) {
        this.position = new Position(posi.getX(),posi.getY());
        this.direction = dictionAtt;
 }

public void avance() { }

public Direction getDirection() {
    return direction;
  }


public Position getPosition() {
return position;
}
public void setDirection(final Direction dict) {
    this.direction = dict;
}
}
