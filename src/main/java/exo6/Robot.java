package exo6;

import java.awt.Point;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Robot {
  private Point point;
  private Direction direction;

  public void moveFoward() {
    switch (direction) {
      case NORTH -> point.x++;
      case SOUTH -> point.x--;
      case EAST -> point.y++;
      case WEST -> point.y--;
    }
  }

  public void changeDirection() {
    switch (direction) {
      case NORTH -> direction = Direction.EAST;
      case EAST -> direction = Direction.SOUTH;
      case SOUTH -> direction = Direction.WEST;
      case WEST -> direction = Direction.NORTH;
    }
  }
}
