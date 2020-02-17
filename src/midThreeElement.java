public class midThreeElement {
    public static void main(String[]args){
        int [] num = {3,4,6,7,8,9,2};
        int midvalue = (num.length-1)/2;  //7-1/2=6/2=3
        int mid =num[midvalue];  //num[3]=7

        for(int i=midvalue-1;i<=midvalue+1;i++)
        {
            System.out.println(num[i]);
        }




    }
}
