package com.company;

import org.w3c.dom.ls.LSOutput;

public class missingnumber {

    static int missnum(int n[], int a){

        int total;
        int i;
        int sum=0;
        total=(a+1)*((a+2)/2);
        for( i=0;i<a;i++)

         total=total-n[i];

        return total;



    }

    public static void main(String[] args) {
int n[] = {1,2,3,5,6,7};
int miss = missnum(n, 6);
        System.out.println(miss);

    }
}