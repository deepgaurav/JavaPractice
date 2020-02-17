package com.company;

public class ArmstrongNumber {

    public static void main(String[]arg){
      /*  int cube = 0;
        int n = 153;
        n>0;
        1^3+5^3+3^3;


        int rem =n%10;
        cube = cube+rem^3;
        n/10;*/

      int n = 153;
      int cube =0, temp;
      temp=n;
      while(n>0){   //153>0
          int mod=n%10;  //153%10=3
          n= n/10;  //15
          cube = cube+(mod*mod*mod);   //0+3^3
      }
        System.out.println(cube);
      if (cube==temp){

          System.out.println("Number is armstrong number");
      }else
      {
          System.out.println("Number is not An Armstrong Number");
      }


    }
}
