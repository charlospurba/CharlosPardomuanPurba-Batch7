package com.example.demo.controller;

import com.example.demo.model.Expense;
import com.example.demo.service.ExpenseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

  private final ExpenseService expenseService;

  public ExpenseController(ExpenseService expenseService) {
    this.expenseService = expenseService;
  }

  @GetMapping
  public List<Expense> getAllExpenses() {
    return expenseService.getAllExpenses();
  }

  @PostMapping
  public ResponseEntity<Expense> addOrUpdateExpense(@RequestBody Expense expense) {
    Expense result = expenseService.addOrUpdateExpense(expense);
    boolean isNew = expense.getAmount() == result.getAmount(); // crude way to detect new vs updated
    return ResponseEntity.status(isNew ? 201 : 200).body(result);
  }
}
