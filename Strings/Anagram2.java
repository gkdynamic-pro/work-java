import java.util.Arrays;

public class Anagram2{               // School Master =The classroom/ An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different
    public static void main(String[] args) {
        String str1 = "School Master";
        String str2 = "The classroom Java";

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char []ar1 = str1.toCharArray();
        char []ar2 = str2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if(Arrays.equals(ar1, ar2)){

            System.out.println("It is an Anagram");
        }
        else{
           
             System.out.println("It is not an Anagram");
        }
    }
}