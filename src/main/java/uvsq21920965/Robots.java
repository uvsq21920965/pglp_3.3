package uvsq21920965;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Sarra Belmahdi.
 *
 */
public class Robots {
	/**
	 * lise des robots.
	 */
	 private List <RobotStatique> listeRobots;
	    /**
	     * constructeur.
	     */
	    public Robots() {
	        listeRobots = new ArrayList<RobotStatique>();
	    }
	    /**
	    *ajouter un robot
	    * @param robot robot ajouté.
	    */
	    public void addARobot(final RobotStatique robot) {
	      this.listeRobots.add(robot);
	    }
	    /**
	     * avencer tous les robots.
	     */
	    public void avanceTout() {
	       for (RobotStatique robot: listeRobots) {
	          robot.avance();
	      }
	}  
	    /**
	     * acceder à la liste des robots.
	     * @return laliste des robots.
	     */
		public List<RobotStatique> getListeRobots() {
			return listeRobots;
		}

}
