package exo6;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;
import org.junit.jupiter.api.BeforeEach;

class RobotNGTest {
  private RobotNG myRobot;

  @BeforeEach
  void setUp() {
    myRobot = new RobotNG(new Point(0, 0), Direction.SOUTH);
  }
}
