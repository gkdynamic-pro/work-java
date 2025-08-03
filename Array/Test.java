class Test 
 {               

    int a;  //class ke andar jo varible hote unhe hum instance variable bolte hai and all objects have same number of instance variable
    String name; // jo ki class duwara define hote hai aur instance variable have default values

    public static void main(String[] args) { 
        //jo variable method ke andar hote unhe hum local varible bolte hai aur local variable ko hamesha initialize karna chaiye aur baad mai use karna chaiye
         //object create karne ke liye 
         //varible declare karenge jo ki stack area mai hoga
         //fir object create karenge jo ki heap area mai hoga with object address and with  instance variable

        int num = 9; // primitive varible hai ye wo variable hota hai jo kisi primitive value ko refer karta jaise number, character, point value hogai etc
        Test obj1 = new Test(); //reference variable hai ye wo varible hai jo kisi object ko refer karta hai
        Test obj2 = new Test();
                               //object have default values and every object's variable are independent 
        obj1.name = "Gourav";   // example two different object have two different varible values

        System.out.println(obj1.a);
        System.out.println(obj1.name);

        System.out.println(obj2.a);
        System.out.println(obj2.name);
    }
} 