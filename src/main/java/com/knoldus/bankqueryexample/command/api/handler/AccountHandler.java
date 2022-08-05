package com.knoldus.bankqueryexample.command.api.handler;

import com.knoldus.bankqueryexample.command.api.event.AccountEvent;
import com.knoldus.bankqueryexample.entity.BankAccount;
import com.knoldus.bankqueryexample.repo.BankAccountRepo;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountHandler {
    @Autowired
    private BankAccountRepo repository;
    @EventHandler
    public void on(AccountEvent event) {
        BankAccount bankAccount = new BankAccount(
                event.getId(),
                event.getOwner(),
                event.getInitialBalance()
        );
        this.repository.save(bankAccount);
    }

}
