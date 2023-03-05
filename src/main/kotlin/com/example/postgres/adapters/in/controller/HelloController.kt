package com.example.postgres.adapters.`in`.controller

import com.example.postgres.adapters.`in`.controller.request.ProposalnformationRequest
import com.example.postgres.adapters.`in`.controller.request.mapper.ProposalInformationRequestMapper
import com.example.postgres.adapters.`in`.controller.response.ProposalInformationResponse
import com.example.postgres.adapters.`in`.controller.response.mapper.ProposalInformationResponseMapper
import com.example.postgres.application.ports.`in`.SaveProposalInformationInputPort
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("hello")
class HelloController(
        private val saveProposalInformationInputPort: SaveProposalInformationInputPort
) {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello World"
    }

    @PostMapping
    fun save(@RequestBody request: ProposalnformationRequest): ProposalInformationResponse {
        val toDomain = ProposalInformationRequestMapper.toDomain(request)
        val optional = saveProposalInformationInputPort.save(toDomain)
        if (optional.isEmpty) {
            throw RuntimeException("Não gravou")
        } else {
            return ProposalInformationResponseMapper.toResponse(optional.get())
        }

    }

}