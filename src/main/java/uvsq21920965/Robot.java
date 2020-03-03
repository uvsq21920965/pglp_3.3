package uvsq21920965;

public class Robot extends RobotStatique {
	
	public Robot(final Position pos, final Direction dict) {
	   super(pos, dict);
	}

	@Override
	public void avance() {
	    switch (this.getDirection()) {
	        case North:
	            this.getPosition().moveY(1);
	        case South:
	            this.getPosition().moveY(-1);
	        case East:
	            this.getPosition().moveX(1);
	        case West:
	            this.getPosition().moveX(-1);
	        default:

	    }
	}
	public void tourne() {
	    switch (this.getDirection()) {
	    case North:
	        this.setDirection(Direction.East);
	    case South:
	        this.setDirection(Direction.West);
	    case East:
	        this.setDirection(Direction.North);
	    case West:
	        this.setDirection(Direction.South);
	    default:
	}
	}
	

}
