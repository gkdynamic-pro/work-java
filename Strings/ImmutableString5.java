
public class ImmutableString5{
    public static void main(String[] args) {
        
        String s1 = "pwjava";
        String s2 = s1.concat("skill");     //concat method
        String s3 = new String("pwjava");
         s3 = s3.concat("skill"); 
         System.out.println(s1);
         System.out.println(s2);
         System.out.println(s3);
    }
}