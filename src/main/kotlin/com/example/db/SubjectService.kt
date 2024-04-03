package com.example.db

import com.example.models.Subject



interface SubjectService {
    suspend fun getSubject(usn:String): Subject?
    suspend fun updateSubject(subject: Subject):Boolean
    suspend fun addSubject(subject: Subject):Subject?
    suspend fun addTest1Mark(subject: Subject):Subject?
    suspend fun addTest2Mark(subject: Subject):Subject?
    suspend fun addTest3Mark(subject: Subject):Subject?
    suspend fun getTest1Mark(usn:String):Subject?
    suspend fun getTest2Mark(usn:String):Subject?
    suspend fun getTest3Mark(usn:String):Subject?
    suspend fun updateTest1Mark(subject: Subject):Boolean
    suspend fun updateTest2Mark(subject: Subject):Boolean
    suspend fun updateTest3Mark(subject: Subject):Boolean
    suspend fun addTotalClasses(subject: Subject):Subject?
    suspend fun addAttendedClasses(subject: Subject):Subject?
    suspend fun getTotalClasses(usn:String):Subject?
    suspend fun getAttendedClasses(usn:String):Subject?
    suspend fun updateAttendedClasses(subject: Subject):Boolean
    suspend fun updateTotalClasses(subject: Subject):Boolean

}
