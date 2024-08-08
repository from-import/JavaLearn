package com.xxx.bean;

public class Business extends User{
    private String shopName;
    private String address;

    public Business(String loginName, String trueName, String sex, String account, String password, String phone, double money, String shopName, String address) {
        super(loginName, trueName, sex, account, password, phone, money);
        this.shopName = shopName;
        this.address = address;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
