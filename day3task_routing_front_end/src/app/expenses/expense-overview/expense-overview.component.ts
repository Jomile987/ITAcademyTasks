import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { BudgetExpense } from 'src/app/shared/types';

@Component({
  selector: 'app-expense-overview',
  templateUrl: './expense-overview.component.html',
  styleUrls: ['./expense-overview.component.css']
})
export class ExpenseOverviewComponent implements OnInit {
  @Input() expenseInfo?: BudgetExpense;
  @Output() onClick: EventEmitter<any> = new EventEmitter();

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  openDetails() {
    this.router.navigate(["/expenses", this.expenseInfo?.id])
  }

}
