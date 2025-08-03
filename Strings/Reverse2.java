public class Reverse2 {
    public static void main(String[] args) {
     String str1 = "pwskill java";
     String str2 = "";
     String sarr[] =str1.split(" "); // ye method keh raha jaha par bhi space ho vha par split kardo kyo yaha par (" ") humne space ko liya split ke liye 

     for(int i=sarr.length-1; i>=0; i--){
        str2= str2+sarr[i]+ " ";
     }
     System.out.println("Before reversing:" + str1);
     System.out.println("After reversing:" + str2);
    }
    
}
