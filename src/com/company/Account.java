package com.company;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(){

    }

    public Account(String number, double balance, String customerName, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }


    public Account (String customerName, String email, String phoneNumber) {
        this("696969",100.55, customerName,email,phoneNumber);

    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println ("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount < 0 ){
            System.out.println ("Only " + this.balance + " available. Not processed");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println ("Withdrawal of " + withdrawalAmount + " done. Remaining is = " + this.balance);
        }
    }



    public String getNumber () {
        return number;
    }

    public void setNumber (String number) {
        this.number = number;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public String getCustomerName () {
        return customerName;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
