package com.example.qrscan.converter;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import com.example.qrscan.dto.AccountDto;
import com.example.qrscan.model.Account;

@Component
public class AccountConverter {
    public AccountDto convertEntityToDto(Account account) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(account, AccountDto.class);
    }

    public List<AccountDto> convertEntityToDtoList(List<Account> accountList) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(accountList, new TypeToken<List<AccountDto>>() {
        }.getType());
    }

    public Account convertDtoToEntity(AccountDto accountDto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(accountDto, Account.class);
    }
}
