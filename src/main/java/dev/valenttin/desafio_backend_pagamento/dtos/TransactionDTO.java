package dev.valenttin.desafio_backend_pagamento.dtos;

import dev.valenttin.desafio_backend_pagamento.domain.user.User;

import java.math.BigDecimal;

public record TransactionDTO(BigDecimal value, Long senderId, Long receiverId) {
}
