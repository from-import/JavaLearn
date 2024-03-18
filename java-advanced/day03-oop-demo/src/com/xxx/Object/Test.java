package com.xxx.Object;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Alice",18);
        Student  student2 = new Student("Alice" , 19);
        System.out.println(student.toString());
        System.out.println(student.equals(student2));
    }
}
