package com.company;

public class RemoveWhiteSpace {

    public static void main(String[]arg){
        String s = "this    is  a   new dependency  in  maven";
       String afterreplace=  s.replaceAll("\\s", "");
        System.out.println(afterreplace);





    }
}
