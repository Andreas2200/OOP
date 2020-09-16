import java.util.Scanner;
public class CelciusToFahrenheit {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Choose your temperature: ");
        float celcius = myScanner.nextFloat();

        float fahrenheit = celcius * 1.8f + 32;

        System.out.println(celcius + "C is " + fahrenheit + "F");

    }
}
