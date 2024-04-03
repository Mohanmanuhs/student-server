package com.example.routes

import com.example.db.ExpenseService
import com.example.models.Expense
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.jetbrains.exposed.exceptions.ExposedSQLException

fun Routing.expenseRoute(expenseService: ExpenseService){
    route("/expense"){
        post {
            val expense=call.receive<Expense>()
            try {
                val result=expenseService.addExpense(expense)
                result?.let {
                    call.respond(HttpStatusCode.Created,it)
                } ?: call.respond(HttpStatusCode.NotImplemented,"Error adding user")
            }catch (e: ExposedSQLException){
                call.respond(HttpStatusCode.BadRequest,e.message ?: "SQL Exception!!")
            }
        }
        put{
            try {
                val expense=call.receive<Expense>()
                val result=expenseService.updateExpense(expense)
                if (result){
                    call.respond(HttpStatusCode.OK,"Update successful")
                }else{
                    call.respond(HttpStatusCode.NotImplemented,"Update not done")
                }
            }catch (e: ExposedSQLException){
                call.respond(HttpStatusCode.BadRequest,e.message ?: "SQL Exception!!")
            }
        }

        get("/{usn}") {
            val usn=call.parameters["usn"]
            usn?.let {
                expenseService.getExpense(it)?.let {expense->
                    call.respond(HttpStatusCode.OK,expense)
                } ?: call.respond(HttpStatusCode.NotFound,"expense not found")
            } ?: call.respond(HttpStatusCode.BadGateway,"Provide Input!!")
        }
    }
}