package com.knoldus.bankqueryexample.command.api.controller;

import com.knoldus.bankqueryexample.command.api.command.CreateAccountCommand;
import com.knoldus.bankqueryexample.command.api.dto.AccountDto;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/command")
public class AccountController {

    @Autowired
    private CommandGateway commandGateway;

    @PostMapping("/save")
    public UUID save(@RequestBody AccountDto accountDto) {
        return this.commandGateway.sendAndWait(new CreateAccountCommand(
                UUID.randomUUID(),
                accountDto.getInitialBalance(),
                accountDto.getOwner()
        ));
    }
}
