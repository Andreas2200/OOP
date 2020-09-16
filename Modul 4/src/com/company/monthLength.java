package com.company;

public class monthLength {

    public static void main(String[] args) {

        int[] integerArray;
        integerArray = new int[12]; //Dette starter et array af integers med størrelsen 12, så fra 0-11

        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i = 0; i < months.length; i++) {
            System.out.println("Month " + (i+1) + " has " + months[i] + " days.");
        }
    }
}


