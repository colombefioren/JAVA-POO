package exo7;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Product {
  protected String name;
  protected double price;
  protected int quantity;

  public Product() {
    this("default", 0, 0);
  }

  @Override
  public String toString() {
    return "{Product : {name : " + name + ", price : " + price + ", quantity : " + quantity + "}}";
  }

  public double calculateStockValue() {
    return this.price * this.quantity;
  }

  public double calculatePriceTTC() {
    return this.price;
  }
}
