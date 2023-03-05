package com.example.postgres.adapters.out.repository

import com.example.postgres.adapters.out.repository.entity.ProposalInfomationEntity
import com.example.postgres.adapters.out.repository.entity.ProposalInfomationEntityId
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ProposalInformationJpaRepository : CrudRepository<ProposalInfomationEntity, ProposalInfomationEntityId> {

    @Query(value = """
        select p 
        from ProposalInfomationEntity p
        where p.proposalInfomationEntityId.proposta = :proposta
    """)
    fun findByPropostaIfExists(proposta: String): Optional<ProposalInfomationEntity>


}