package com.example.postgres.adapters.out.repository.entity.mapper

import com.example.postgres.adapters.out.repository.entity.ProposalInfomationLogEntity
import com.example.postgres.application.core.domain.ProposalInfomationLog

object ProposalInformationLogEntityRepositoryMapper {

    fun toEntity(model: ProposalInfomationLog) = ProposalInfomationLogEntity(
            id = model.id,
            proposta = model.proposta,
            codProduto = model.codProduto,
            codCanal = model.codCanal,
            codPdv = model.codPdv,
            dataUltimaAtualizacao = model.dataUltimaAtualizacao

    )

    fun toModel(entity: ProposalInfomationLogEntity) = ProposalInfomationLog(
            id = entity.id,
            proposta = entity.proposta,
            codProduto = entity.codProduto,
            codCanal = entity.codCanal,
            codPdv = entity.codPdv,
            dataUltimaAtualizacao = entity.dataUltimaAtualizacao

    )


}