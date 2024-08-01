package com.xxx.d1_package;
import com.xxx.d1_package.it.Student;

public class Test {
    // 同一个package的class可以互相调用
    // 不同package 需要 import
    public static void main(String[] args) {
        System.out.println(User.onlineNumber);
        System.out.println(Student.studentNumber); // import
    }
}
