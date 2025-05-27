package com.yourbank.domain;

import com.yourbank.domain.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;
    private LocalDateTime timestamp;
    private TransactionType type;

    @ManyToOne
    private Account account;

    private String description;
}
