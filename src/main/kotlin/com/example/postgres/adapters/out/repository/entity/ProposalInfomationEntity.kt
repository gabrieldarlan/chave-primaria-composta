package com.example.postgres.adapters.out.repository.entity

import java.io.Serializable
import java.time.LocalDateTime
import javax.persistence.*

@Embeddable
data class ProposalInfomationEntityId(
        @Column(name = "proposta")
        var proposta: String,
        @Column(name = "data_primeira_atualizacao")
        var dataPrimeiraAtualizacao: LocalDateTime,
) : Serializable

@Entity
@Table(name = "proposal_information")
//@IdClass(ProposalInfomationEntityId::class)
data class ProposalInfomationEntity(


        @EmbeddedId
        var proposalInfomationEntityId: ProposalInfomationEntityId,

        @Column(name = "cod_produto")
        var codProduto: Int,

        @Column(name = "cod_canal")
        var codCanal: Int,

        @Column(name = "cod_pdv")
        var codPdv: Int,

        @Column(name = "data_ultima_atualizacao")
        val dataUltimaAtualizacao: LocalDateTime
)
