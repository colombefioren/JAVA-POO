package simulation;

import java.time.LocalDate;

public class Expense {
  protected final String label;
  protected final double amount;
  protected final LocalDate date;

  public Expense(String label, double amount, LocalDate date) {
    this.label = label;
    this.amount = amount;
    this.date = date;
  }

  public String getLabel() {
    return label;
  }

  public double getAmont() {
    return amount;
  }

  public LocalDate getDate() {
    return date;
  }

  public boolean isLargeExpense() {
    return amount > 100;
  }

  @Override
  public String toString() {
    return "{Expense : {label : " + label + ", amount : " + amount + ", date : " + date + "}}";
  }
}
