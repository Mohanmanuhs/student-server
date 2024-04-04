package com.example.db

import com.example.models.Student


interface StudentService {
    suspend fun addStudent(student: Student): Student?

    suspend fun getStudent(usn:String):Student?
    suspend fun updateStudent(student:Student):Boolean
}