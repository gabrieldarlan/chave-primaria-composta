package com.example.postgres.application.ports.out

import com.example.postgres.application.core.domain.ProposalInfomationLog
import java.util.*

interface ProposalInformationLogRepository {
    fun save(proposalLogInformation: ProposalInfomationLog): Optional<ProposalInfomationLog>


}