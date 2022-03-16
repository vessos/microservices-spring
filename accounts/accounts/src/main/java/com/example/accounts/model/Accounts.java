package com.example.accounts.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter @Setter @ToString
public class Accounts {

    @Column(name="customer_id")
    private int customerId;
    @Column(name="account_number")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNumber;
    @Column(name = "account_type")
    private String accountType;
    @Column(name="branch_address")
    private String branchAddress;
    @Column(name="create_dt")
    private LocalDate createDt;
}
