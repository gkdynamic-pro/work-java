public class ImmutableString2{
    public static void main(String[] args) {
        String s1= "pw";  ////ye dono s1 and s2 same object ko refer kar rahe heap memory mai or in String constant pool (SCP) ko 
        String s2= "pw";
        System.out.println(s1==s2);
        
    }
    }