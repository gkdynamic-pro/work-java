public class Mutable4 {

    public static void main(String[] args){

        StringBuilder sb = new StringBuilder(); //StringBuilder and StringBuffer dono ki capacity or work same hoti hai
        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());
        sb.append("s");
        System.out.println(sb.capacity()); //how many character you can add
        System.out.println(sb.length());   // how many character are present 

        StringBuffer sb2 =new StringBuffer("Sachin");
        System.out.println(sb2);
        System.out.println(sb2.capacity());
        System.out.println(sb2.charAt(1));
        sb2.setCharAt(1, 'A'); //SAachin or SAchin
        System.out.println(sb2);
    }
}

    
