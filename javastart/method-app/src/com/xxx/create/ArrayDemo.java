package com.xxx.create;public class ArrayDemo {
    public static void main(String[] args) {
        String names[] = {"Bob","Alice","Fack"};
        superprint(names);

    }
    public static void superprint(String[] args){
        System.out.print("{");
        if (args != null & args.length >0){
            for(int i = 0; i < args.length ; i++){
                System.out.print(i == args.length -1 ? args[i] : args[i] + ",");
            }
        }
        System.out.println("}");
    }
}
