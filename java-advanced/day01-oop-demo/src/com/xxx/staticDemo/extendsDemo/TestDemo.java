package com.xxx.staticDemo.extendsDemo;

public class TestDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.setName("sbTeacher");
        student.setName("goodStudent");

        teacher.hello();
        student.say();
        System.out.println(student.getName());
    }
}
