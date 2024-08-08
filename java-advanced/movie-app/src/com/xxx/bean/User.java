package com.xxx.bean;

public class User {
    private String loginName;
    private String trueName;
    private String sex;
    private String account;
    private String password;
    private String phone;
    private double money;

    public User(String loginName, String trueName, String sex, String account, String password, String phone, double money) {
        this.loginName = loginName;
        this.trueName = trueName;
        this.sex = sex;
        this.account = account;
        this.password = password;
        this.phone = phone;
        this.money = money;
    }

    public User() {
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
