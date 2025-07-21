package transit;

public class ElectronicProduct extends Product {

  public ElectronicProduct(int id, String name, double price, double weight) {
    super(id, name, price, weight);
  }

  public double getDeliveryPrice() {
    return 75_000 * this.weight;
  }
}
