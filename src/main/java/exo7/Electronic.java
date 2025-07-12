package exo7;

import lombok.Getter;

@Getter
public class Electronic extends Product {
  private final String brand;
  private final int warranty;

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

  @Override
  public double calculatePriceTTC() {
    return this.price * (1 + 0.15 + (this.warranty > 12 ? 0.05 : 0));
  }
}
