package com.company;

public class removewhitespaces {
    public static void main(String[] args){

        String s = "Myname is Shipra. I am from India. I am an Automation Engineer.";
        int len = s.length();
        System.out.println(len);
        String n = "";

        char [] ch = s.toCharArray();
        for(int i = 0; i<=len-1;i++){
            if((ch[i] != ' ') & (ch[i] != '\t')){

           n = n+ch[i];

            }


        }

        System.out.println(n);


    }


}
