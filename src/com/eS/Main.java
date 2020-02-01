package com.eS;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account account = new Account();
        account.setAccountNumber("10000000");
        account.setCustomerName("John Wick");
        account.setPhone("505606707");
        account.setEmail("john.wick@gmail.com");
        account.depositFunds(500);
        System.out.println(account.getBalance());
        account.depositFunds(1000);
        System.out.println(account.getCustomerName());
        account.withdraw(200);
        Account eL = new Account();
        eL.setCustomerName("James Bond");
        eL.depositFunds(500);
        System.out.println(eL.getBalance());
        eL.withdraw(50);
        Account ann = new Account("589", 252.50, "Ann", "soni@sonia.com", "(098) - 654-654");
        ann.depositFunds(258.38);
        ann.withdraw(510.88);
        Account tim = new Account("Tim Bim", "tim@tim.com", "(098) 123-456");
        tim.withdraw(56);

        VIPCustomer vip = new VIPCustomer();
        System.out.println(vip.getCreditLimit());

        VIPCustomer tom = new VIPCustomer("Tom", 10000);
        System.out.println(tom.getCreditLimit());


    }
}
