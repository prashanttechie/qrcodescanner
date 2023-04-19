package com.example.qrscan.service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.example.qrscan.dto.AccountDto;
import com.example.qrscan.model.Account;

public interface IAccountService {
    public Account createAccount(AccountDto accountDto);

    public Account updateAccount(AccountDto accountDto);

    public void deleteAccount(String id);

    public AccountDto getAccount(String id) throws NotFoundException;

    public List<AccountDto> getAllAccounts();
}
