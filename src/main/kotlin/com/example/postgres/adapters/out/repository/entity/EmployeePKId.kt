package com.example.postgres.adapters.out.repository.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class EmployeePKId(
        @Column(name = "employeed_id")
        var employeeId: Int,
        @Column(name = "dept_id")
        var deptId: Int,
) : Serializable