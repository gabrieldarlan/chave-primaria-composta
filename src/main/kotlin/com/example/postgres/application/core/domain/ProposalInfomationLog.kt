package com.example.postgres.application.core.domain

import java.time.LocalDateTime

data class ProposalInfomationLog(
        var id: Int? = null,
        val proposta: String,
        val dataUltimaAtualizacao: LocalDateTime,
        val codProduto: Int,
        val codCanal: Int,
        val codPdv: Int
)
