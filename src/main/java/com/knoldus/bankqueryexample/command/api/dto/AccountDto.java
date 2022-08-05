package com.knoldus.bankqueryexample.command.api.dto;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AccountDto {
        private BigDecimal initialBalance;
        private String owner;
    }

