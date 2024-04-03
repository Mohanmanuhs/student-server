package com.example.routes

import com.example.db.SubjectService
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.jetbrains.exposed.exceptions.ExposedSQLException
import com.example.models.Subject

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
        get("/{1usn}") {
            val usn=call.parameters["1usn"]
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
    route("/subject/2"){
        get("/{1usn}") {
            val usn=call.parameters["1usn"]
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
    route("/subject/3"){
        get("/{1usn}") {
            val usn=call.parameters["1usn"]
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
    route("/subject/4"){
        get("/{1usn}") {
            val usn=call.parameters["1usn"]
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
    route("/subject/5"){
        get("/{1usn}") {
            val usn=call.parameters["1usn"]
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
}