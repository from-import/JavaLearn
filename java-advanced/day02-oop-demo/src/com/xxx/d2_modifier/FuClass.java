package com.xxx.d2_modifier;

public class FuClass {
    private void private_method(){
        System.out.println("---private---");
    }

    void method(){
        System.out.println("---normal---");
    }

    protected void protected_method(){
        System.out.println("---protected---");
    }

    public void public_method(){
        System.out.println("---public---");
    }

    public static void main(String[] args) {
        FuClass fu = new FuClass();
        fu.private_method();
        fu.method();
        fu.protected_method();
        fu.public_method();
    }
}
