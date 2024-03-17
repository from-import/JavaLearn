package com.xxx.TestDemo;

public class CompareMe {
    public static void main(String[] args) {
        People.Heart heart = new People().new Heart();
        heart.show();
    }
}


class People2{
    private static int heartbeat = 100;
    public class Heart{
        private int heartbeat = 120;
        public void show(){
            int heartbeat = 150;

            System.out.println(heartbeat); // 150
            System.out.println(this.heartbeat); // 120
            System.out.println(People2.heartbeat); // 100

        }
    }
}