package com.yourbank.service;

import com.yourbank.domain.Transaction;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.security.auth.login.AccountNotFoundException;
import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
@Transactional

public class TransactionService {

    // Dependency injection
    private final TransactionRepository transactionRepository;
    private final AccountRepository accountRepository;

    public Transaction createDeposit(Long accountId, BigDecimal amount){
        // 1. Find the account
        Account account = accountRepository.findById(accountId)
                .orElseThrow(() -> new AccountNotFoundException(accountId)); // throw Exception when an account is not found

    }
}
