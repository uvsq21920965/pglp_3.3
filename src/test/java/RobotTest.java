import static org.junit.Assert.assertEquals;
import org.junit.Test;
import uvsq21920965.Direction;
import uvsq21920965.Position;
import uvsq21920965.Robot;
/**
 * 
 * @author Sarra Belmahdi.
 *
 */
public class RobotTest {
	Position pos1 = new Position(1,2);
	Position pos2 = new Position(3,8);
	Robot r1= new Robot(pos1,Direction.North);
	Robot r2= new Robot(pos2,Direction.West);
/**
 * tester la methode avance.
 */
 @Test
 public void avanceTes() {
	
	 r1.avance();
	 System.out.println(r1.getDirection());
	 System.out.println(r1.getPosition().getX());
	 System.out.println(r1.getPosition().getY());
	 r2.avance();
	 System.out.println(r2.getDirection());
	 System.out.println(r2.getPosition().getX());
	 System.out.println(r2.getPosition().getY());
	
	 

	 assertEquals(r1.getPosition().getX(),1);
	 assertEquals(r1.getPosition().getY(),3);
	 assertEquals(r2.getPosition().getX(),2);
	 assertEquals(r2.getPosition().getY(),8);
	 r1.avance();
	 System.out.println(r1.getDirection());
	 System.out.println(r1.getPosition().getX());
	 System.out.println(r1.getPosition().getY());
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
	 System.out.println(r1.getDirection());
	 System.out.println(r2.getDirection());
	 assertEquals(r1.getDirection(),Direction.East);
	 assertEquals(r2.getDirection(),Direction.North);
	 r1.tourne();
	 assertEquals(r1.getDirection(),Direction.South);
	 
 }

}
