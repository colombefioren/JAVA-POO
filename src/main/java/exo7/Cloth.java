package exo7;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Cloth extends Product {
  private Size size;
  private String color;
  private Fabric fabric;

  Cloth() {
    this(Size.XS, "default", Fabric.OTHER);
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
