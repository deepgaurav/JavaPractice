package com.company;



public class StringCodePractice {





        public static String removerea(String s, char remch) {

            if (s == null || s.isEmpty()) {

                return "";
            }
            StringBuilder sb = new StringBuilder();
            char[] ch = s.toCharArray();
            for (int i = 0; i <ch.length; i++) {
                if (ch[i] != remch) {

                      sb.append(ch[i]);
                }

            }
            return sb.toString();
        }
        public static void main(String[]args){
            String s = "dfeahgjakhjgahggahgga";
            char remch = 'a';

            String result = removerea(s,remch);
            System.out.println(result);

        }



    }