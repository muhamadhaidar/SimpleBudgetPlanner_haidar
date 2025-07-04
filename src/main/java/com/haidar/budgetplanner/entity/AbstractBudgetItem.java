package com.haidar.budgetplanner.entity;

public abstract class AbstractBudgetItem {
    private String description;
    private double amount;
    private String jenis;

    public AbstractBudgetItem() {}

    public AbstractBudgetItem(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public abstract String getType();
}
