package exo6;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RobotNGTest {
  private RobotNG myRobot;

  @BeforeEach
  void setUp() {
    myRobot = new RobotNG(new Point(0, 0), Direction.SOUTH);
  }

  @Test
  void testMovingForward() {
    myRobot.moveForward();
    assertEquals(new Point(0, -1), myRobot.getPoint());
  }

  @Test
  void testTurnLeft() {
    myRobot.turnLeft();
    assertEquals(Direction.EAST, myRobot.getDirection());
  }

  @Test
  void testMovingForwardWithSteps() {
    myRobot.moveForward(7);
    assertEquals(new Point(0, -7), myRobot.getPoint());
  }

  @Test
  void testMovingBackwardsFaster() {
    myRobot.moveBackwardsFaster(7);
    assertEquals(new Point(0, 7), myRobot.getPoint());
  }
}
