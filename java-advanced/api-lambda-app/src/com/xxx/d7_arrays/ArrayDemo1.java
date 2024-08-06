package com.xxx.d7_arrays;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr = {1,522,1,456,2,6,14,3};
        String rs = Arrays.toString(arr);
        System.out.println(rs);

        // 快排
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 二分搜素(仅对排好序的数组生效)
        int index = Arrays.binarySearch(arr,522);
        System.out.println(index);
        // 返回不存在元素的规律： return (right position) - 1
        // 若数组未排序，可能导致二分的方向不存在该值，导致错误



    }
}
