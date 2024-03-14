package com.xxx.atm;

import java.util.ArrayList;

public class Login {
    public static Account login(ArrayList<Account> accounts, String number ,String password) {
        for(Account account : accounts){
            if (account.getNumber().equals(number) & account.getPassword().equals(password)){
                System.out.println("Login successfully");
                return account;
            }
        }
        System.out.println("Account or Password Error");
        return null;
    }
}
