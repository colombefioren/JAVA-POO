package exo7;

import lombok.Getter;

@Getter
public class Book extends Product {
  private String author;
  private int nbrPages;

  public Book() {
    this("default", 0, 0, "Unknown", 0);
  }

  public Book(String name, double price, int quantity, String author, int nbrPages) {
    super(name, price, quantity);
    this.author = author;
    this.nbrPages = nbrPages;
  }

  @Override
  public String toString() {
    return "{Book : {name : "
        + name
        + ", price : "
        + price
        + ", quantity : "
        + quantity
        + ", author : "
        + author
        + ", nbrPages : "
        + nbrPages
        + "}}";
  }
}
