package com.example.postgres.adapters.out.repository.entity.mapper

import com.example.postgres.adapters.out.repository.entity.ProposalInfomationLogId
import com.example.postgres.adapters.out.repository.entity.ProposalInformationLogEntity
import com.example.postgres.application.core.domain.ProposalInfomationLog

object ProposalInformationLogEntityRepositoryMapper {

    fun toEntity(model: ProposalInfomationLog) = ProposalInformationLogEntity(
        proposalInfomationLogId = ProposalInfomationLogId(
            proposta = model.proposta,
            dataUltimaAtualizacao = model.dataUltimaAtualizacao
        ),
        codProduto = model.codProduto,
        codCanal = model.codCanal,
        codPdv = model.codPdv
    )

    fun toModel(entity: ProposalInformationLogEntity) = ProposalInfomationLog(

        proposta = entity.proposalInfomationLogId.proposta,
        codProduto = entity.codProduto,
        codCanal = entity.codCanal,
        codPdv = entity.codPdv,
        dataUltimaAtualizacao = entity.proposalInfomationLogId.dataUltimaAtualizacao

    )


}