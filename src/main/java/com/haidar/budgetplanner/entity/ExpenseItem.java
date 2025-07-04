package com.haidar.budgetplanner.entity;

import com.haidar.budgetplanner.interfaces.Notifiable;

public class ExpenseItem extends AbstractBudgetItem implements Notifiable {

    public ExpenseItem(String description, double amount) {
        super(description, amount);
        setJenis("pengeluaran");
    }

    @Override
    public String getType() {
        return "Pengeluaran";
    }

    @Override
    public void notifyUser(String message) {

    }
}
