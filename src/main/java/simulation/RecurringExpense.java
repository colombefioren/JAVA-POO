package simulation;

import java.time.LocalDate;

public class RecurringExpense extends Expense {
  private Recurrence recurrence;

  public RecurringExpense(String label, double amount, LocalDate date, Recurrence recurrence) {
    super(label, amount, date);
    this.recurrence = recurrence;
  }

  public Recurrence getRecurrence() {
    return recurrence;
  }

  @Override
  public String toString() {
    return "{Expense : {label : "
        + label
        + ", amount : "
        + amount
        + ", date : "
        + date
        + ", recurrence : "
        + recurrence
        + "}}";
  }
}
