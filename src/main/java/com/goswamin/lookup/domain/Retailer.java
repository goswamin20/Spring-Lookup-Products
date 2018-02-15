package com.goswamin.lookup.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Retailer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long retailerId;
    private String FirstName;
    private String LastName;
    private String loginId;
    private String password;
    private String emailId;
    private String phoneNumber;

    @ManyToMany
    @JoinTable(name="Retailer_Address",joinColumns = @JoinColumn(name="retailerId"),
            inverseJoinColumns = @JoinColumn(name="addressId"))
    private Set<Address> address;


    @OneToMany(cascade = CascadeType.ALL)
    private Set<Product> products;

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

    public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public long getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(long retailerId) {
        this.retailerId = retailerId;
    }
}
