package com.eS;

public class VIPCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VIPCustomer(){
        this("VIP Customer", 250000, "vip@vip.com");
        System.out.println("default constructor");

    }

    public VIPCustomer(String name, double creditLimit){
        this(name, creditLimit, "default email");
    }

    public VIPCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String  getName(){
        return name;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public String getEmail(){
        return email;
    }
}
