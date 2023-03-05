package com.example.postgres.adapters.`in`.controller.response.mapper

import com.example.postgres.adapters.`in`.controller.response.ProposalInformationResponse
import com.example.postgres.application.core.domain.ProposalInformation

object ProposalInformationResponseMapper {
    fun toResponse(model: ProposalInformation) = ProposalInformationResponse(
            proposta = model.proposta,
            dataPrimeiraAtualizacao = model.dataPrimeiraAtualizacao,
            codProduto = model.codProduto,
            codCanal = model.codCanal,
            codPdv = model.codPdv,
            dataUltimaAtualizacao = model.dataUltimaAtualizacao
    )
}