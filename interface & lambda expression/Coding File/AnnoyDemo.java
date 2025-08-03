@FunctionalInterface
interface Car                        
   {
     void drive();
   }


public class AnnoyDemo {
    public static void main(String[] args) {
        Car obj = new Car()
         {
            public void drive()                             //Anonymous inner class
            {
                System.out.println("Driving...");
            }

         };
          
    
        obj.drive();

    }
}
