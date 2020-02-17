import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractNumberFromString {

    public static void main(String [] args){

     String s = "100Testcasesarefailed200casesarepassed80casesareskipped";
        System.out.println("Before number extraction=  "+s);
         extractnum(s);

    }

    public static void extractnum(String s) {

        // s = "100Testcasesarefailed200casesarepassed80casesareskipped";
        int temp = 0;
        int len = s.length();
        System.out.println("size of string : "+len);
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);
        while (m.find()) {
            String numpat= m.group();
            System.out.println(numpat);
            int thar = Integer.parseInt(numpat);

            temp = temp+thar;

        }
        System.out.println("Total number extraction from given string : "+temp);
    }
}
