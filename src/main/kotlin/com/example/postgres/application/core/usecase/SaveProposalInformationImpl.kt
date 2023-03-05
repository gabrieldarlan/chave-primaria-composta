package com.example.postgres.application.core.usecase

import com.example.postgres.application.core.domain.ProposalInformation
import com.example.postgres.application.core.domain.mapper.ProposalInfomationLogMapper
import com.example.postgres.application.ports.`in`.SaveProposalInformationInputPort
import com.example.postgres.application.ports.out.ProposalInformationLogRepository
import com.example.postgres.application.ports.out.ProposalInformationRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Service
class SaveProposalInformationImpl(
        private val proposalInformationRepository: ProposalInformationRepository,
        private val proposalInformationLogRepository: ProposalInformationLogRepository,
) : SaveProposalInformationInputPort {
    override fun save(proposalInformation: ProposalInformation): Optional<ProposalInformation> {

        val optional = proposalInformationRepository.findByProposta(proposalInformation.proposta)

        return if (optional.isEmpty) {
            val proposalInformationOptional = proposalInformationRepository.save(proposalInformation)
            proposalInformationLogRepository.save(ProposalInfomationLogMapper.toLog(proposalInformationOptional.get()))
            proposalInformationOptional
        } else if (!isLastUpdateDateEqual(optional.get().dataUltimaAtualizacao, proposalInformation.dataUltimaAtualizacao)) {

            val updateProposal = ProposalInformation(
                    proposta = proposalInformation.proposta,
                    dataPrimeiraAtualizacao = optional.get().dataPrimeiraAtualizacao,
                    codProduto = proposalInformation.codProduto,
                    codCanal = proposalInformation.codCanal,
                    codPdv = proposalInformation.codPdv,
                    dataUltimaAtualizacao = proposalInformation.dataUltimaAtualizacao)

            proposalInformationLogRepository.save(ProposalInfomationLogMapper.toLog(proposalInformation))
            return proposalInformationRepository.save(updateProposal)

        } else {
            Optional.empty()
        }


    }

    private fun isLastUpdateDateEqual(dataUltimaAtualizacaoBase: LocalDateTime, dataUltimaAtualizacao: LocalDateTime): Boolean {
        return dataUltimaAtualizacaoBase == dataUltimaAtualizacao
    }


}