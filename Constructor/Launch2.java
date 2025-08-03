class Demo
{
   private int a;
   private int b;



//  public Demo()      // agar user object banata hai toh by default ek "Default constructor" banta hai with no parameters
//  {                  // aur ye programmer ko samne nhi dikhta hai , aur yaha pe heap memory mai instance variables with default value bante hai 
//                     //Basically default constructor automatically include hota hai if and only if pure programm mai khi par bhi koi  parameterize ya zero parameterize constructor present nahi hona chaiye
//  }

 public Demo()       // agar humne constructor banaya with parameter means parameterized constuctor toh waha pe default constructor nhi banta hai
 {                   // aur hume default constructor ki need hai toh alag se banana padhta hai wo auto create nhi hota hai jab parameterized constructor banate hai jab
                
    System.out.println("Zero parametrized by programmer");

 }

 public Demo(int a, int b)      
 {
    this.a = a;
    this.b = b;
 }
 
 void disp()
 {
    System.out.println(a);
    System.out.println(b);
 }

}

public class Launch2 {
    public static void main(String[] args) {
        
        Demo d = new Demo();
        d.disp();

        Demo d2=new Demo(10, 20);
        d2.disp();
        
    }
}

