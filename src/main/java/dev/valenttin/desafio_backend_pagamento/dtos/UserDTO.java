package dev.valenttin.desafio_backend_pagamento.dtos;

import dev.valenttin.desafio_backend_pagamento.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType) {
}
