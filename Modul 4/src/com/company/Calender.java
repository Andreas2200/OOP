package com.company;

public class Calender {
    public static void main(String[] args)
    {
        int[] leapYear = {31,29,31,30,31,30,31,31,30,31,30,31};
        int[] nonLeapYear = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int leapYearChecker = 4;

        for (int i = 2000; i <= 2020; i++) {
            System.out.println("");
            System.out.println("Year " + i);
            if (i%leapYearChecker == 0)
            {
                for (int j = 0; j < leapYear.length; j++) {
                    System.out.println(months[j] + " has " + leapYear[j] + " days." );
                }
            }
            else
            {
                for (int k = 0; k < nonLeapYear.length; k++) {
                    System.out.println(months[k] + " has " + nonLeapYear[k] + " days." );
                }
            }
        }
    }
}
