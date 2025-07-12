package exo7;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Book extends Product {
  private String author;
  private int nbrPages;

  Book() {
    this("Unknown", 0);
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
