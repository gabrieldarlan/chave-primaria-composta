package com.example.postgres.application.core.domain

data class Employee(
        var employeeId: Int,
        var deptId: Int,
        var name: String,
        var email: String,
        var phone: String
)
