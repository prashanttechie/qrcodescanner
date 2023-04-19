package com.example.qrscan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.qrscan.model.Account;

public interface AccountRepository extends MongoRepository<Account, String> {

}
