// inner class  have three types - member, static and Anonymous


class Person
{
    int age;
    String name;
    Address add;   // iss tarike se bhi merge karke  variable store kar  sakte ek different class banake

    class Address
{
    String city;
    String state;
    int pincode;
}


    public void show()
    {
        System.out.println("in A show");
    }
    static class B               // static keyword hum sirf inner class par use kar sakte only 
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
}


public class InnerDemo1 {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.show();
      
     // A.B obj1 = obj.new B();  // for non-static class aur B ka (obj1) object banane ke hume A ka object (obj) jarurat hogi
        Person.B obj1 = new Person.B();  //for static class mai hum iss tarike se hum B ke object ko create kar uske method ko use kar sakte hai 
        obj1.display();
    }
}
