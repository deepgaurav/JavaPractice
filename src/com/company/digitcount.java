package com.company;

import java.util.Scanner;

public class digitcount {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
      int n =  sc.nextInt();

      // int n = 62723647;
       int count = 0;
       while(n>0){

           n = n/10;
           count++;

       }

        System.out.print("Number of digit in a number : " +count);

    }
}
