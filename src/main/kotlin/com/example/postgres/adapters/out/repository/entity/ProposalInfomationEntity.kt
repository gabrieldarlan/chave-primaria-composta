package com.example.postgres.adapters.out.repository.entity

import org.hibernate.Hibernate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "proposal_information")
data class ProposalInfomationEntity(

        @Id
        @Column(name = "proposta")
        val proposta: String,


        @Column(name = "data_primeira_atualizacao")
        val dataPrimeiraAtualizacao: LocalDateTime,

        @Column(name = "cod_produto")
        val codProduto: Int,

        @Column(name = "cod_canal")
        val codCanal: Int,

        @Column(name = "cod_pdv")
        val codPdv: Int,

        @Column(name = "data_ultima_atualizacao")
        val dataUltimaAtualizacao: LocalDateTime
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as ProposalInfomationEntity

        return proposta != null && proposta == other.proposta
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(proposta = $proposta )"
    }
}
