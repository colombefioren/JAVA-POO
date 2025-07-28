package simulation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExpenseDAO {
  private final List<Expense> expenseList;

  public List<Expense> getExpenseList() {
    return expenseList;
  }

  public ExpenseDAO(List<Expense> expenseList) {
    this.expenseList = expenseList;
  }

  public ExpenseDAO() {
    this.expenseList = new ArrayList<Expense>();
  }

  public List<Expense> getUnRefundedRefundableExpenses() {
    return expenseList.stream()
        .filter(e -> e instanceof RefundableExpense && !((RefundableExpense) e).isRefunded())
        .collect(Collectors.toList());
  }

  public double recurringExpenseTotal() {
    return expenseList.stream()
        .filter(e -> e instanceof RecurringExpense)
        .mapToDouble(Expense::getAmont)
        .sum();
  }

  public List<String> getExpensiveExpenseLabel() {
    return expenseList.stream()
        .filter(Expense::isLargeExpense)
        .map(Expense::getLabel)
        .collect(Collectors.toList());
  }

  public double totalExpense() {
    return expenseList.stream().mapToDouble(Expense::getAmont).sum();
  }
}
