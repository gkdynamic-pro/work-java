public class ImmutableString4{
    public static void main(String[] args) {
        String s1= "pwjava";
        String s2= "pwjava";
        String s3= "pwJava";
        System.out.println(s1==s2); //it use for check karte hai ki string same object refer kar rahe ya different object ko
        System.out.println(s1==s3); 
        System.out.println(s1.equals(s2)); //equals() is use for check comparision between string or values
        System.out.println(s1.equals(s3)); //equals() is use for check comparision between string or values 
                                            //or ye upper case or lower ko bhi match karta hai
        
        System.out.println(s1.equalsIgnoreCase(s3)); //equalsIgnorecase() is use for check comparision between string or values 
                                                     // orye upper case /lower case ko match nhi ignore karta hai 
        
    }
    }