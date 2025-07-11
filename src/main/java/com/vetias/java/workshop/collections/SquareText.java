package com.vetias.java.workshop.collections;

public class SquareText {
    Square square = (int x)-> x*x;
    Assertions.assertEquals(36,square.findSquare(6));

}
