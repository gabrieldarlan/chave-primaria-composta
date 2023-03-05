package com.example.postgres.adapters.out.repository

import com.example.postgres.adapters.out.repository.entity.ProposalInformationLogEntity
import com.example.postgres.adapters.out.repository.entity.ProposalInfomationLogId
import org.springframework.data.repository.CrudRepository

interface ProposalInformationLogJpaRepository : CrudRepository<ProposalInformationLogEntity, ProposalInfomationLogId> {
}