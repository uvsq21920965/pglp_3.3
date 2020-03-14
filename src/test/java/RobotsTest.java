import fr.uvsq21920965.pglp33.Direction;
import fr.uvsq21920965.pglp33.Position;
import fr.uvsq21920965.pglp33.Robot;
import fr.uvsq21920965.pglp33.RobotStatique;
import fr.uvsq21920965.pglp33.Robots;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class RobotsTest {
	
	Position pos1 = new Position(1,2);
	Position pos2 = new Position(3,8);
	Position pos3 = new Position(2,2);
	Robot r1= new Robot(pos1,Direction.North);
	Robot r2= new Robot(pos2,Direction.West);
	RobotStatique r3 = new RobotStatique(pos3,Direction.South);
	Robots rb1=new Robots();
/**
 * tester la methode addRobot.
 */
  @Test
  public void addRobotTest1() {
	  rb1.addARobot(r1);
	  rb1.addARobot(r2);
	  rb1.addARobot(r3);
	  assertTrue(rb1.getListeRobots().contains(r1));
	  assertTrue(rb1.getListeRobots().contains(r2));
	  assertTrue(rb1.getListeRobots().contains(r3));  
  }
  
  /**
   * tester la methode avanceTout.
   */
  @Test
  public void avanceToutTest2() {
	  rb1.addARobot(r1);
	  rb1.addARobot(r2);
	  rb1.addARobot(r3);
      rb1.avanceTout();
   
   assertEquals(rb1.getListeRobots().get(0).getPosition().getX(),1);
   assertEquals(rb1.getListeRobots().get(0).getPosition().getY(),3);
   assertEquals(rb1.getListeRobots().get(1).getPosition().getX(),2);
   assertEquals(rb1.getListeRobots().get(1).getPosition().getY(),8);
   assertEquals(rb1.getListeRobots().get(2).getPosition().getX(),2);
   assertEquals(rb1.getListeRobots().get(2).getPosition().getX(),2);
  }
  

}
