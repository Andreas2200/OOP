package com.company;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        int month = myScanner.nextInt();

        switch (month)
        {
            case 4:
            {
                System.out.println("Easter Holiday!");
                break;
            }
            case 7:
            {
                System.out.println("Summer Vacation!");
                break;
            }
            case 8:
            {
                System.out.println("Summer Vacation!");
                break;
            }
            case 10:
            {
                System.out.println("Fall Holiday!");
                break;
            }
            case 12:
            {
                System.out.println("Winter Holiday!");
                break;
            }
            default:
            {
                System.out.println("No holiday :(");
                break;
            }
        }
    }
}
