package transit;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Order {
  List<Product> products;

  Order() {
    products = new ArrayList<>();
  }

  public double getTotalPrice() {
    return products.stream().mapToDouble(Product::priceWithDelivery).sum();
  }
}
