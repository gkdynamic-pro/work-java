public class ImmutableString3{
    public static void main(String[] args) {
        String s1= new String("pw");
        String s2= new String("pw");
        System.out.println(s1==s2); //it use for check karte hai ki string same object refer kar rahe ya different object ko
        System.out.println(s1.equals(s2)); //equals() is use for check comparision between string or values
        
    }
    }