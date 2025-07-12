package exo7;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Cloth extends Product {
  private Size size;
  private String color;
  private String fabric;

  Cloth() {
    this(Size.XS, "default", "default");
  }

  @Override
  public String toString() {
    return "{Cloth : {name : "
        + name
        + ", price : "
        + price
        + ", quantity : "
        + quantity
        + ", size : "
        + size
        + ", color : "
        + color
        + ", fabric : "
        + fabric
        + "}}";
  }
}
