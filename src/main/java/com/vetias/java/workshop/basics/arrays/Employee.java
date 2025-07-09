package com.vetias.java.workshop.basics.arrays;

import java.util.Arrays;

public class Employee{
    public static void main(String[] args) {
        String[][] employeeid = new String[5][2];
        employeeid[0][0]="arthi03";
        employeeid[0][1]="30000";
        employeeid[1][0]="rani";
        employeeid[1][1]="40000";
        employeeid[2][0]="soni";
        employeeid[2][1]="30000";
        employeeid[3][0]="mani";
        employeeid[3][1]="45000";
        employeeid[4][0]="guru";
        employeeid[4][1]="20000";

        for(String[]employee:employeeid){
            System.out.println(Arrays.toString(employee));
        }


    }
}
