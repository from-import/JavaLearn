package com.xxx.d1_set;

import java.util.HashSet;
import java.util.Set;

public class HashCodeDemo {

    // 重写HashCode方法

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        Student s1 = new Student("1",12,'M');
        Student s2 = new Student("1",12,'M');
        Student s3 = new Student("1",15,'F');

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);


    }

}
