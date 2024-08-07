package com.xxx.d2_params;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println(sum(10,1,2,3,4,5));
    }

    public static int sum(int multiple, int...nums){
        // 可变参数
        if (nums == null && nums.length == 0){
            return 0;
        }
        else{
            int result = 0;
            for (int num : nums){
                result += num;
            }
            return result * multiple;
        }
    }
}
