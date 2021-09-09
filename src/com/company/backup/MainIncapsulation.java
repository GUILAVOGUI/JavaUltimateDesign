package com.company.backup;

import com.company.Account;

public class MainIncapsulation {

    public static void main(String[] args) {

       var account = new Account();
       account.deposit(10);
       account.withdraw(5);
       System.out.println(account.getBalance());

    }

}
