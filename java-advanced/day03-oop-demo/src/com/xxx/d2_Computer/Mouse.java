package com.xxx.d2_Computer;

public class Mouse implements USB{

    private String name;

    public Mouse(String name) {
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
        System.out.println("Mouse connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Mouse disconnected");
    }

    public void click(int times){
        System.out.println("clicked " + times);
    }
}
