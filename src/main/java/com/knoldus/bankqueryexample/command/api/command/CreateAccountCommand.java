package com.knoldus.bankqueryexample.command.api.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateAccountCommand {

    @TargetAggregateIdentifier
    private UUID accountId;
    private BigDecimal initialBalance;
    private String owner;
}

