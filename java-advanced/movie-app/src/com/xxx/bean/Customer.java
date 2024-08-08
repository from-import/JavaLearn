package com.xxx.bean;

public class Customer extends User{
    public Customer(String loginName, String trueName, String sex, String account, String password, String phone, double money) {
        super(loginName, trueName, sex, account, password, phone, money);
    }

    public Customer() {
    }
}
