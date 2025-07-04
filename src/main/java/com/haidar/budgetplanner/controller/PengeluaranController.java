package com.haidar.budgetplanner.controller;

import com.haidar.budgetplanner.entity.BudgetItem;
import com.haidar.budgetplanner.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/pengeluaran")
public class PengeluaranController {

    @Autowired
    private BudgetService budgetService;

    @GetMapping
    public String formPengeluaran(Model model) {
        model.addAttribute("budgetItem", new BudgetItem());
        return "form";
    }

    @PostMapping
    public String submitPengeluaran(@ModelAttribute BudgetItem budgetItem, RedirectAttributes redirectAttributes) {
    budgetItem.setKategori("pengeluaran");
    budgetItem.setJenis("pengeluaran");

    budgetService.save(budgetItem);

    redirectAttributes.addFlashAttribute("notif", 
        "Pengeluaran berhasil: " + budgetItem.getKeterangan() + " - Rp" + budgetItem.getJumlah());

    return "redirect:/home";
    }


    @PostMapping("/{id}/hapus")
    public String hapusSatu(@PathVariable Long id) {
        budgetService.delete(id);
        return "redirect:/home";
    }

    @PostMapping("/hapus-semua")
    public String hapusSemua() {
        budgetService.hapusSemua();
        return "redirect:/home";
    }
}