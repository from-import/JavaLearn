package com.xxx.traverse;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo2 {
    public static void main(String[] args) {
        Random r = new Random();
        String[] names = {"Bob","Alice","Dog"};

        for(int i = 0; i < names.length; i++){
            int randomnumber = r.nextInt(3);

            String oldname = names[i];
            String newname = names[randomnumber];

            names[i] = newname;
            names[randomnumber] = oldname;
        }
        System.out.println(Arrays.toString(names));

    }
}
