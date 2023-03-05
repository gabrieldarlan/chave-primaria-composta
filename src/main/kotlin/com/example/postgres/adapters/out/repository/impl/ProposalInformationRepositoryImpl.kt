package com.example.postgres.adapters.out.repository.impl

import com.example.postgres.adapters.out.repository.ProposalInformationJpaRepository
import com.example.postgres.adapters.out.repository.entity.mapper.ProposalInformationEntityRepositoryMapper
import com.example.postgres.application.core.domain.ProposalInformation
import com.example.postgres.application.ports.out.ProposalInformationRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProposalInformationRepositoryImpl(
    private val proposalInformationJpaRepository: ProposalInformationJpaRepository
) : ProposalInformationRepository {
    override fun save(proposalInformation: ProposalInformation): Optional<ProposalInformation> {
        return proposalInformationJpaRepository
            .save(
                ProposalInformationEntityRepositoryMapper
                    .toEntity(proposalInformation)
            ).let {
                Optional.of(ProposalInformationEntityRepositoryMapper.toModel(it))
            }
    }


    override fun findByProposta(propostal: String): Optional<ProposalInformation> {
        return proposalInformationJpaRepository.findByPropostaIfExists(propostal).map {
            ProposalInformationEntityRepositoryMapper.toModel(it)
        }
    }
}