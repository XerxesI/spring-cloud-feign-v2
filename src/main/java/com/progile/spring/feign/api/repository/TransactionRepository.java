package com.progile.spring.feign.api.repository;

import com.progile.spring.feign.api.dto.IssuerTransactionDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<IssuerTransactionDao, Integer> {
}
