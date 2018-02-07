package com.goswamin.lookup.domain;

import java.util.List;

public class User {
    private String FirstName;
    private String LastName;
    private int userId;
    private String loginId;
    private String password;
    private String emailId;
    private String phoneNumber;
    private Account account;
    private List<Address> address;
    private List<BankDetail> bankDetails;
    private Address primaryAddress;
    private BankDetail primaryBankAccount;
}
