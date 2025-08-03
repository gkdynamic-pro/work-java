

class Animal 
{
    public void eat()
    {
        System.out.println("Animal eats everyday");
    }
    public void age(int x)
    {
        System.out.println("Animal age is");
    }
    
}

class Tiger extends Animal
{
   public void eat()     //inherit karte waqt child class mai visibility ko decrease  nhi kar sakte but visibility increase kar sakte jaise public and jo parent mai wo hi hoga jab bhi override kar rahe ho
   {
    System.out.println("Tiger hunts and eat");
   }
//    public int age()   //override karte return type bhi change nhi kaar sakte jo parent ka hai wo hi rahega
//    {
//     return 10;
//    }

// public void age() // abhi ye override nhi hoga ek specialized method ki tah consider hoga aur method overloading keh layega
//    {
    
//    }
    
  public void age(int x)
   {
    
   }
    
}


public class Inheritance3 
{
    public static void main(String[] args) 
    {
      Tiger t=new Tiger();
      t.eat();
      
      
    }   
}
