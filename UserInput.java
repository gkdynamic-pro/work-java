import java.util.Scanner;  // by using this we able to take input from console

public class UserInput
{
    public static void main(String[] args) {
      
       Scanner scan=new Scanner(System.in);  // yaha par scanner ek class jiska object create karna padta by new keyword 
       System.out.println("Enter the age");
       int age=scan.nextInt();             //hamme integer input lene ke nextInt() ka use karna padega

       System.out.println("Age is " + age);  //yaha double quote ke biche mai jo likha uska concenatation with integer ya
                                             // dusri chiz ke sath kiya by "+" smybol

       System.out.println("Enter the avg");
       double avg=scan.nextDouble();         //hamme floating, double input lene ke nextFloat(), nextDouble() ka use karna padega
           
       System.out.println("Avg is " + avg); 

       System.out.println("Enter the name");
       String name=scan.next();               //hamme String input lene ke next() ka use karna padega

       System.out.println("name is " + name);


    }
    
}