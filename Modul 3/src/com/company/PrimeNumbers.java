package com.company;

public class PrimeNumbers {
    public static void main(String[] args)
    {
        long numbersUpTo = 100;
        String primeNumbers = "";

        for (long i = 1; i <= numbersUpTo; i++)
        {
            int counter = 0;
            System.out.println("Debug 1");
            for (long y = i; y >= i; y--)
            {
                if(i%y == 0)
                {
                    counter++;
                    System.out.println("Debug 2");
                    break;
                }
            }
            if(counter == 2)
            {
                primeNumbers = primeNumbers + i + " ";
                System.out.println("Debug 3");
            }
        }
        System.out.println(primeNumbers);
    }
}
