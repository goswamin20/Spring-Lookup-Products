package com.goswamin.lookup.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class BankDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bankDetailId;
    private long creditCardNumber;
    private Date expirationDate;
    private int cvv;

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }

    private boolean isPrimary;
    @ManyToMany(mappedBy = "bankDetails")
    private Set<User> users;
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

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




}
