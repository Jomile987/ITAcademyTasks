import { Injectable } from '@angular/core';
import { expensesList } from '../shared/DATA';
import { BudgetExpense } from '../shared/types';

@Injectable({
  providedIn: 'root'
})
export class ServiceBudgetService {
  budget: BudgetExpense[] = expensesList;

  constructor() { }

  getExpenses() {
    return this.budget;
  }
  getExpense(id: string) {
    return this.budget.find((expense) => expense.id === id);
  }
}
