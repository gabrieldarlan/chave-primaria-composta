package com.example.postgres.adapters.`in`.controller.request.mapper

import com.example.postgres.adapters.`in`.controller.request.ProposalnformationRequest
import com.example.postgres.application.core.domain.ProposalInformation
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object ProposalInformationRequestMapper {

    fun toDomain(request: ProposalnformationRequest) = ProposalInformation(
            proposta = request.proposta,
            dataPrimeiraAtualizacao = toLocalDate(request.dataUltimaAtualizacao),
            codProduto = request.codProduto,
            codCanal = request.codCanal,
            codPdv = request.codPdv,
            dataUltimaAtualizacao = toLocalDate(request.dataUltimaAtualizacao)

    )

    private fun toLocalDate(data: String): LocalDateTime {
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        return LocalDateTime.parse(data, formatter)

    }
}