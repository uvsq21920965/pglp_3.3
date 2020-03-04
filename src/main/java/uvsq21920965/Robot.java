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
	            break;
	        case East:
	            this.getPosition().moveX(1);
	            break;
	        case West:
	            this.getPosition().moveX(-1);
	            break;
	        case South:
	            this.getPosition().moveY(-1);
	            break;
	        default:break;

	    }
	}
	/**
	 * tourner le robote 1/4 de tour.
	 */
	public void tourne() {
	    switch (this.getDirection()) {
	    case North:
	        this.setDirection(Direction.East);
	         break;
	    case East:
	        this.setDirection(Direction.South);
	        break;
	    case West:
	        this.setDirection(Direction.North);
	        break;
	    case South:
	        this.setDirection(Direction.West);
	        break;
	    default:break;
	}
	}
	

}
