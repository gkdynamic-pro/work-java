public class Mutable1 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Virat"); //method-1 via StringBuffer for making mutable String object banane ke liye

        System.out.println(sb);
        //StringBuffer sb = ""; invalid hai ye

        sb.append(" Kholi ");
        System.out.println(sb);


        //method-2 via StringBuilder for making mutable String object banane ke liye

        StringBuffer sb1 = new StringBuffer("Virat");

        System.out.println(sb1);
        //StringBuider sb1 = ""; invalid hai ye

        sb1.append(" Kholi ");
        System.out.println(sb1);
        
    }
    
}
