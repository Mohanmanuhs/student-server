package com.example.routes

import com.example.db.StudentService
import com.example.models.Student
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.jetbrains.exposed.exceptions.ExposedSQLException

fun Routing.studentRoute(studentService: StudentService){
    route("/student"){
        post {
            val student=call.receive<Student>()
            try {
                val result=studentService.addStudent(student)
                result?.let {
                    call.respond(HttpStatusCode.Created,it)
                } ?: call.respond(HttpStatusCode.NotImplemented,"Error adding student")
            }catch (e: ExposedSQLException){
                call.respond(HttpStatusCode.BadRequest,e.message ?: "SQL Exception!!")
            }
        }

        get("/{usn}") {
            val usn=call.parameters["usn"]
            usn?.let {
                studentService.getStudent(it)?.let {student->
                    call.respond(HttpStatusCode.OK,student)
                } ?: call.respond(HttpStatusCode.NotFound,"student not found")
            } ?: call.respond(HttpStatusCode.BadGateway,"Provide Input!!")
        }
    }
}