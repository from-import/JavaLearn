package com.xxx.atm;

import java.util.ArrayList;

public class ReadAccount {
    public static void readAccount(ArrayList<Account> accounts, String number) {
        // 遍历账户列表并打印每个账户信息
        for (Account account : accounts) {
            if (account.getNumber().equals(number)) {
                System.out.println("Your Account info:");
                System.out.print("Account Number: " + account.getNumber());
                System.out.print(", Name: " + account.getName());
                System.out.print(", Money: " + account.getMoney());
                System.out.print(", Quota Money: " + account.getQuotaMoney());
                System.out.println(); // 打印空行分隔不同的账户信息
            }
        }
    }
}
