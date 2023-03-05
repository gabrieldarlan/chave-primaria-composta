package com.example.postgres.application.core.domain

import java.time.LocalDateTime

data class ProposalInformation(

        val proposta: String,
        val dataPrimeiraAtualizacao: LocalDateTime,
        val codProduto: Int,
        val codCanal: Int,
        val codPdv: Int,
        val dataUltimaAtualizacao: LocalDateTime,
)