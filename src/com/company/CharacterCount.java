package com.company;

import java.util.Arrays;

class SortInteger{

    public static void main(String[]args) {

        int ar[]={2,3,17,15,9,10};
        int len = ar.length;

        int temp =0;

        for(int i=0; i<len-1;i++){

            if(ar[i]>ar[i+1]){
                temp=ar[i];
            ar[i]=ar[i+1];
            ar[i+1]= temp;
            System.out.println(ar[i]);}
            else
                {
                System.out.println(ar[i]);

            }


            String ar1[] = {"Corona","TAskshila","Amarpali","the Crest","Magnolias"};
            System.out.println(Arrays.toString(ar1));
            Arrays.sort(ar1);
            System.out.println(Arrays.toString(ar1));


        }







    }





}