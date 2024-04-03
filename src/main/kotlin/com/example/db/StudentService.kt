package com.example.db

import com.example.models.Student
import com.example.models.Subject

interface StudentService {
    suspend fun addStudent(student: Student): Student?

    suspend fun getStudent(usn:String):Student?

}