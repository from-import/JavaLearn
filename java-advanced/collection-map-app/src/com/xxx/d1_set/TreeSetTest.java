package com.xxx.d1_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        // 对自定义class排序

        Set<Integer> sets1 = new TreeSet<>();
        sets1.add(65);
        sets1.add(34);
        sets1.add(11);

        System.out.println(sets1);

//        Set<Student> sets2 = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge() >= 0 ? 1 : -1; // 按照年龄升序
//                // Double.compare(o1.get() - o2.get())
//            }
//        });


        Set<Student> sets2 = new TreeSet<>( (o1, o2) -> (o1.getAge() - o2.getAge() >= 0 ? 1 : -1));
        // 升级版写法

        Student s1 = new Student("1",12,'M');
        Student s2 = new Student("1",12,'M');
        Student s3 = new Student("1",15,'F');

        sets2.add(s1);
        sets2.add(s2);
        sets2.add(s3);

        System.out.println(sets2);



    }
}
