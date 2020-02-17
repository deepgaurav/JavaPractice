import java.util.Scanner;

public class SwitchBreak {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
      int i =  sc.nextInt();
        switch(i){
            case 1:
                System.out.println("Value of i is 1");
               // break;
            case 2:
                System.out.println("Value of i is 2");
                break;
            case 10:
                System.out.println("value of i is 10");

             //break;
            default:
                System.out.println("Number is not in range of 1 to 10");





        }


    }
}
