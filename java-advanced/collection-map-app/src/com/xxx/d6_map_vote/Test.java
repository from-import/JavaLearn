package com.xxx.d6_map_vote;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<String> selects2 = new ArrayList<String>();
        Collections.addAll(selects2, "A", "B", "C", "D");
        Random r = new Random();

        Map<String, Integer> result = new HashMap<>();
        result.put("A",0);
        result.put("B",0);
        result.put("C",0);
        result.put("D",0);

        Map<String, List<Integer>> result2 = new HashMap<>();

        List<Integer> choose = new ArrayList<>();
        Collections.addAll(choose,1,2,3,4,5);
        result2.put("A",choose);

        System.out.println(result2);


        for (int i = 0; i < 80; i++) {
            int random = r.nextInt(4) + 1;
            switch (random){
                case 1:{result.put("A",result.get("A") + 1);break;}
                case 2:{result.put("B",result.get("B") + 1);break;}
                case 3:{result.put("C",result.get("C") + 1);break;}
                case 4:{result.put("D",result.get("D") + 1);break;}
            }
        }

        System.out.println(result);
    }
}
