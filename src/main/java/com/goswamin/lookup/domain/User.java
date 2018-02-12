package com.goswamin.lookup.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Review> reviews;
    @ManyToMany
    @JoinTable(name="User_Address",joinColumns = @JoinColumn(name="userId"),
            inverseJoinColumns = @JoinColumn(name="addressId"))
    private Set<Address> address;

    @ManyToMany
    @JoinTable(name="User_BankDetail",joinColumns = @JoinColumn(name="userId"),
            inverseJoinColumns = @JoinColumn(name="bankDetailId"))
    private Set<BankDetail> bankDetails;



    public Set<Review> getReview() {
        return reviews;
    }

    public void setReview(Set<Review> review) {
        this.reviews = review;
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

    public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }

    public Set<BankDetail> getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(Set<BankDetail> bankDetails) {
        this.bankDetails = bankDetails;
    }




}
