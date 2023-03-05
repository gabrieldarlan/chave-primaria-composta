package com.example.postgres.application.ports.out

import com.example.postgres.application.core.domain.ProposalInformation
import java.util.*

interface ProposalInformationRepository {
    fun save(proposalInformation: ProposalInformation): Optional<ProposalInformation>
    fun findByProposta(propostal: String): Optional<ProposalInformation>
}