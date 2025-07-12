package exo7;

import lombok.Getter;

@Getter
public class Electronic extends Product {
  private String brand;
  private int warranty;

  public Electronic() {
    this("default", 0, 0, "default", 0);
  }

  public Electronic(String name, double price, int quantity, String brand, int warranty) {
    super(name, price, quantity);
    this.brand = brand;
    this.warranty = warranty;
  }

  @Override
  public String toString() {
    return "{Electronic : {name : "
        + name
        + ", price : "
        + price
        + ", quantity : "
        + quantity
        + ", brand : "
        + brand
        + ", warranty : "
        + warranty
        + "}}";
  }
}
