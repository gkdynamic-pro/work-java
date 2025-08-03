public class Mutable3 {

    public static void main(String[] args) {


    // final int a=10;  //final keyword se value fix hojyegi lekin mutable se immutable nhi hoga means no change 
                        //aur dusre object ko refer nhi karega heap memory mai
    // a=20;            //hence we get compile time error
    // System.out.println("a");

    final StringBuffer sb = new StringBuffer("Virat");
    sb.append(" Kholi");

    // System.out.println(sb);

      sb=new StringBuffer("Sachin");  //here get compile time error 
    System.out.println(sb);     
     
    

    }
    
}