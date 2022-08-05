package com.knoldus.bankqueryexample.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "bank")
public class BankAccount {
    @Id
    private UUID id;
    private String owner;
    private BigDecimal balance;
}

