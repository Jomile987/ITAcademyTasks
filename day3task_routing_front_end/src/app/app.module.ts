import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ExpensesListComponent } from './expenses/expenses-list/expenses-list.component';
import { ExpenseOverviewComponent } from './expenses/expense-overview/expense-overview.component';
import { ExpensesDetailsComponent } from './expenses/expenses-details/expenses-details.component';
import { HeaderComponent } from './header/header.component';
import { ContainerComponent } from './container/container.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ExpensesListComponent,
    ExpenseOverviewComponent,
    ExpensesDetailsComponent,
    HeaderComponent,
    ContainerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
