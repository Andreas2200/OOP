package com.company;
import java.util.Scanner;

public class ChristmasSale {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        //System.out.print("Input seconds you want converted: ");
        long seconds = System.currentTimeMillis()/1000;
        long minutes, hours, days, month, years;
        //long remainingSeconds,remainingMinutes,remainingHours, remainingDays, remainingMonths;
        long currentTime = 1578088800;
        long timeSinceNewYear = seconds-currentTime;
        float price = 599.95f;
        float discount = 0.3f;

        minutes = timeSinceNewYear/60;
        //remainingSeconds = timeSinceNewYear%60;
        hours = minutes/60;
        //remainingMinutes = minutes%60;
        days = hours/24;
        //remainingHours = hours%24;
        month = days/30;
        //remainingDays = days%30;
        years = month/12;
        //remainingMonths = month%12;

  /*      System.out.println(remainingMonths + " months.");
        System.out.println(remainingDays + " days.");
        System.out.println(remainingHours + " hours.");
        System.out.println(remainingMinutes + " minutes.");
        System.out.println(remainingSeconds + " seconds.");

   */

        //System.out.println(timeSinceNewYear);

        if(month != 12)
        {
            System.out.println("It's not Christmas!");
            System.out.println(price);
        }
        else
        {
            System.out.println("It's Christmas!");
            System.out.println(price * discount);
        }
    }
}
