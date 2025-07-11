package com.vetias.java.workshop.collections;

import java.util.Arrays;

public class ArrayStream {
    public static void main(String[] args) {
        int[]marks = { 90,80,70,45,35,100};
        int numberofSubjectsPassed = (int) Arrays.stream(marks)
        .filter(mark->mark>40).count();
        System.out.println(numberofSubjectsPassed);
    }

}
