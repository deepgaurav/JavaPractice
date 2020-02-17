public class staticmethod {
    int i=89 ;
    String name="yyy";
   String colllege="BBS";
 staticmethod(String name, int i) {
    name = name;
     i = i;
 }
    public void studentdata(){

     System.out.println(name+""+i+""+colllege);
 }
 public static void main(String[]args){
     staticmethod st1 = new staticmethod("ship",6788);
     staticmethod st2 = new staticmethod("gg",788);
     st1.studentdata();
     st2.studentdata();





    }
}
