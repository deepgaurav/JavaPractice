package com.company;

public class SwapNumbers {
    public static void main (String[]arg){

        int a = 10;
        int b = 4;
        int temp = 0;

        System.out.println("First number value of a :" + a);
        System.out.println("Second Number value of b :" + b);

        temp = a;
        System.out.println(temp);
        a=b;
        b=temp;

        System.out.println("After Swap value of a :"+ a);
        System.out.println("After Swap value of b :" + b);



    }
}
