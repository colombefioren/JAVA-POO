package transit;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Product {
  protected int id;
  protected String name;
  protected double price;
  protected double weight;

  public abstract double getDeliveryPrice();

  public double priceWithDelivery() {
    return this.price + this.getDeliveryPrice();
  }
  ;
}
