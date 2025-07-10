package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Raja");
        names.add("kani");
        names.add("mani");  
        names.add("vaani");
        names.add("rani"); 
        names.add("saani");
        System.out.println(names);
        names.set(1, "revathy");
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
        names.sort(Comparator.naturalOrder());


    }

}
