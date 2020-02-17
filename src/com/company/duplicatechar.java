package com.company;

public class duplicatechar {

    public static void main(String[] args){


        String s = "managment";
        char[] ch = s.toCharArray();
        int len = ch.length;
        System.out.println(len);


        for(int i = 0;i<=len-1;i++){
            for(int j=i+1;j<len;j++){

                if(ch[i]==ch[j]){
                    System.out.println("duplicate character"+ch[i]);

                }





            }

        }



    }
}
