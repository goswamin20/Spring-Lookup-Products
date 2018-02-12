package com.goswamin.lookup.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    private String FirstName;
    private String LastName;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userId;
    private String loginId;
    private String password;
    private String emailId;
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;
    @OneToMany
    private Review review;
    @ManyToMany
    private List<Address> address;
    private List<BankDetail> bankDetails;
    private Address primaryAddress;
    private BankDetail primaryBankAccount;

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<BankDetail> getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(List<BankDetail> bankDetails) {
        this.bankDetails = bankDetails;
    }

    public Address getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(Address primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public BankDetail getPrimaryBankAccount() {
        return primaryBankAccount;
    }

    public void setPrimaryBankAccount(BankDetail primaryBankAccount) {
        this.primaryBankAccount = primaryBankAccount;
    }
}
