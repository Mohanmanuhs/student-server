package com.example.db

import com.example.models.Expense
import com.example.models.Expenses
import com.example.plugins.dbQuery
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.update


class ExpenseServiceImpl:ExpenseService{
    override suspend fun addExpense(expense: Expense): Expense? =  dbQuery {
        val insertStmt = Expenses.insert {
            it[tuition] = expense.tuition
            it[usn] = expense.usn
            it[other] = expense.other
            it[stationery] = expense.stationery
            it[txtBook] = expense.txtBook
        }
        insertStmt.resultedValues?.singleOrNull()?.let {
            resultRowToExpense(it)
        }
    }
    override suspend fun updateExpense(expense: Expense): Boolean = dbQuery{
        Expenses.update({Expenses.usn eq expense.usn}){
            it[tuition] = expense.tuition
            it[other] = expense.other
            it[stationery] = expense.stationery
            it[txtBook] = expense.txtBook
        }>0
    }

    override suspend fun getExpense(usn: String): Expense?= dbQuery{
        Expenses.selectAll().where { (Expenses.usn eq usn) }.map { resultRowToExpense(it) }.singleOrNull()
    }

}

private fun resultRowToExpense(row: ResultRow): Expense {
    return Expense(
        tuition = row[Expenses.tuition],
        usn = row[Expenses.usn],
        other = row[Expenses.other],
        stationery = row[Expenses.stationery],
        txtBook = row[Expenses.txtBook]
    )
}