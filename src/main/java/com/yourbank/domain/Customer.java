package com.yourbank.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Customer{
    @Id // this is the primary key of the table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id for the customer (in the table) will autoincrement; this id will not be visible to the client
    private Long id; // this is the id

    // these are the customer details
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "customer") // this says that the customer can have multiple accounts
    private List<Account> accounts; // and provides the list of the accounts, saved in the table Customer
}