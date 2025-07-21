package transit;

import java.awt.*;

public class NormalProduct extends Product {
  NormalProduct(int id, String name, double price, double weight) {
    super(id, name, price, weight);
  }

  public double getDeliveryPrice() {
    return 65_000 * this.weight;
  }
}
