package exo6;

import java.awt.*;
import lombok.Getter;

@Getter
public class RobotNG extends Robot {

  public RobotNG(Point point, Direction direction) {
    super(point, direction);
  }

  public RobotNG() {
    super();
  }

  public void turnLeft() {
    for (int i = 0; i < 3; i++) {
      turnRight();
    }
  }

  public void moveForward(int step) {
    switch (direction) {
      case NORTH -> point.x += step;
      case SOUTH -> point.x -= step;
      case EAST -> point.y += step;
      case WEST -> point.y -= step;
    }
  }

  public void moveBackwardsFaster(int step) {
    switch (direction) {
      case NORTH -> point.x -= step;
      case SOUTH -> point.x += step;
      case EAST -> point.y -= step;
      case WEST -> point.y += step;
    }
  }
}
