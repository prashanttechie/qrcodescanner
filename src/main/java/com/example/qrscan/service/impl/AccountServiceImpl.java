package com.example.qrscan.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.example.qrscan.converter.AccountConverter;
import com.example.qrscan.dto.AccountDto;
import com.example.qrscan.model.Account;
import com.example.qrscan.repository.AccountRepository;
import com.example.qrscan.service.IAccountService;

@Service
public class AccountServiceImpl implements IAccountService {

    private AccountRepository accountRepository;
    private AccountConverter accountConverter;

    public AccountServiceImpl(AccountRepository accountRepository, AccountConverter accountConverter) {
        this.accountRepository = accountRepository;
        this.accountConverter = accountConverter;
    }

    @Override
    public Account createAccount(AccountDto accountDto) {
        return accountRepository.save(accountConverter.convertDtoToEntity(accountDto));
    }

    @Override
    public Account updateAccount(AccountDto accountDto) {
        return accountRepository.save(accountConverter.convertDtoToEntity(accountDto));
    }

    @Override
    public void deleteAccount(String id) {
        accountRepository.deleteById(id);
    }

    @Override
    public AccountDto getAccount(String id) throws NotFoundException {
        Optional<Account> optional = accountRepository.findById(id);
        if (optional.isEmpty()) {
            throw new NotFoundException();
        }
        return accountConverter.convertEntityToDto(optional.get());
    }

    @Override
    public List<AccountDto> getAllAccounts() {
        return accountConverter.convertEntityToDtoList(accountRepository.findAll());
    }

}
