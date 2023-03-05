package com.example.postgres.adapters.`in`.controller.response

import java.time.LocalDateTime

data class ProposalInformationResponse(
        val proposta: String,
        val dataPrimeiraAtualizacao: LocalDateTime,
        val codProduto: Int,
        val codCanal: Int,
        val codPdv: Int,
        val dataUltimaAtualizacao: LocalDateTime,
)
