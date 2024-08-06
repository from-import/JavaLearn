package com.xxx.d7_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2Comparator {
    public static void main(String[] args) {
        // DIY Sort
        // 1. Arrays.sort() 默认升序排序
        int[] ages = {1,52,62,11,354};
        Arrays.sort(ages);
        System.out.println(ages);

        // Example. 需要降序排序
        Integer[] ages1 = {12,2,1234,113,1,55};
        Arrays.sort(ages1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /*
                if (o1 > o2){
                    return 1;
                }
                else if (o1 < o2) {
                    return -1;
                }
                return 0;

                 */
                return o2 - o1;
            }
        });

        System.out.println(Arrays.toString(ages1));


        // Example. 对类排序

        Student[] students = new Student[3];
        students[0] = new Student("Ming", 23, 175.3);
        students[1] = new Student("Wang", 45, 164.1);
        students[2] = new Student("Yan", 66, 192.5);

        System.out.println(Arrays.toString(students));
        // 如何排序个体？
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                // 自己制定的规则，为年龄比较规则

                // 按照年龄升序排序
                // return o1.getAge() - o2.getAge();

                // 按身高排序(Double 类型)
                return Double.compare(o1.getHeight(), o2.getHeight());

            }
        });

        System.out.println(Arrays.toString(students));
    }
}
