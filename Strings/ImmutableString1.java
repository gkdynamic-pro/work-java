public class ImmutableString1{
public static void main(String[] args) {
    String s1=new String("pw");  //ye dono s1 and s2 alag alag object ko refer kar rahe heap memory mai
    String s2=new String("pw");
    System.out.println(s1==s2);
}
}