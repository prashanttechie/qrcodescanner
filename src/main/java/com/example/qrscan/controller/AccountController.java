package com.example.qrscan.controller;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qrscan.dto.AccountDto;
import com.example.qrscan.model.Account;
import com.example.qrscan.service.IAccountService;

@RestController
@RequestMapping("account")
public class AccountController {

    private IAccountService accountService;

    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/getAll")
    List<AccountDto> getAccountDetails() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/get/{id}")
    AccountDto getAccountDetailsById(@PathVariable String id) throws NotFoundException {
        return accountService.getAccount(id);
    }

    @DeleteMapping("/delete/{id}")
    void deleteAccountDetails(@PathVariable String id) {
        accountService.deleteAccount(id);
    }

    @PostMapping("/create")
    Account createDetails(@RequestBody AccountDto accountDto) {
        return accountService.createAccount(accountDto);
    }

    @PostMapping("/update")
    Account updateDetails(@RequestBody AccountDto accountDto) {
        return accountService.updateAccount(accountDto);
    }

}
