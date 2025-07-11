package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.List;

public class StreamUpperCaseNames {
     public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Raja");
        names.add("kani");
        names.add("mani");  
        names.add("vaani");
        names.add("rani"); 
        names.add("sahani");
        names.stream()
        .filter(name->name.startsWith("S") ||name.startsWith("s"))
        .distinct().map(String::toUpperCase).forEach(System.out::println);
}
}
