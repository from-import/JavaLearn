package com.xxx.atm;

import java.util.ArrayList;
import java.util.Random;

public class RegisterMethod {
    public static String register(ArrayList<Account> accountList, String password, String name, double quotaMoney){
        Random random = new Random();
        StringBuilder realNumberBuilder = new StringBuilder();

        // 构建真实编号
        for (int i = 0; i < 10; i++) {
            realNumberBuilder.append(random.nextInt(10));
        }
        String realNumber = realNumberBuilder.toString();

        // 检查是否已存在相同的账户编号
        boolean exists = false;
        for(Account account : accountList){
            if (account.getNumber().equals(realNumber)){
                exists = true;
                break;
            }
        }

        // 如果不存在相同的账户编号，则添加新账户
        if (!exists){
            accountList.add(new Account(realNumber, password, name, quotaMoney));
            return realNumber;
        } else {
            // 如果存在相同的账户编号，则重新生成编号
            return register(accountList, password, name, quotaMoney);
        }
    }
}
