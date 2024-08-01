package com.xxx.d2_Computer;

public class KeyBoard implements USB{
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println("KeyBoard connected");
    }

    @Override
    public void disconnect() {
        System.out.println("KeyBoard disconnected");
    }

    public void check(int times){
        System.out.println("check " + times);
    }
}
