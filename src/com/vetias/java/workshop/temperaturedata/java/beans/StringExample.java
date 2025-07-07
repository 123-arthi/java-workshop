package com.vetias.java.workshop.temperaturedata.java.beans;

public class StringExample {
    public static void main (String[]args){
        String firstName = "Arthi";
        String lastName = new String("Meena");
        String ShortName ="Meera";
        String buddyName = new String("Arthi");
        System.out.println(firstName == ShortName);
        // String fullName = firstName+""+lastName;
        // String finalName = firstName.concat(lastName);
        // System.out.println(finalName.toUpperCase());
        String sentence = "This program shows hoe can we split a String into a multiple String";
        String words[] = sentence.split("");
        System.out.println(words.length);

        for (String word : words) 
         {
            System.out.println(word);
        }
    }

}

