package com.example.qrscan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {

    String id;
    String userName;
    String userPassword;
    String firstName;
    String lastName;
    String middleName;
    String contact;
    String countryCode;
    String address;

}
