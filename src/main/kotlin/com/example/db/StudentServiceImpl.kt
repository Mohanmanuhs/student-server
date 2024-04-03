package com.example.db

import com.example.models.Student
import com.example.models.Students
import com.example.plugins.dbQuery
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.selectAll


private fun resultRowToStudent(row: ResultRow):Student{
    return Student(
        usn = row[Students.usn],
        name = row[Students.name],
        sem = row[Students.sem]
    )
}
class StudentServiceImpl:StudentService {
    override suspend fun addStudent(student: Student): Student?= dbQuery {
        val insertStmt=Students.insert {
            it[name]=student.name
            it[usn]=student.usn
            it[sem]=student.sem
        }
        insertStmt.resultedValues?.singleOrNull()?.let { resultRowToStudent(it) }
    }

    override suspend fun getStudent(usn: String): Student?= dbQuery{
        Students.selectAll().where { (Students.usn eq usn) }.map { resultRowToStudent(it) }.singleOrNull()
    }

}