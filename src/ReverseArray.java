import java.util.Scanner;

public class ReverseArray {
    public static void main (String[]arg){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
       int n = sc.nextInt();
       int rev = 0;
while(n!=0){

   rev = rev*10+n%10;   //4
   n=n/10;  //123

}
        System.out.println("Reverse of number n is :" +rev);
    }









}
