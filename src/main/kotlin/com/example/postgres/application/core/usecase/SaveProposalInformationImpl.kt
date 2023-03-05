package com.example.postgres.application.core.usecase

import com.example.postgres.application.core.domain.ProposalInformation
import com.example.postgres.application.core.domain.mapper.ProposalInfomationLogMapper
import com.example.postgres.application.ports.`in`.SaveProposalInformationInputPort
import com.example.postgres.application.ports.out.ProposalInformationLogRepository
import com.example.postgres.application.ports.out.ProposalInformationRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime
import java.util.*

@Service
class SaveProposalInformationImpl(
    private val proposalInformationRepository: ProposalInformationRepository,
    private val proposalInformationLogRepository: ProposalInformationLogRepository,
) : SaveProposalInformationInputPort {
    //inclusao do transaction para fazer rollback em caso de erro
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    override fun save(proposalInformation: ProposalInformation): Optional<ProposalInformation> {

        val optional = proposalInformationRepository.findByProposta(proposalInformation.proposta)

        return if (optional.isEmpty) {
            insertProposal(proposalInformation)
        } else if (!isLastUpdateDateEqual(
                optional.get().dataUltimaAtualizacao,
                proposalInformation.dataUltimaAtualizacao
            )
        ) {
            updateProposal(proposalInformation, optional)
        } else {
            Optional.empty()
        }


    }

    private fun updateProposal(
        proposalInformation: ProposalInformation,
        optional: Optional<ProposalInformation>
    ): Optional<ProposalInformation> {
        val updateProposal =
            ProposalInfomationLogMapper.toUpdate(optional.get().dataPrimeiraAtualizacao, proposalInformation)

        proposalInformationLogRepository.save(ProposalInfomationLogMapper.toLog(proposalInformation))
        return proposalInformationRepository.save(updateProposal)
    }

    //    @Transactional(rollbackFor = [Exception::class])
    private fun insertProposal(proposalInformation: ProposalInformation): Optional<ProposalInformation> {
        proposalInformationLogRepository.save(ProposalInfomationLogMapper.toLog(proposalInformation))
        return proposalInformationRepository.save(proposalInformation)

    }

    private fun isLastUpdateDateEqual(
        dataUltimaAtualizacaoBase: LocalDateTime,
        dataUltimaAtualizacao: LocalDateTime
    ): Boolean {
        return dataUltimaAtualizacaoBase == dataUltimaAtualizacao
    }


}