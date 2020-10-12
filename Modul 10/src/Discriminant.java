public class Discriminant
{
    public static void computeDiscriminant(double a, double b, double c)
    {
        double d = 0;
        System.out.println("You wrote the following: " + (int)a + "x^2 + " + (int)b + "x + " + (int)c);
        d = Math.pow(b,2) - 4 * a * c;
        System.out.println("Discriminant is: " + d);
        computeRoots(a,b,d);
    }

    public static void computeRoots(double a, double b, double d)
    {
        double root1 = 0;
        double root2 = 0;

        root1 = (-b + Math.sqrt(d))/(2*a);
        root2 = (-b - Math.sqrt(d))/(2*a);

        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
    }

    public static void main(String[] args)
    {
        computeDiscriminant(2,5,2);
    }

}
