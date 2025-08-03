


// class Demo1
// {
//     void disp()
//     {
//         System.out.println("Disp wrttien in demo1 class");
//     }
// }
// class Demo2 extends Demo1
// {

// }
// class Demo3 extends Demo2
// {

// }

class Parent1 //extends Object class ko inherit karti hai behind the scene aur ye object class parent of all class
{
    int age=18;
}
class Parent2 //extends Object
{
    int age=19;
}

class Child extends Parent1 //, extends Parent2 / ek class ka ek hi parent allow hai so multiple inheritance java mai allow nhi hai
{                           // aur iss problem ko hum diamond shaped problem bhi khete hai
   
}

public class Inheritance4 
{
    public static void main(String[] args) 
    {
        // Demo3 d=new Demo3();
        // d.disp();
    }
    
}
