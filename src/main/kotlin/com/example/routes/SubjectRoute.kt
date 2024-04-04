package com.example.routes

import com.example.db.SubjectService
import com.example.models.Subject
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.jetbrains.exposed.exceptions.ExposedSQLException

fun Routing.subjectRoute(subjectService: SubjectService){
    route("/subject"){
        get("/{usn}") {
            val usn=call.parameters["usn"]
            usn?.let {
                subjectService.getSubject(it)?.let {subject->
                    call.respond(HttpStatusCode.OK,subject)
                } ?: call.respond(HttpStatusCode.NotFound,"Subject not found")
            } ?: call.respond(HttpStatusCode.BadGateway,"Provide Input!!")
        }
        post {
            val subject=call.receive<Subject>()
            try {
                val result=subjectService.addSubject(subject)
                result?.let {
                    call.respond(HttpStatusCode.Created,it)
                } ?: call.respond(HttpStatusCode.NotImplemented,"Error adding user")
            }catch (e: ExposedSQLException){
                call.respond(HttpStatusCode.BadRequest,e.message ?: "SQL Exception!!")
            }
        }
        put{
            try {
                val subject=call.receive<Subject>()
                val result=subjectService.updateSubject(subject)
                if (result){
                    call.respond(HttpStatusCode.OK,"Update successful")
                }else{
                    call.respond(HttpStatusCode.NotImplemented,"Update not done")
                }
            }catch (e: ExposedSQLException){
                call.respond(HttpStatusCode.BadRequest,e.message ?: "SQL Exception!!")
            }
        }


    }
    route("/subject/1"){
        get("/{usn}") {
            val usn=call.parameters["usn"]
            usn?.let {
                subjectService.getTest1Mark("1$it")?.let { subject->
                    call.respond(HttpStatusCode.OK,subject)
                } ?: call.respond(HttpStatusCode.NotFound,"Subject not found")
            } ?: call.respond(HttpStatusCode.BadGateway,"Provide Input!!")
        }
        post {
            val subject=call.receive<Subject>()
            try {
                val result=subjectService.addTest1Mark(subject)
                result?.let {
                    call.respond(HttpStatusCode.Created,it)
                } ?: call.respond(HttpStatusCode.NotImplemented,"Error adding user")
            }catch (e: ExposedSQLException){
                call.respond(HttpStatusCode.BadRequest,e.message ?: "SQL Exception!!")
            }
        }
        put("/{sbNumber}"){
            val sbNumber=call.parameters["sbNumber"]
            sbNumber?.let {
                try {
                    val subject = call.receive<Subject>()
                    val result = subjectService.updateTest1Mark(subject,sbNumber)
                    if (result) {
                        call.respond(HttpStatusCode.OK, "Update successful")
                    } else {
                        call.respond(HttpStatusCode.NotImplemented, "Update not done")
                    }
                } catch (e: ExposedSQLException) {
                    call.respond(HttpStatusCode.BadRequest, e.message ?: "SQL Exception!!")
                }
            }
        }


    }
    route("/subject/2"){
        get("/{usn}") {
            val usn=call.parameters["usn"]
            usn?.let {
                subjectService.getTest2Mark("2$it")?.let {subject->
                    call.respond(HttpStatusCode.OK,subject)
                } ?: call.respond(HttpStatusCode.NotFound,"Subject not found")
            } ?: call.respond(HttpStatusCode.BadGateway,"Provide Input!!")
        }
        post {
            val subject=call.receive<Subject>()
            try {
                val result=subjectService.addTest2Mark(subject)
                result?.let {
                    call.respond(HttpStatusCode.Created,it)
                } ?: call.respond(HttpStatusCode.NotImplemented,"Error adding user")
            }catch (e: ExposedSQLException){
                call.respond(HttpStatusCode.BadRequest,e.message ?: "SQL Exception!!")
            }
        }
        put("/{sbNumber}"){
            val sbNumber=call.parameters["sbNumber"]
            sbNumber?.let {
                try {
                    val subject = call.receive<Subject>()
                    val result = subjectService.updateTest2Mark(subject,sbNumber)
                    if (result) {
                        call.respond(HttpStatusCode.OK, "Update successful")
                    } else {
                        call.respond(HttpStatusCode.NotImplemented, "Update not done")
                    }
                } catch (e: ExposedSQLException) {
                    call.respond(HttpStatusCode.BadRequest, e.message ?: "SQL Exception!!")
                }
            }
        }


    }
    route("/subject/3"){
        get("/{usn}") {
            val usn=call.parameters["usn"]
            usn?.let {
                subjectService.getTest3Mark("2$it")?.let {subject->
                    call.respond(HttpStatusCode.OK,subject)
                } ?: call.respond(HttpStatusCode.NotFound,"Subject not found")
            } ?: call.respond(HttpStatusCode.BadGateway,"Provide Input!!")
        }
        post {
            val subject=call.receive<Subject>()
            try {
                val result=subjectService.addTest3Mark(subject)
                result?.let {
                    call.respond(HttpStatusCode.Created,it)
                } ?: call.respond(HttpStatusCode.NotImplemented,"Error adding user")
            }catch (e: ExposedSQLException){
                call.respond(HttpStatusCode.BadRequest,e.message ?: "SQL Exception!!")
            }
        }
        put("/{sbNumber}"){
            val sbNumber=call.parameters["sbNumber"]
            sbNumber?.let {
                try {
                    val subject = call.receive<Subject>()
                    val result = subjectService.updateTest3Mark(subject,sbNumber)
                    if (result) {
                        call.respond(HttpStatusCode.OK, "Update successful")
                    } else {
                        call.respond(HttpStatusCode.NotImplemented, "Update not done")
                    }
                } catch (e: ExposedSQLException) {
                    call.respond(HttpStatusCode.BadRequest, e.message ?: "SQL Exception!!")
                }
            }
        }


    }
    route("/subject/4"){
        get("/{usn}") {
            val usn=call.parameters["usn"]
            usn?.let {
                subjectService.getTotalClasses("4$it")?.let {subject->
                    call.respond(HttpStatusCode.OK,subject)
                } ?: call.respond(HttpStatusCode.NotFound,"Subject not found")
            } ?: call.respond(HttpStatusCode.BadGateway,"Provide Input!!")
        }
        post {
            val subject=call.receive<Subject>()
            try {
                val result=subjectService.addTotalClasses(subject)
                result?.let {
                    call.respond(HttpStatusCode.Created,it)
                } ?: call.respond(HttpStatusCode.NotImplemented,"Error adding user")
            }catch (e: ExposedSQLException){
                call.respond(HttpStatusCode.BadRequest,e.message ?: "SQL Exception!!")
            }
        }
        put("/{sbNumber}"){
            val sbNumber=call.parameters["sbNumber"]
            sbNumber?.let {
                try {
                    val subject = call.receive<Subject>()
                    val result = subjectService.updateTotalClasses(subject,sbNumber)
                    if (result) {
                        call.respond(HttpStatusCode.OK, "Update successful")
                    } else {
                        call.respond(HttpStatusCode.NotImplemented, "Update not done")
                    }
                } catch (e: ExposedSQLException) {
                    call.respond(HttpStatusCode.BadRequest, e.message ?: "SQL Exception!!")
                }
            }
        }


    }
    route("/subject/5"){
        get("/{usn}") {
            val usn=call.parameters["usn"]
            usn?.let {
                subjectService.getAttendedClasses("5$it")?.let {subject->
                    call.respond(HttpStatusCode.OK,subject)
                } ?: call.respond(HttpStatusCode.NotFound,"Subject not found")
            } ?: call.respond(HttpStatusCode.BadGateway,"Provide Input!!")
        }
        post {
            val subject=call.receive<Subject>()
            try {
                val result=subjectService.addAttendedClasses(subject)
                result?.let {
                    call.respond(HttpStatusCode.Created,it)
                } ?: call.respond(HttpStatusCode.NotImplemented,"Error adding user")
            }catch (e: ExposedSQLException){
                call.respond(HttpStatusCode.BadRequest,e.message ?: "SQL Exception!!")
            }
        }
        put("/{sbNumber}"){
            val sbNumber=call.parameters["sbNumber"]
            sbNumber?.let {
                try {
                    val subject = call.receive<Subject>()
                    val result = subjectService.updateAttendedClasses(subject,sbNumber)
                    if (result) {
                        call.respond(HttpStatusCode.OK, "Update successful")
                    } else {
                        call.respond(HttpStatusCode.NotImplemented, "Update not done")
                    }
                } catch (e: ExposedSQLException) {
                    call.respond(HttpStatusCode.BadRequest, e.message ?: "SQL Exception!!")
                }
            }
        }

    }
}