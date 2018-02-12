package com.goswamin.lookup.domain;

import javax.persistence.ManyToMany;
import java.util.Date;

public class BankDetail {
    private long bankDetailId;
    private long creditCardNumber;
    private Date expirationDate;
    private int cvv;
    private Address address;

    public long getBankDetailId() {
        return bankDetailId;
    }

    public void setBankDetailId(long bankDetailId) {
        this.bankDetailId = bankDetailId;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToMany
    private User user;
}
