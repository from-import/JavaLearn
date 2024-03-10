package com.xxx.traverse;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] nums = {10, 1, 2, 3, 4, 5};

        int sum = 0;
        int maxnum = nums[0]; // 将 maxnum 初始化为数组中的第一个元素

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            sum += nums[i]; // 将数组元素加入到总和中
            if (nums[i] > maxnum) { // 检查是否为当前最大值
                maxnum = nums[i];
            }
        }
        System.out.println("Sum is " + sum); // 输出数组元素之和
        System.out.println("Max is " + maxnum); // 输出数组中的最大值
    }
}
