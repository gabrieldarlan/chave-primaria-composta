package com.example.postgres.adapters.out.repository

import com.example.postgres.adapters.out.repository.entity.ProposalInfomationLogEntity
import com.example.postgres.adapters.out.repository.entity.ProposalInfomationLogId
import org.springframework.data.repository.CrudRepository

interface ProposalInformationLogJpaRepository : CrudRepository<ProposalInfomationLogEntity, ProposalInfomationLogId> {
}