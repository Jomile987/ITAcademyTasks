import { BudgetExpense } from './../../shared/types';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ServiceBudgetService } from 'src/app/service/service-budget.service';

@Component({
  selector: 'app-expenses-details',
  templateUrl: './expenses-details.component.html',
  styleUrls: ['./expenses-details.component.css']
})
export class ExpensesDetailsComponent implements OnInit {
  id: string = '';
  expense?: BudgetExpense;
  expensesService: ServiceBudgetService;

  constructor(private route: ActivatedRoute, service: ServiceBudgetService) {
    this.expensesService = service
  }

  ngOnInit(): void {
    this.id = this.route.snapshot.paramMap.get("id") ?? '';
    this.expense = this.expensesService.getExpense(this.id);
  }

}
