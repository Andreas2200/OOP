public class Printf {
    public static void main(String[] args)
    {
        int i = 42;
        long l = 56;
        float f = 3.14159f;
        double d = 3.14159*10;
        System.out.printf("i=%d l=%,3d f=%f d=%6.2f", i, l, f, d);
    }
}
