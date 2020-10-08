public class Timing
{
    static double fun(double x, double y)
    {
        if(y == 1)
        {
            return Math.pow(x,y);
        }
        else
        {
            return fun(x,y-1)*fun(x,y-1);
        }
    }

    public static void main(String[] args) {
        double x = 1.0000001;

        for (double y = 1; y < 32; y++)
        {
            double timeStart = System.currentTimeMillis();
            double result = fun(x,y);
            double timeEnd = System.currentTimeMillis();
            System.out.println("Attempt " + y + " took: " + (timeEnd-timeStart) + " Result: " + result);
            if(y == 31)
            {
                System.out.println("At the end");
            }
        }
    }
}
