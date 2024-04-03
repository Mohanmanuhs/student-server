package com.example.models

import kotlinx.serialization.Serializable
import org.jetbrains.exposed.sql.Table

@Serializable
data class Subject(
    val usn: String,
    val sb1: String,
    val sb2: String,
    val sb3: String,
    val sb4: String,
    val sb5: String,
    val sb6: String,
    val sb7: String,
    val sb8: String,
    val sb9: String,
    val sb10: String
)

object Subjects : Table() {
    val usn = varchar("usn", 100)
    val sb1 = varchar("sb1",10)
    val sb2 = varchar("sb2",10)
    val sb3 = varchar("sb3",10)
    val sb4 = varchar("sb4",10)
    val sb5 = varchar("sb5",10)
    val sb6 = varchar("sb6",10)
    val sb7 = varchar("sb7",10)
    val sb8 = varchar("sb8",10)
    val sb9 = varchar("sb9",10)
    val sb10 = varchar("sb10",10)

    override val primaryKey: PrimaryKey
        get() = PrimaryKey(usn)
}