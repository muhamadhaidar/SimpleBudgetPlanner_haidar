package com.haidar.budgetplanner.entity;

import com.haidar.budgetplanner.interfaces.Notifiable;

public class PengeluaranItem extends AbstractBudgetItem implements Notifiable {

    public PengeluaranItem() {
        setJenis("pengeluaran"); // default jenis
    }

    @Override
    public String getType() {
        return "Pengeluaran";
    }

    @Override
    public void notifyUser(String message) {
        System.out.println("[NOTIFY] " + message);
    }
}
