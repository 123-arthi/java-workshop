package com.vetias.java.workshop.collections.Streams.NameStartsWithCout;

import java.util.ArrayList;
import java.util.List;

public class NameStartsWithCout{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Raja");
        names.add("Rani");
        names.add("Vaani");
        names.add("Rani");
        names.add("Kani");
        names.add("Mani");
        long nameCount = names.stream().filter(name->name.startsWith("S")).count();
        System.out.println(nameCount);
    }
}
