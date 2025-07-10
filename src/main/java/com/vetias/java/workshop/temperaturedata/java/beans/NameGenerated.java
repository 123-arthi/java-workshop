package com.vetias.java.workshop.temperaturedata.java.beans;

import java.util.Scanner;
public class NameGenerated {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println("Enter your Gender");
        String gender = scanner.next();
        System.out.println("Enter your qualiification");
        String qualiification=scanner.next();

        if ("male".equalsIgnoreCase (gender)) {
            System.out.println("Mr. " + name +  qualiification);
            
        }
        else if ("female".equalsIgnoreCase(gender)) {
            System.out.println("Ms. " + name +  qualiification);
        }
        else {
            System.out.println("error: Invalid");
            
        }



        

        
    

    }
         


  }
}
