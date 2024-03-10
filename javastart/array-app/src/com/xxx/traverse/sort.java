package com.xxx.traverse;

import java.util.Arrays;

public class sort {
    // 冒泡小排序
    public static void main(String[] args) {
        int nums[] = {1,4,2,6,23,7,4};
        for (int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] > nums[j]){

                    int save = nums[j];
                    nums[j] = nums[i];
                    nums[i] = save;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
