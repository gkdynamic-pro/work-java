// inner class  have three types - member, static and Anonymous

class A
{

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


public class InnerDemo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
      
     // A.B obj1 = obj.new B();  // for non-static class aur B ka (obj1) object banane ke hume A ka object (obj) jarurat hogi
        A.B obj1 = new A.B();  //for static class mai hum iss tarike se hum B ke object ko create kar uske method ko use kar sakte hai 
        obj1.display();
    }
}
