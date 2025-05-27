package com.yourbank.domain;

import com.yourbank.domain.enums.AccountType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;


@Entity // means that the object/class can be addressed as a "row" in a table
@Getter @Setter @NoArgsConstructor // default methods for getting, setting attributes in the "row", and NoArgsConstructor for a default constructor

public class Account {
    @Id // ID will be the primary key of the entity (in the database/table)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // when a new entity will be created, the ID will autoincrement

    private long id; // this is the primary key

    private String accountNumber; // the visible account number to the customer (ex. "1234567")
    private BigDecimal balance; // sort of int
    private AccountType type;

    @ManyToOne // many accounts can belong to one customer, create a foreign key in the account table pointing to customer
    private Customer customer;

    @OneToMany(mappedBy = "account")
    private List<Transaction> transactions; // i think this is a link of the foreign key from Transaction entity (table)

}