package com.example.models

import kotlinx.serialization.Serializable
import org.jetbrains.exposed.sql.Table

@Serializable
data class Expense(
    val usn: String,
    val tuition: String,
    val txtBook: String,
    val stationery:String,
    val other:String
)

object Expenses : Table() {
    val usn = varchar("usn", 100)
    val tuition = varchar("tuition",20)
    val txtBook = varchar("txtBook",20)
    val stationery = varchar("stationery",20)
    val other = varchar("other",20)

    override val primaryKey: PrimaryKey
        get() = PrimaryKey(usn)
}