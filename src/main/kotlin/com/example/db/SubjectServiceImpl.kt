package com.example.db

import com.example.models.Subject
import com.example.models.Subjects
import com.example.plugins.dbQuery
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.update


private fun resultRowToSubject(row: ResultRow): Subject {
    return Subject(
        usn = row[Subjects.usn],
        sb1 = row[Subjects.sb1],
        sb2 = row[Subjects.sb2],
        sb3 = row[Subjects.sb3],
        sb4 = row[Subjects.sb4],
        sb5 = row[Subjects.sb5],
        sb6 = row[Subjects.sb6],
        sb7 = row[Subjects.sb7],
        sb8 = row[Subjects.sb8],
        sb9 = row[Subjects.sb9],
        sb10 = row[Subjects.sb10]
    )
}

class SubjectServiceImpl : SubjectService {
    override suspend fun getSubject(usn: String): Subject? = dbQuery {
        Subjects.selectAll().where { (Subjects.usn eq usn) }.map { resultRowToSubject(it) }.singleOrNull()
    }

    override suspend fun updateSubject(subject: Subject): Boolean = dbQuery {
        Subjects.update({ Subjects.usn eq subject.usn }) {
            it[sb1] = subject.sb1
            it[sb2] = subject.sb2
            it[sb3] = subject.sb3
            it[sb4] = subject.sb4
            it[sb5] = subject.sb5
            it[sb6] = subject.sb6
            it[sb7] = subject.sb7
            it[sb8] = subject.sb8
            it[sb9] = subject.sb9
            it[sb10] = subject.sb10
        } > 0
    }

    override suspend fun addSubject(subject: Subject): Subject? = dbQuery {
        val insertStmt = Subjects.insert {
            it[usn] = subject.usn
            it[sb1] = subject.sb1
            it[sb2] = subject.sb2
            it[sb3] = subject.sb3
            it[sb4] = subject.sb4
            it[sb5] = subject.sb5
            it[sb6] = subject.sb6
            it[sb7] = subject.sb7
            it[sb8] = subject.sb8
            it[sb9] = subject.sb9
            it[sb10] = subject.sb10
        }
        insertStmt.resultedValues?.singleOrNull()?.let { resultRowToSubject(it) }
    }

    override suspend fun addTest1Mark(subject: Subject): Subject? = dbQuery {
        val insertStmt = Subjects.insert {
            it[usn] = subject.usn
            it[sb1] = subject.sb1
            it[sb2] = subject.sb2
            it[sb3] = subject.sb3
            it[sb4] = subject.sb4
            it[sb5] = subject.sb5
            it[sb6] = subject.sb6
            it[sb7] = subject.sb7
            it[sb8] = subject.sb8
            it[sb9] = subject.sb9
            it[sb10] = subject.sb10
        }
        insertStmt.resultedValues?.singleOrNull()?.let { resultRowToSubject(it) }
    }

    override suspend fun addTest2Mark(subject: Subject): Subject? = dbQuery {
        val insertStmt = Subjects.insert {
            it[usn] = subject.usn
            it[sb1] = subject.sb1
            it[sb2] = subject.sb2
            it[sb3] = subject.sb3
            it[sb4] = subject.sb4
            it[sb5] = subject.sb5
            it[sb6] = subject.sb6
            it[sb7] = subject.sb7
            it[sb8] = subject.sb8
            it[sb9] = subject.sb9
            it[sb10] = subject.sb10
        }
        insertStmt.resultedValues?.singleOrNull()?.let { resultRowToSubject(it) }
    }

    override suspend fun addTest3Mark(subject: Subject): Subject? = dbQuery {
        val insertStmt = Subjects.insert {
            it[usn] = subject.usn
            it[sb1] = subject.sb1
            it[sb2] = subject.sb2
            it[sb3] = subject.sb3
            it[sb4] = subject.sb4
            it[sb5] = subject.sb5
            it[sb6] = subject.sb6
            it[sb7] = subject.sb7
            it[sb8] = subject.sb8
            it[sb9] = subject.sb9
            it[sb10] = subject.sb10
        }
        insertStmt.resultedValues?.singleOrNull()?.let { resultRowToSubject(it) }
    }

    override suspend fun getTest1Mark(usn: String): Subject? = dbQuery {
        Subjects.selectAll().where { (Subjects.usn eq usn) }.map { resultRowToSubject(it) }.singleOrNull()
    }

    override suspend fun getTest2Mark(usn: String): Subject? = dbQuery {
        Subjects.selectAll().where { (Subjects.usn eq usn) }.map { resultRowToSubject(it) }.singleOrNull()
    }


    override suspend fun getTest3Mark(usn: String): Subject? = dbQuery {
        Subjects.selectAll().where { (Subjects.usn eq usn) }.map { resultRowToSubject(it) }.singleOrNull()
    }


