package com.procash.expense;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ExpenseService {

    private final List<Expense> expenses = new ArrayList<>();

    public List<Expense> findAll() {
        return expenses;
    }

    public Optional<Expense> findById(UUID id) {
        return expenses.stream()
                .filter(expense -> expense.id().equals(id))
                .findFirst();
    }

    public Expense create(CreateExpenseRequest request) {
        Expense expense = new Expense(
                UUID.randomUUID(),
                request.descricao(),
                request.valor(),
                request.data(),
                request.categoria()
        );

        expenses.add(expense);
        return expense;
    }
}
