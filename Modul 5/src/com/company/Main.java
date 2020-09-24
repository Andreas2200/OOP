package com.company;

public class Main {

    public static void main(String[] args)
    {
        int[] a = {1,2,3};
        int b = 4;

        fun(a,b);

        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] fun(int[] array, int value)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] *= value;
        }
        return array;
    }
}
