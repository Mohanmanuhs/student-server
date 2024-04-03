package com.example.plugins

import com.example.db.ExpenseService
import com.example.db.StudentService
import com.example.db.SubjectService
import com.example.routes.expenseRoute
import com.example.routes.studentRoute
import com.example.routes.subjectRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.get


fun Application.configureRouting(subjectService: SubjectService=get(),expenseService: ExpenseService=get(),studentService: StudentService=get()) {
    routing {
        studentRoute(studentService)
        expenseRoute(expenseService)
        subjectRoute(subjectService)
    }
}
