package com.company;

public class foreachloop {
    public static void main(String[]args){

        int ar[]= {1,2,3,3,4,5,5,6};
        String sr[]={"Git","Maven","Selenium","Java","Jenkins"};
        for(int l:ar){

            System.out.println(l);
        }
        for(String s:sr){

            System.out.println(s);
        }

    }
}
