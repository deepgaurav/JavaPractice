package com.company;

class oddevennumber {
    public static void main(String[] args) {
     int[] n = {1,3,4,67,89,34};
        System.out.println("Before segregation");
     for(int j =0;j<=n.length-1;j++) {
         System.out.print(n[j]+" ");
     }

     n=  oddevenrearrangment(n);
        System.out.println("After Segregation");
     for(int k=0;k<=n.length-1;k++){
         System.out.println(n[k]+" ");
     }

     }








 public static int[]  oddevenrearrangment(int[]n){
       int left=0;
       int right = n.length-1;
       for(int i=0;i<=right;i++){
           while(n[left]%2==0)
           {
               left=left+1;

           }
           while(n[right]%2==1)
           {
              right = right-1;
           }
           if(left<right){

               int temp = n[left];
               n[left]=n[right];
               n[right]=temp;
           }

       }


          return n;
    }
}
