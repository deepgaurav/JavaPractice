public class IntegerPalindrome {
public static void main(String[]args){
    int p=123621;
    int revnum=0;
    int remainder;
    int orgnum;
    orgnum=p;
    while(p!=0) {
        remainder = p % 10; //123621
        revnum = revnum * 10 + remainder;
        p = p / 10;
    }
        if(revnum==orgnum)
            System.out.println(revnum+"   It is a plaindrome number");
        else
            System.out.println(revnum+"  It is not a plaindrome number");

    }




    }


