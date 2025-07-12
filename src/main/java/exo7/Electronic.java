package exo7;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Electronic extends Product {
  private String brand;
  private int warranty;

  Electronic() {
    this("default", 0);
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
