import { Component, OnInit } from '@angular/core';
import { ServiceBudgetService } from 'src/app/service/service-budget.service';
import { BudgetExpense } from 'src/app/shared/types';

@Component({
  selector: 'app-expenses-list',
  templateUrl: './expenses-list.component.html',
  styleUrls: ['./expenses-list.component.css']
})
export class ExpensesListComponent implements OnInit {
  expensesService: ServiceBudgetService;
  expenseList: BudgetExpense[] = [];

  constructor(service: ServiceBudgetService) {
    this.expensesService = service
  }

  ngOnInit(): void {
    this.expenseList = this.expensesService.getExpenses()
  }

}
