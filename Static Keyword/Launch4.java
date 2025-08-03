class Demo1
{
 static int a;
 static int b;

 int m;
 int n;
 
 static 
 {
    a=10;    // ye static variables hai jo heap memory mai ek baar allocate honge 
    b=20;    // static varibles agr apko koi value hai jo saare objects same vlaues ko use karenge toh wo aap static bna do toh banane se kya hoga wahi memory program mai ek barr allocate hogi wahi value program mai throughout use kar sakte hai jiske ke liye hum static varibles ko class member bhi kehte hai  class loading ke samay Kyunki common copy of data will be shared among all the objects  
    System.out.println("Control in static block");
 }
                     //hum non-static member ke andar hum static members ya varibles ko call or use kar sakte hai kyoki ye object independent hai
                     //but static member ke andar hum non-static members ya varibles ko call or use nhi kar sakte hai  kyoki ye sab non-static members obeject upar dependent hote hai
 {
      m=100;   // ye non-static or instance varibles hai jo heap memory mai multiple time allocate honge depends on kitne object ban rahe hai
      n=200;    
      System.out.println("Control in non static block");
}

static void disp1()  //Yeh user-defined method hai — aap ne khud banaya hai.
{
    System.out.println("Value of static var " + a);
    System.out.println("Value of static var " + b);

}

void disp2()   //Yeh user-defined method hai — aap ne khud banaya hai.
{
      System.out.println("Value of instance var " + m);
      System.out.println("Value of instance var " + n);
}

}

public class Launch4
 {
    public static void main(String[] args)
    {
        Demo1 d = new Demo1();
        Demo1.disp1();
        d.disp2();
    }
}


