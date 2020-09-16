package com.company;

public class CelciusToFahrenheit {
    public static void main(String[] args)
    {
        float fahrenheit = 0;

        for (float celcius = 40; celcius > -5; celcius -= 0.5)
        {
            fahrenheit = celcius * 1.8f +32;
            System.out.println(celcius + "C : " + fahrenheit + "F");
        }
    }
}
