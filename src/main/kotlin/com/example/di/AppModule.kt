package com.example.di

import com.example.db.*
import org.koin.dsl.module

val appModule = module {
    single<StudentService> {
        StudentServiceImpl()
    }
    single<ExpenseService> {
        ExpenseServiceImpl()
    }
    single<SubjectService> {
        SubjectServiceImpl()
    }

}