abstract class AeroPlane3            
{
    //abstract int age;          // abstract class and method ho sakta hai lekin abstract variable nhi ho sakta kabhi , constructor( kyoki super method include hota by default body hoti uske andar) abstract  nhi ho sakta kabhi  

   abstract public void takeOff();    // jab koi child class iss method (only method signature hota ) ki impleamentation or body use nhi kar raha hai
                                     // bas child class uss method modified kar rahe bas aur aisa method jiski definiton aur implementation nhi hoti hai
                                     // toh hume uss method ko abstract declare karna padega aur agar class mai ek bhi method abstract hai toh uss class ko bhi abstract declare karna padega must hai
    abstract public void fly();   // yaha pe 100% abstract nhi hai ye impure abstract if we want to acheive 100% karna toh we use concept of interface

    public void landing()          //beacause yaha ye non-abstract method hai 
    {
        System.out.println("Aeroplane is landing");
    }
}


class CargoPlane3 extends AeroPlane3
{
    public void takeOff()
    {
        System.out.println("CargoPlane requires longer runway");
    }
   public void fly()
   {
    System.out.println("Cargoplane flies at lower height");
   } 
   public void alert()     //ye ek specialized method hai 
   {
    System.out.println("Alert..");
   } 
}

class PassengerPlane3 extends AeroPlane3
{
    public void takeOff()
    {
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly()
    {
    System.out.println("PassengerPlane flies at medium height");
    }
}
public class LaunchAbs 
{
    public static void main(String[] args) 
    {
            AeroPlane3 ref1=new CargoPlane3();   // yaha reference variable parent type ka hai
            ref1.takeOff();
            ref1.fly();
            ref1.landing();
            ((CargoPlane3) ref1).alert();   //we call specialized method only by castingand here it is called downcasting

            AeroPlane3 ref3=new PassengerPlane3();
            ref3.takeOff();
            ref3.fly();
            ref3.landing();

           // AeroPlane3 ref=new AeroPlane3();  //aap abstract class ka object nhi bna sakte hai 
        
    }
    
}
