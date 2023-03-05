package com.example.postgres.adapters.out.repository

import com.example.postgres.adapters.out.repository.entity.ProposalInfomationEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ProposalInformationJpaRepository : CrudRepository<ProposalInfomationEntity, String> {
    fun findByProposta(propostal: String): Optional<ProposalInfomationEntity>


}