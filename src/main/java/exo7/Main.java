package exo7;

public class Main {
  public static void main(String[] args) {

    // Cloth
    Cloth cloth = new Cloth("Dress", 2000, 3, Size.XS, "red", Fabric.CUIR);
    System.out.println(cloth);
    System.out.println(cloth.calculateStockValue());

    // Electronic
    Electronic electronic = new Electronic("Phone", 1000000, 1, "Apple", 12);
    System.out.println(electronic);
    System.out.println(electronic.calculateStockValue());

    // Book
    Book book = new Book("A Court Of Thorns And Roses", 500, 5, "Sarah J. Maas", 256);
    System.out.println(book);
    System.out.println(book.calculateStockValue());
  }
}
