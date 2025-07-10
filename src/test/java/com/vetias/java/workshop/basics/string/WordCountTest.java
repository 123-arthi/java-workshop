package com.vetias.java.workshop.basics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCountTest {
    @Test
    public void testWordCount(){
        WordCount wordCount = new WordCount();
        int count = wordCount.count("This is a java program to test the String");
        Assertions.assertEquals(9,count);
    } 
    
     

    @Test
    public void testAnotherString(){
        WordCount wordCount = new WordCount();
        int count = wordCount.count("This is Arthi");
        Assertions.assertEquals(3,count);
    } 
    
}      



