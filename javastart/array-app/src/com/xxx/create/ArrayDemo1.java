package com.xxx.create;
import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 1, 4};
        String[] names = {"Bob", "Alice", "John"};

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(nums));

        System.out.println(names[(names.length-1)]);
        System.out.println(names.length);

        // 动态初始化
        int[] nums2 = new int[3];
        String[] names2 = new String[5];

        System.out.println(nums2.length);
        System.out.println(names2.length);

        //
    }
}
