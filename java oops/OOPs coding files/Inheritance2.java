class Human1 
{
    private String name;                //private member of a class will not participated in inheritance
    int age;

    Human1()                              //Constructor bhi inherit nhi hota will not participated in inheritance
    {                                     // par student1 child class ke super method se ye parent constructor execute ho raha hai aur fir wapas control child  class ke constructor pe jata hai
        System.out.println("Human class Constructor");   
    }

    void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student1 extends Human1  
{
    // public Student1()
    // {
        //super();   //peheli line of constructor super method call hota hai, and this super method is used to call constructor of same class / super method parent class ke constructor ko call karta hai/ aur behind the scene aap super method likho ya na likho ye included raheta hai
    // }
    void disp()
    {
        System.out.println(" The age is : " + age);
       // System.out.println(" The Name is : " + name);
    }
}

public class Inheritance2  
{
    public static void main(String[] args) 
    {
        Student1 st1=new Student1();  //aap yaha pe ek object ko bana rahe ho and jab aap object bnayenge toh aap yaha pe ek constructor ko call kar rahe ho student1 ki class ka
        st1.sleep();
        st1.disp();
        
    }
    
}
