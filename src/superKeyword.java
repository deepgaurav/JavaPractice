

 class superKeyword {

    int a = 10;
    int b = 20;
    int c = a + b;
}

   class calculate extends superKeyword {
        int a = 6;
        int b = 7;
        int c = a + b;


        public void add() {
            System.out.println(super.c);

        }
    }


class superKeyword1 {


    public static void main(String[] args) {
        calculate a = new calculate();
        a.add();


    }

}

