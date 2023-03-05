package com.example.postgres.adapters.out.repository.entity

import javax.persistence.*

@Entity
@Table(name = "employee_tbl")
@IdClass(EmployeePKId::class)
data class EmployeeEntity(

        @Id
        var employeeId: Int,
        @Id
        var deptId: Int,

//        @EmbeddedId
//        var employeePKId: EmployeePKId,
        var name: String,
        var email: String,
        var phone: String
)