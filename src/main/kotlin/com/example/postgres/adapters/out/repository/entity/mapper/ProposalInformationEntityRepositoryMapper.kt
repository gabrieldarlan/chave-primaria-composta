package com.example.postgres.adapters.out.repository.entity.mapper

import com.example.postgres.adapters.out.repository.entity.ProposalInfomationEntity
import com.example.postgres.application.core.domain.ProposalInformation

object ProposalInformationEntityRepositoryMapper {

    fun toEntity(model: ProposalInformation) = ProposalInfomationEntity(
            proposta = model.proposta,
            dataPrimeiraAtualizacao = model.dataPrimeiraAtualizacao,
            codProduto = model.codProduto,
            codCanal = model.codCanal,
            codPdv = model.codPdv,
            dataUltimaAtualizacao = model.dataUltimaAtualizacao

    )

    fun toModel(entity: ProposalInfomationEntity) = ProposalInformation(
            proposta = entity.proposta,
            dataPrimeiraAtualizacao = entity.dataPrimeiraAtualizacao,
            codProduto = entity.codProduto,
            codCanal = entity.codCanal,
            codPdv = entity.codPdv,
            dataUltimaAtualizacao = entity.dataUltimaAtualizacao

    )


}