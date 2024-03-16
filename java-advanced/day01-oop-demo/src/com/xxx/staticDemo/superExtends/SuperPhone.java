package com.xxx.staticDemo.superExtends;

public class SuperPhone extends Phone {
    public void superCall(){
        super.call();
        System.out.println("Call me");
        }

    public static void main(String[] args) {
        SuperPhone phone = new SuperPhone();
        phone.superCall();
    }
}

