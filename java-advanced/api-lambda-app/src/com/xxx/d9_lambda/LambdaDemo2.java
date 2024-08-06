package com.xxx.d9_lambda;

import java.util.Arrays;

public class LambdaDemo2 {
    public static void main(String[] args) {
        Integer[] arr = {5, 1, 3, 2};
        Arrays.sort(arr,(Integer o1,Integer o2) -> o2-o1); // 降序
        Arrays.sort(arr,(Integer o1,Integer o2) -> o1-o2); // 升序

        System.out.println(Arrays.toString(arr));
    }
}
