package com.knoldus.bankqueryexample.command.api.event;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AccountEvent {

        private UUID id;
        private BigDecimal initialBalance;
        private String owner;
    }

