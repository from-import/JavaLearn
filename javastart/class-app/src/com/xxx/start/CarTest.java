package com.xxx.start;

public class CarTest {
    public static void main(String[] args) {
        Car byd = new Car();
        byd.name = "byd";
        byd.price = 50000;

        byd.startCar();
        System.out.println(byd.price);
    }
}
