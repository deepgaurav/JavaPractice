class NestedForLoop {
    public static void  printstar(int n) {
        int i, l;

        for (i = 0; i < n; i++) {
            for (l = 0; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
public static void main(String [] args){

        int n=10;
        printstar(n);
}
}
