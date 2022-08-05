package com.knoldus.bankqueryexample.query.api.projection;

import com.knoldus.bankqueryexample.command.api.dto.FindBankAccountQuery;
import com.knoldus.bankqueryexample.entity.BankAccount;
import com.knoldus.bankqueryexample.repo.BankAccountRepo;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;


@Component
public class BankQueryHandler {

    private BankAccountRepo bankAccountRepo;

    public BankQueryHandler(BankAccountRepo bankAccountRepo) {
        this.bankAccountRepo = bankAccountRepo;
    }

    @QueryHandler
    public BankAccount handle(FindBankAccountQuery query) {
        BankAccount response = this.bankAccountRepo.findById(query.getAccountId()).orElse(null);
        return response;
    }


}
