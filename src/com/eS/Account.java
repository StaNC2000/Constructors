package com.eS;

public class Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public Account() {
        this("123456798", 2.5, "Default name", "Default address", "");
        System.out.println("Empty constructor called");
    }

    public Account(String  accountNumber, double balance, String customerName, String email, String phone){
        System.out.println("Account constructor called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public Account(String customerName, String email, String phone) {
        this("99999", 150.55, customerName, email, phone);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void depositFunds(double deposit){
        this.balance = balance + deposit;
        System.out.println("Amount of " + deposit + " deposited to account number: " + accountNumber );
    }

    public void withdraw(double withdraw){
        if (balance >= withdraw) {
            this.balance = balance - withdraw;
            System.out.println("You withdraw " + withdraw + " from your account," );
            System.out.println("Your account current balance is: " + balance);
        }
        else {
            System.out.println("Not enough funds on your account, please try lower amount: ");
        }
    }

    public String toString(){
        return "";
    }
}