    override suspend fun updateTest1Mark(subject: Subject,sbNumber: String): Boolean = dbQuery {
        Subjects.update({ Subjects.usn eq subject.usn }) {
            when(sbNumber){
                "1"-> it[sb1] = subject.sb1
                "2" -> it[sb2] = subject.sb2
                "3" -> it[sb3] = subject.sb3
                "4" -> it[sb4] = subject.sb4
                "5" -> it[sb5] = subject.sb5
                "6" -> it[sb6] = subject.sb6
                "7" -> it[sb7] = subject.sb7
                "8" -> it[sb8] = subject.sb8
                "9" -> it[sb9] = subject.sb9
                "10" -> it[sb10] = subject.sb10
            }
        } > 0
    }

    override suspend fun updateTest2Mark(subject: Subject,sbNumber: String): Boolean = dbQuery {
        Subjects.update({ Subjects.usn eq subject.usn }) {
            when(sbNumber){
                "1"-> it[sb1] = subject.sb1
                "2" -> it[sb2] = subject.sb2
                "3" -> it[sb3] = subject.sb3
                "4" -> it[sb4] = subject.sb4
                "5" -> it[sb5] = subject.sb5
                "6" -> it[sb6] = subject.sb6
                "7" -> it[sb7] = subject.sb7
                "8" -> it[sb8] = subject.sb8
                "9" -> it[sb9] = subject.sb9
                "10" -> it[sb10] = subject.sb10
            }
        } > 0
    }

    override suspend fun updateTest3Mark(subject: Subject,sbNumber: String): Boolean = dbQuery {
        Subjects.update({ Subjects.usn eq subject.usn }) {
            when(sbNumber){
                "1"-> it[sb1] = subject.sb1
                "2" -> it[sb2] = subject.sb2
                "3" -> it[sb3] = subject.sb3
                "4" -> it[sb4] = subject.sb4
                "5" -> it[sb5] = subject.sb5
                "6" -> it[sb6] = subject.sb6
                "7" -> it[sb7] = subject.sb7
                "8" -> it[sb8] = subject.sb8
                "9" -> it[sb9] = subject.sb9
                "10" -> it[sb10] = subject.sb10
            }
        } > 0
    }

    override suspend fun addTotalClasses(subject: Subject): Subject? = dbQuery {
        val insertStmt = Subjects.insert {
            it[usn] = subject.usn
            it[sb1] = subject.sb1
            it[sb2] = subject.sb2
            it[sb3] = subject.sb3
            it[sb4] = subject.sb4
            it[sb5] = subject.sb5
            it[sb6] = subject.sb6
            it[sb7] = subject.sb7
            it[sb8] = subject.sb8
            it[sb9] = subject.sb9
            it[sb10] = subject.sb10
        }
        insertStmt.resultedValues?.singleOrNull()?.let { resultRowToSubject(it) }
    }

    override suspend fun addAttendedClasses(subject: Subject): Subject? = dbQuery {
        val insertStmt = Subjects.insert {
            it[usn] = subject.usn
            it[sb1] = subject.sb1
            it[sb2] = subject.sb2
            it[sb3] = subject.sb3
            it[sb4] = subject.sb4
            it[sb5] = subject.sb5
            it[sb6] = subject.sb6
            it[sb7] = subject.sb7
            it[sb8] = subject.sb8
            it[sb9] = subject.sb9
            it[sb10] = subject.sb10
        }
        insertStmt.resultedValues?.singleOrNull()?.let { resultRowToSubject(it) }
    }

    override suspend fun getTotalClasses(usn: String): Subject? = dbQuery {
        Subjects.selectAll().where { (Subjects.usn eq usn) }.map { resultRowToSubject(it) }.singleOrNull()
    }

    override suspend fun getAttendedClasses(usn: String): Subject? = dbQuery {
        Subjects.selectAll().where { (Subjects.usn eq usn) }.map { resultRowToSubject(it) }.singleOrNull()
    }


    override suspend fun updateAttendedClasses(subject: Subject,sbNumber: String): Boolean = dbQuery {
        Subjects.update({ Subjects.usn eq subject.usn }) {
            when(sbNumber){
                "1"-> it[sb1] = subject.sb1
                "2" -> it[sb2] = subject.sb2
                "3" -> it[sb3] = subject.sb3
                "4" -> it[sb4] = subject.sb4
                "5" -> it[sb5] = subject.sb5
                "6" -> it[sb6] = subject.sb6
                "7" -> it[sb7] = subject.sb7
                "8" -> it[sb8] = subject.sb8
                "9" -> it[sb9] = subject.sb9
                "10" -> it[sb10] = subject.sb10
            }
        } > 0
    }

    override suspend fun updateTotalClasses(subject: Subject,sbNumber:String): Boolean = dbQuery {
        Subjects.update({ Subjects.usn eq subject.usn }) {
            when(sbNumber){
                "1"-> it[sb1] = subject.sb1
                "2" -> it[sb2] = subject.sb2
                "3" -> it[sb3] = subject.sb3
                "4" -> it[sb4] = subject.sb4
                "5" -> it[sb5] = subject.sb5
                "6" -> it[sb6] = subject.sb6
                "7" -> it[sb7] = subject.sb7
                "8" -> it[sb8] = subject.sb8
                "9" -> it[sb9] = subject.sb9
                "10" -> it[sb10] = subject.sb10
            }
        } > 0
    }
}