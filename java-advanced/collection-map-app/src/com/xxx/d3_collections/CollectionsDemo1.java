package com.xxx.d3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"a","b","c");
        Collections.shuffle(names);
        Collections.sort(names);

        System.out.println(names);
        // Collections.sort(apples,(o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()) );
    }
}
