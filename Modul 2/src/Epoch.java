import java.util.Scanner;
public class Epoch {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        //System.out.print("Input seconds you want converted: ");
        long seconds = System.currentTimeMillis()/1000;
        long minutes, hours, days, years;
        long remainingSeconds,remainingMinutes,remainingHours, remainingDays;

        minutes = seconds/60;
        remainingSeconds = seconds%60;
        hours = minutes/60;
        remainingMinutes = minutes%60;
        days = hours/24;
        remainingHours = hours%24;
        years = days/365;
        remainingDays = days%365;

        System.out.println(years + " years.");
        System.out.println(remainingDays + " days.");
        System.out.println(remainingHours + " hours.");
        System.out.println(remainingMinutes + " minutes.");
        System.out.println(remainingSeconds + " seconds.");
    }
}
