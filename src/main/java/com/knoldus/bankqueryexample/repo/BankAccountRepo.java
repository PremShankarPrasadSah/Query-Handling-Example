package com.knoldus.bankqueryexample.repo;

import com.knoldus.bankqueryexample.entity.BankAccount;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BankAccountRepo extends MongoRepository<BankAccount, UUID> {

}
