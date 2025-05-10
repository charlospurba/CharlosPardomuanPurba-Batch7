package com.example.demo.service;

import com.example.demo.model.Expense;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExpenseService {

  private final Map<String, Expense> expenseMap = new HashMap<>();

  public List<Expense> getAllExpenses() {
    return new ArrayList<>(expenseMap.values());
  }

  public Expense addOrUpdateExpense(Expense expense) {
    String name = expense.getName();
    if (expenseMap.containsKey(name)) {
      Expense existing = expenseMap.get(name);
      existing.setAmount(existing.getAmount() + expense.getAmount());
      return existing;
    } else {
      expenseMap.put(name, expense);
      return expense;
    }
  }
}
