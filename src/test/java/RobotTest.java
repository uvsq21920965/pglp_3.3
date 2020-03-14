import static org.junit.Assert.assertEquals;
import org.junit.Test;
import fr.uvsq21920965.pglp33.Direction;
import fr.uvsq21920965.pglp33.Position;
import fr.uvsq21920965.pglp33.Robot;
import fr.uvsq21920965.pglp33.RobotStatique;
/**
 * 
 * @author Sarra Belmahdi.
 *
 */
public class RobotTest {
	Position pos1 = new Position(1,2);
	Position pos2 = new Position(3,8);
	Position pos3 = new Position(2,2);
	Robot r1= new Robot(pos1,Direction.North);
	Robot r2= new Robot(pos2,Direction.West);
	RobotStatique r3 = new RobotStatique(pos3,Direction.South);

/**
 * tester la methode avance.
 */
 @Test
 public void avanceTest() {
	
	 r1.avance();
	 r2.avance();
	 r3.avance();

	 assertEquals(r1.getPosition().getX(),1);
	 assertEquals(r1.getPosition().getY(),3);
	 assertEquals(r2.getPosition().getX(),2);
	 assertEquals(r2.getPosition().getY(),8);
	 assertEquals(r3.getPosition().getX(),2);
	 assertEquals(r3.getPosition().getY(),2);
	 r1.avance();
	 assertEquals(r1.getPosition().getX(),1);
	 assertEquals(r1.getPosition().getY(),4);
 }
 
 /**
  * tester la methode move.
  */
 @Test
 public void moveTest() {
	
	 r1.tourne();
	 r2.tourne();
	 assertEquals(r1.getDirection(),Direction.East);
	 assertEquals(r2.getDirection(),Direction.North);
	 r1.tourne();
	 assertEquals(r1.getDirection(),Direction.South);
	 
 }

}
