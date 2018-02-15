package com.goswamin.lookup.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressId;
    @ManyToMany(mappedBy = "address")
    private Set<User> users;
    @ManyToMany(mappedBy = "address")
    private Set<Retailer> retailers;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private boolean isPrimaryAddress;

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public Set<User> getUser() {
        return users;
    }

    public void setUser(Set<User> user) {
        this.users = user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
