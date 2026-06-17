package com.procash.expense;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CreateExpenseRequest(
        @NotBlank
        String descricao,

        @NotNull
        @DecimalMin(value = "0.01")
        BigDecimal valor,

        @NotNull
        LocalDate data,

        @NotNull
        ExpenseCategory categoria
) {
}
