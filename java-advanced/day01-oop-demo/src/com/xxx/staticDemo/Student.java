package com.xxx.staticDemo;

public class Student {
   public String name;

    public void study(){
        System.out.println(name + " is studying");
    }

    public static void study2(String name){
        System.out.println(name + " is studying");
    }

    public static void main(String[] args) {
        study2("hello");

        Student student = new Student();
        student.name = "Faker";
        student.study();

    }
}
