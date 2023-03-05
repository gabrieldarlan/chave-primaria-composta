package com.example.postgres.adapters.out.repository.impl

import com.example.postgres.adapters.out.repository.ProposalInformationLogJpaRepository
import com.example.postgres.adapters.out.repository.entity.ProposalInformationLogEntity
import com.example.postgres.adapters.out.repository.entity.mapper.ProposalInformationLogEntityRepositoryMapper
import com.example.postgres.application.core.domain.ProposalInfomationLog
import com.example.postgres.application.ports.out.ProposalInformationLogRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProposalInformationLogRepositoryImpl(
    private val proposalInformationLogJpaRepository: ProposalInformationLogJpaRepository
) : ProposalInformationLogRepository {
    override fun save(proposalLogInformation: ProposalInfomationLog): Optional<ProposalInfomationLog> {
        return proposalInformationLogJpaRepository.save<ProposalInformationLogEntity?>(
            ProposalInformationLogEntityRepositoryMapper.toEntity(
                proposalLogInformation
            )
        ).let { Optional.of(ProposalInformationLogEntityRepositoryMapper.toModel(it)) }


    }
}