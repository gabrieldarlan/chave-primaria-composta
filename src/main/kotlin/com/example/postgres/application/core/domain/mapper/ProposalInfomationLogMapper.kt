package com.example.postgres.application.core.domain.mapper

import com.example.postgres.application.core.domain.ProposalInfomationLog
import com.example.postgres.application.core.domain.ProposalInformation
import java.time.LocalDateTime

object ProposalInfomationLogMapper {

    fun toLog(proposalInformation: ProposalInformation) = ProposalInfomationLog(
            proposta = proposalInformation.proposta,
            dataUltimaAtualizacao = proposalInformation.dataUltimaAtualizacao,
            codProduto = proposalInformation.codProduto,
            codCanal = proposalInformation.codCanal,
            codPdv = proposalInformation.codPdv)

    fun toUpdate(primeiraDataAtualizacao: LocalDateTime, proposalInformation: ProposalInformation) = ProposalInformation(
            proposta = proposalInformation.proposta,
            dataPrimeiraAtualizacao = primeiraDataAtualizacao,
            codProduto = proposalInformation.codProduto,
            codCanal = proposalInformation.codCanal,
            codPdv = proposalInformation.codPdv,
            dataUltimaAtualizacao = proposalInformation.dataUltimaAtualizacao

    )

}

