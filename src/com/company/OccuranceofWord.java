package com.company;

import java.util.Scanner;

public class OccuranceofWord {

    public static void main (String[]arg){


        String sc = "This is a java programming language";
        int len = sc.length();
        System.out.println(len);
        int ar[]={1,2,5,6};


       int beforereplace =  sc.replace("a", "").length();
        System.out.println(beforereplace);

        int count =  len - beforereplace;
        System.out.println(count);



String s = "I love my India";
int len1 = s.length();
int afterlen = s.replace("I","").length();
int count1= len1 - afterlen;
        System.out.println("Occurance of I is : "+count1);







    }
}
