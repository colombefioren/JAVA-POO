package exo7;

import lombok.Getter;

@Getter
public class Cloth extends Product {
  private final Size size;
  private final String color;
  private final Fabric fabric;

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

  @Override
  public double calculatePriceTTC() {
    double taxValue = 0;
    switch (this.fabric) {
      case COTON -> taxValue = 10;
      case CUIR -> taxValue = 5;
      case OTHER -> taxValue = 2;
    }
    return this.price * (1 + (taxValue / 100));
  }
}
