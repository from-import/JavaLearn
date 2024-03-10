package com.xxx.create;

public class ArrayFind {
    public static void main(String[] args) {
        int [] nums = {1,4,2,5,7,3};
        System.out.println(findme(nums,15));

    }
    public static int findme(int[] args , int target){
        for(int i = 0; i < args.length; i++){
            if (args[i] == target){
                return i;
            }
        }
        return -1;
    }
}
