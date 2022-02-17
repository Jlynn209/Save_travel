package com.jeremy.saveTravels.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jeremy.saveTravels.models.Expense;
import com.jeremy.saveTravels.repo.ExpenseRepo;

@Service
public class ExpenseService {
	private final ExpenseRepo expenseRepo;
	
	public ExpenseService(ExpenseRepo expenseRepo) {
		this.expenseRepo = expenseRepo;
	}
	
	public List<Expense> allExpenses() {
		return expenseRepo.findAll();
	}
	
	public Expense createExpense(Expense e) {
		return expenseRepo.save(e);
	}
}
