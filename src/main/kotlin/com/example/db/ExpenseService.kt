package com.example.db

import com.example.models.Expense

interface ExpenseService {
    suspend fun addExpense(expense:Expense):Expense?
    suspend fun updateExpense(expense:Expense):Boolean
    suspend fun getExpense(usn:String):Expense?

}