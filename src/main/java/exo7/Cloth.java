package exo7;

import lombok.Getter;

@Getter
public class Cloth extends Product {
  private Size size;
  private String color;
  private Fabric fabric;

  public Cloth() {
    this("default", 0, 0, Size.XS, "default", Fabric.OTHER);
  }

  public Cloth(String name, double price, int quantity, Size size, String color, Fabric fabric) {
    super(name, price, quantity);
    this.size = size;
    this.color = color;
    this.fabric = fabric;
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
