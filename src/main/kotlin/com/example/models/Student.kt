package com.example.models

import kotlinx.serialization.Serializable
import org.jetbrains.exposed.sql.Table

@Serializable
data class Student(
    val usn: String,
    val name: String,
    val sem: Int
)

object Students : Table() {
    val usn = varchar("usn",100)
    val name = varchar("name", 40)
    val sem = integer("sem")

    override val primaryKey: PrimaryKey
        get() = PrimaryKey(usn)
}