package dev.valenttin.desafio_backend_pagamento.repositories;

import dev.valenttin.desafio_backend_pagamento.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
