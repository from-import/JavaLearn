package com.xxx.atm;

public class Account {
    private String Number;
    private String Password;
    private double Money;
    private String Name;
    private double quotaMoney;

    public Account(String number, String password, double money, String name, double quotaMoney) {
        Number = number;
        Password = password;
        Money = money;
        Name = name;
        this.quotaMoney = quotaMoney;
    }

    public Account(String number, String password, String name, double quotaMoney) {
        Number = number;
        Password = password;
        Name = name;
        this.quotaMoney = quotaMoney;
    }

    public Account(String password, double money, String name, double quotaMoney) {
        Password = password;
        Money = money;
        Name = name;
        this.quotaMoney = quotaMoney;
    }

    public Account() {
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public double getMoney() {
        return Money;
    }

    public void setMoney(double money) {
        Money = money;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }
}
