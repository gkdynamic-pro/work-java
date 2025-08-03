import java.util.Scanner;
public class UserInput1
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in); //yaha par LHS side par Scanner hai wo ek data-type hai aur "scan" ek varible hai
                                               //aur RHS "new" ek "Scanner" naam ki class ka object create karne keyword use hota   
	    
		System.out.println("Enter the age:");
		int age = scan.nextInt(); //jab nextInt(); ke baad nextLine(); use hota hai usse phele nextLine(); likhna hota for clear buffer
		scan.nextLine(); //ye likhna hota hai toh agae wala nextLine(); kaam karta hai
	
		System.out.println("what is your bankname:");
		String bankname = scan.nextLine();
		
		System.out.println("age:" + age);
		System.out.println("Bankname :" + bankname);

		scan.close(); //important ye jabhi use karenge  jab  hume program mai agae  koi input lene ki jarurat na pade 
		              //isko nhi likho tobhi shi hai or kyoki ye resoure free kar deta hai taki memory leak na ho 
	}
}