package com.example.postgres.adapters.out.repository.entity

import java.io.Serializable
import java.time.LocalDateTime
import javax.persistence.*

@Embeddable
data class ProposalInfomationLogId(
        @Column(name = "proposta")
        var proposta: String,
        @Column(name = "data_ultima_atualizacao")
        var dataUltimaAtualizacao: LocalDateTime,
) : Serializable

@Entity
@Table(name = "proposal_information_log")
data class ProposalInfomationLogEntity(

        @EmbeddedId
        var proposalInfomationLogId: ProposalInfomationLogId,

        @Column(name = "cod_produto")
        var codProduto: Int,

        @Column(name = "cod_canal")
        var codCanal: Int,

        @Column(name = "cod_pdv")
        var codPdv: Int
)