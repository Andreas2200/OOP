public class Kitten {
    double cuteness;
    static int count = 0;

    Kitten(double cuteness)
    {
        this.cuteness = cuteness;
        count++;
    }

    public static void main(String[] args) {
        Kitten[] kittens = new Kitten[10];
        for (int i = 0; i < kittens.length; i++)
        {
            kittens[i] = new Kitten(i*2);
        }
        System.out.println(Kitten.count);
    }
}
