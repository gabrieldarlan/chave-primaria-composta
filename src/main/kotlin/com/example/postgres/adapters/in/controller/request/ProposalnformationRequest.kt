package com.example.postgres.adapters.`in`.controller.request

import com.fasterxml.jackson.annotation.JsonProperty

data class ProposalnformationRequest(
        @JsonProperty("proposta")
        var proposta: String,
        @JsonProperty("cod_produto")
        var codProduto: Int,
        @JsonProperty("cod_canal")
        var codCanal: Int,
        @JsonProperty("cod_pdv")
        var codPdv: Int,
        @JsonProperty("data_ultima_atualizacao")
        var dataUltimaAtualizacao: String,
)
