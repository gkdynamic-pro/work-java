
class Demo{
                              //note: Aur jo static class ke jo member hote hai wo object independent hote hai
                              // wo directly aap class ka naame use karke usko execute kar sakte hai
   static void disp1()
   {                         
      System.out.println("Static disp1");
   }
   void disp2()    //Yeh user-defined method hai — aap ne khud banaya hai.
   {
System.out.println("non static disp 2");

   }
   
}

public class Launch3{
 public static void main(String[] args) 
 {
   Demo.disp1();

   Demo d = new Demo();   //static method can be invoked directly with the class name 
                          //also by creating object  through the reference also but 
   d.disp1();             // non-static method is object dependent
   
   d.disp2();
   



 }
    
}
