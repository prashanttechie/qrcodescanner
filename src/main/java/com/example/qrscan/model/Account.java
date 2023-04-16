package com.example.qrscan.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document("account")
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
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
