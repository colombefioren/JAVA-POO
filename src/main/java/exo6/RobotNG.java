package exo6;

import lombok.Getter;

@Getter
public class RobotNG extends Robot {
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
