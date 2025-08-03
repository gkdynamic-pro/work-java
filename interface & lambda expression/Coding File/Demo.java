
interface A
{
    void show(); 
}
interface X
{
    void abc();
}
class B implements A,X   //here multiple interface allowed  //note jab hum interface banate aur methods declare karte toh un sabko compulsorys impleament karna padta hai jis class impleament karte hai waha 
{                                                           
    public void show()
    {
        System.out.println("in show");
    }
    public void abc()
    {
        System.out.println("in abc");
    }
}

public class Demo {
    public static void main(String[] args) {
       //A obj = new B();     //agar ye A obj use karenge sirf A ke member ka use hoga only X ka nhi 
       B obj = new B();       // isliye B ko reference banayenge taki both A and X interface use ho
       obj.show();
       obj.abc();
      
    }
}
