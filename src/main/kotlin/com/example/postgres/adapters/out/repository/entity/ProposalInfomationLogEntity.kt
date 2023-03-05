package com.example.postgres.adapters.out.repository.entity

import org.hibernate.Hibernate
import java.time.LocalDateTime
import javax.persistence.*


@Entity
@Table(name = "proposal_information_log")
data class ProposalInfomationLogEntity(

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int? = null,

        @Column(name = "proposta")
        val proposta: String,

        @Column(name = "data_ultima_atualizacao")
        val dataUltimaAtualizacao: LocalDateTime,

        @Column(name = "cod_produto")
        val codProduto: Int,

        @Column(name = "cod_canal")
        val codCanal: Int,

        @Column(name = "cod_pdv")
        val codPdv: Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as ProposalInfomationLogEntity

        return proposta != null && proposta == other.proposta
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(proposta = $proposta )"
    }
}