package com.example.postgres.adapters.out.repository.entity.mapper

import com.example.postgres.adapters.out.repository.entity.ProposalInfomationEntity
import com.example.postgres.adapters.out.repository.entity.ProposalInfomationEntityId
import com.example.postgres.application.core.domain.ProposalInformation

object ProposalInformationEntityRepositoryMapper {

    fun toEntity(model: ProposalInformation) = ProposalInfomationEntity(
            proposalInfomationEntityId = ProposalInfomationEntityId(proposta = model.proposta, dataPrimeiraAtualizacao = model.dataPrimeiraAtualizacao),
            codProduto = model.codProduto,
            codCanal = model.codCanal,
            codPdv = model.codPdv,
            dataUltimaAtualizacao = model.dataUltimaAtualizacao

    )

    fun toModel(entity: ProposalInfomationEntity) = ProposalInformation(
            proposta = entity.proposalInfomationEntityId.proposta,
            dataPrimeiraAtualizacao = entity.proposalInfomationEntityId.dataPrimeiraAtualizacao,
            codProduto = entity.codProduto,
            codCanal = entity.codCanal,
            codPdv = entity.codPdv,
            dataUltimaAtualizacao = entity.dataUltimaAtualizacao

    )


}