package transit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransitTest {
  @Test
  void total_price_should_return_product_price_with_delivery_price_ok() {
    Product product1 = new ElectronicProduct(1, "PC", 500_000, 1);
    Product product2 = new NormalProduct(2, "Pull", 200_000, 0.2);
    Product product3 = new ElectronicProduct(3, "GPU RTX 3060", 300_000, 1.75);
    Product product4 = new ElectronicProduct(4, "RAM", 400_000, 0.1);
    Order order = new Order();
    order.products.add(product1);
    order.products.add(product2);
    order.products.add(product3);
    order.products.add(product4);
    assertEquals(1_626_750, order.getTotalPrice());
  }
}
