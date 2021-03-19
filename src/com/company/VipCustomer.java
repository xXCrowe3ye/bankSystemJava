package com.company;

public class VipCustomer {

    private String vipCustName;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer () {
        this ("default name", 999999, "default email");
    }

    public VipCustomer (String vipCustName, double creditLimit) {
        this (vipCustName, creditLimit,"default email");
    }

    public VipCustomer (String vipCustName, double creditLimit, String emailAddress) {
        this.vipCustName = vipCustName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


    public String getVipCustName () {
        return vipCustName;
    }

    public double getCreditLimit () {
        return creditLimit;
    }

    public String getEmailAddress () {
        return emailAddress;
    }
}
