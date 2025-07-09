package com.vetias.java.workshop.temperaturedata.java.beans;

public class Stringc{
    public static void main(String[]args) {
        // System.out.println(finalName.toUpperCase());
        String sentence ="this program shows how can we split a"+"string into multiple strings.We need to find sentance,"+"word and letter count";
        String word[] =sentence.split(" ");
        String sentences[]=sentence.split("//.");
        System.out.println(word.length);
        System.out.println(sentences.length);
        System.out.println("letter"+sentence.length());
    }
}
