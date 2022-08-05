package com.knoldus.bankqueryexample.query.api.controller;

import com.knoldus.bankqueryexample.command.api.dto.FindBankAccountQuery;
import com.knoldus.bankqueryexample.entity.BankAccount;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("api/query")
public class QueryController {
    @Autowired
    private QueryGateway queryGateway;

    @GetMapping("/{accountId}")
    public CompletableFuture<BankAccount> findById(@PathVariable("accountId") String accountId) {
        return this.queryGateway.query(
                new FindBankAccountQuery(UUID.fromString(accountId)),
                ResponseTypes.instanceOf(BankAccount.class)
        );
    }
}
