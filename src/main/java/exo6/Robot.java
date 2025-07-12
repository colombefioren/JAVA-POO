package exo6;

import java.awt.Point;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Robot {
  protected Point point;
  protected Direction direction;

  public void moveForward() {
    switch (direction) {
      case NORTH -> point.y++;
      case SOUTH -> point.y--;
      case EAST -> point.x++;
      case WEST -> point.x--;
    }
  }

  public void turnRight() {
    switch (direction) {
      case NORTH -> direction = Direction.EAST;
      case EAST -> direction = Direction.SOUTH;
      case SOUTH -> direction = Direction.WEST;
      case WEST -> direction = Direction.NORTH;
    }
  }
}
