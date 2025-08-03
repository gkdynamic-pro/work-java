public class LaunchStatic {

 static int age;  //static varible           
                                  //note: phele static variable fir static block execute hoga uske baad main method
                                  // execute hoga then fir  main method ke baad static method execute hoga
                                  //Aur jo static class ke jo member hote hai wo object independent hote hai
 static{

      age=18;
      System.out.println("Static block first");   //static block
      System.out.println(age);
 }
static void disp()
 {
    System.out.println("static disp method main ke badh baad jab hum call karenge");
 }

 public static void main(String[] args) {
    System.out.println("Main method baadme");
    disp();
 }
    
}
