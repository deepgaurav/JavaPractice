public class DuplicateReomve {

    public static void main(String[] args) {
        String m = "management";
        char[] ch = m.toCharArray();

        for (int i = 0; i <= ch.length - 1; i++) {
            for(int j=i;j<=ch.length-1;j++)
            if (ch[i] != ch[j]) {
                System.out.println(ch[i]);
            }
        }


    }
}








