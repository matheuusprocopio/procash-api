package com.procash.expense;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record Expense(
        UUID id,
        String description,
        BigDecimal amount,
        LocalDate date,
        ExpenseCategory category
) {
}
