package com.procash.expense;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ExpenseService {

    private final List<Expense> expenses = new ArrayList<>();

    public List<Expense> findAll() {
        return expenses;
    }

    public Expense create(CreateExpenseRequest request) {
        Expense expense = new Expense(
                UUID.randomUUID(),
                request.description(),
                request.amount(),
                request.date(),
                request.category()
        );

        expenses.add(expense);
        return expense;
    }
}
