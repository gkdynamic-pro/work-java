class Human      //Super class / Base class /Parent class
{
    int age;
    void sleep()
    {
     age=18;
     System.out.println("Human needs good sleep");
     System.out.println(age);
    }
}
    
class Student extends Human     //Child class / Sub class / Derived class  {ye class hai jo dusre class (matlab parent class)  ki chizo ko le raha hai}
{                               //extends keyword se Human class ke andar ke jo bhi properties, methods thae sab kuch ye Student class mai inherit ho chuka hai
                                //extends keyword se in do classo mai "is a relationship ban chuka hai" 

}

 class Inheritance1 
{
 public static void main(String[] args)
  {
    Student st=new Student();
    st.sleep();
  }   
}
