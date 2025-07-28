package simulation;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimulationTest {
  Expense refundableExpense1;
  Expense refundableExpense2;
  Expense refundableExpense3;
  Expense recurringExpense1;
  Expense recurringExpense2;
  ExpenseDAO myExpenseDAO;

  @BeforeEach
  void setUp() {
    refundableExpense1 = new RefundableExpense("Cuisine", 250, null, false);
    refundableExpense2 = new RefundableExpense("Transport", 10, null, true);
    refundableExpense3 = new RefundableExpense("Holiday", 100, null, true);
    recurringExpense1 = new RecurringExpense("Spotify", 50, null, Recurrence.YEARLY);
    recurringExpense2 = new RecurringExpense("Shopping", 300, null, Recurrence.MONTHLY);

    myExpenseDAO =
        new ExpenseDAO(
            new ArrayList<Expense>(
                Arrays.asList(
                    refundableExpense1,
                    refundableExpense2,
                    refundableExpense3,
                    recurringExpense1,
                    recurringExpense2)));
  }

  @Test
  void should_return_every_unrefunded_refundable_expenses() {
    List<Expense> expectedList = new ArrayList<>(List.of(refundableExpense1));
    assertEquals(expectedList, myExpenseDAO.getUnRefundedRefundableExpenses());
  }

  @Test
  void should_return_recurring_expense_total() {
    assertEquals(350, myExpenseDAO.recurringExpenseTotal());
  }

  @Test
  void should_return_expensive_expense_label() {
    List<String> expectedList = new ArrayList<>(Arrays.asList("Cuisine", "Shopping"));
    assertEquals(expectedList, myExpenseDAO.getExpensiveExpenseLabel());
  }

  @Test
  void should_return_total_expense() {
    assertEquals(710, myExpenseDAO.totalExpense());
  }
}
