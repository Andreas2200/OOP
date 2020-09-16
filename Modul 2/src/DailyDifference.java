public class DailyDifference {
    public static void main(String[] args)
    {
        String[] days;
        float[] temperatures;

        days = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        temperatures = new float[]{21.5f,23.7f,19.6f,22.5f,25.3f,21.7f,18.9f};

        for(int i = 0; i < days.length-1; i++)
        {
            System.out.print(days[i] + ": ");
            System.out.println(temperatures[i] + "C");
            System.out.print(days[i+1] + ": ");
            System.out.println(temperatures[i+1] + "C");
            System.out.println("Difference: " + (temperatures[i+1] - temperatures[i]) + "C");
        }

    }
}
