import java.util.Arrays;

public class ArraySort {


    public static void main(String[]args){


        String s[] = {"aaa", "mmm", "ccc", "sss","lll"};
        System.out.println(" Befor sorting"+ Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("After sorting"+Arrays.toString(s));



        int[] ar = {1,2,4,5,8};
        int sum = 0;
        for(int i=0; i<=ar.length-1;i++){
            sum = sum+ar[i];

        }

        System.out.println(sum);

    }
}
