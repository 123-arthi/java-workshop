package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListMark {

    public static void main(String[] args) {
         List<Integer> mark= new ArrayList<>();
         mark.add(100);
         mark.add(90);
         mark.add(80);
         mark.add(50);
         mark.add(60);
         mark.add(70);
         mark.add(80);
         System.out.println("Ascending Order");
         Collections.sort(mark);
         System.out.println(mark);
         System.out.println("Descending Order");
         Collections.sort(mark,Collections.reverseOrder());
         System.out.println(mark);
         System.out.println("Highest.Mark");
         Collections.sort(mark);
         System.out.println(mark.getLast());
        


    }
}
