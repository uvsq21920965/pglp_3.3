package uvsq21920965;
/**
 * 
 * @author sarra belmahdi.
 *
 */
public class Robot extends RobotStatique {
	/**
	 * constructeur.
	 * @param pos position initiale.
	 * @param dict direction initale.
	 */
	public Robot(final Position pos, final Direction dict) {
	   super(pos, dict);
	}
    /**
     * avancer le robot par une case.
     */
	@Override
	public void avance() {
	    switch (this.getDirection()) {
	        case North:
	            this.getPosition().moveY(1);
	        case East:
	            this.getPosition().moveX(1);
	        case West:
	            this.getPosition().moveX(-1);
	        case South:
	            this.getPosition().moveY(-1);
	        default:

	    }
	}
	/**
	 * tourner le robote 1/4 de tour.
	 */
	public void tourne() {
	    switch (this.getDirection()) {
	    case North:
	        this.setDirection(Direction.East);
	    case East:
	        this.setDirection(Direction.North);
	    case West:
	        this.setDirection(Direction.South);
	    case South:
	        this.setDirection(Direction.West);
	    default:
	}
	}
	

}
