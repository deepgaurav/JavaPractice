package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueCharacter {


    public static boolean is_Unique_str(String w)

    {
        char[] ch = w.toCharArray();

        Arrays.sort(ch);
        for (int i = 1; i < w.length(); i++) {
            if (ch[i] == ch[i - 1]) {

                return false;
            }
        }
        return true;


    }
public static void main(String[]args){


    Scanner sc = new Scanner(System.in);
    String w = sc.nextLine();

    //Selenium

    //  eeilnmu

    System.out.println("String after duplicates removal  "+is_Unique_str(w));



        }


    }

