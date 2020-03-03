package uvsq21920965;

import java.util.ArrayList;
import java.util.List;

public class Robots {
	 private List <RobotStatique> listeRobots;
	    
	    public Robots() {
	        listeRobots = new ArrayList<RobotStatique>();
	    }
	    /**
	    *
	    * @param robot robot to be added to robots list.
	    */
	    public void addARobot(final RobotStatique robot) {
	      this.listeRobots.add(robot);
	    }
	    public void avanceTout() {
	       for (RobotStatique robot: listeRobots) {
	          robot.avance();
	      }
	}

}
