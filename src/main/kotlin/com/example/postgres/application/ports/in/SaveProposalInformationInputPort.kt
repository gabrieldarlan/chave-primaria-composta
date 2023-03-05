package com.example.postgres.application.ports.`in`

import com.example.postgres.application.core.domain.ProposalInformation
import java.util.*

interface SaveProposalInformationInputPort {

    fun save(proposalInformation: ProposalInformation): Optional<ProposalInformation>
}