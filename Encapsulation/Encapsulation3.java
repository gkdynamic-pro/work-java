class Student 
{
 private int age;  //instance variable
 private String name;
 public void show()
 {
     System.out.println(name + " "+ age);
 }

 public void setData1(int a) //Note: yaha par parentheses ander int age ek parameter hai
 {                          // "a" is a local variable (in form of a parameter)
     age = a;               //Agar parameter ka naam LHS (left-hand side) se alag hota hai
                            //toh Java compiler LHS ko instance variable maanta hai,
   }                        //aur RHS yani parameter ki value instance variable ko assign kar deta hai
 

    //  public void setData1(int age)   
    //  {                              Lekin agar parameter aur LHS ka naam same hota hai,
                                    // to Java compiler dono sides ko parameter ya local variable hi samajhta hai.
          //  age = age;                         // Matlab, priority parameter ko milti hai,
                                    // aur instance variable untouched reh jaata hai (koi assignment nahi hoti).

                                    // Is wajah se jab object ke through instance variable ko access karte hain,
                                    // to wo apni default value return karta hai, jaise:

                                    // int → 0

                                    // String → null

                                    // boolean → false

                                    // float → 0.0, etc.

                                    // ✅ Is situation ko hi hum "Shadowing Problem" kehte hain,
                                    // jahan local variable ya parameter instance variable ko shadow (chhupa) deta hai.

                                    // 👉 Solution: Use this keyword
                                    // Aise case mein this keyword ka use zaroori hota hai,
                                    // taaki Java compiler ko clearly bataya ja sake ki:

     //   }                                                // LHS = instance variable
                                    // RHS = parameter
                                    //this.age = age;

                
                  

  public void setData2()
 {
     name = "Rahul";
 }
    
}

public class Encapsulation3 {

    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();

        obj.setData1(18);
        obj1.setData1(25);
        obj.show();
        obj1.show();
    } 

}


//Remark:
// Agar parameter ka naam LHS (left-hand side) se alag hota hai,
// to Java compiler LHS ko instance variable maanta hai,
// aur RHS yani parameter ki value instance variable ko assign kar deta hai.

// Lekin agar parameter aur LHS ka naam same hota hai,
// to Java compiler dono sides ko parameter ya local variable hi samajhta hai.
// Matlab, priority parameter ko milti hai,
// aur instance variable untouched reh jaata hai (koi assignment nahi hoti).

// Is wajah se jab object ke through instance variable ko access karte hain,
// to wo apni default value return karta hai, jaise:

// int → 0

// String → null

// boolean → false

// float → 0.0, etc.

// ✅ Is situation ko hi hum "Shadowing Problem" kehte hain,
// jahan local variable ya parameter instance variable ko shadow (chhupa) deta hai.

// 👉 Solution: Use this keyword
// Aise case mein this keyword ka use zaroori hota hai,
// taaki Java compiler ko clearly bataya ja sake ki:

// LHS = instance variable

// RHS = parameter

   


 //what is parameter: Parameters bhi local variables hi hote hain, lekin wo method ke argument ke form mein aate hain

// Java mein Variable Resolution Rule (Scope Rule):
        // Jab Java kisi variable ka naam dekhta hai, toh ye order follow karta hai:
        // Sabse pehle local scope (method ke andar ke variables ya parameters) check karta hai.
        // Agar naam match karta hai, toh wahi use karta hai.
        // Agar local mein nahi mila, tabhi class ke instance variables check karta hai.

// Jab this keyword likha hota hai:
    // this.age = age;
    // this.age → Java samajh jata hai: "Arey! this likha hai, iska matlab instance variable."
    // age → ab bhi parameter hi hai (method ka argument)
    // So JVM ka thinking:
    // "Object ke andar jo age variable hai (i.e., instance variable), usme parameter ki value store karo."


// ✅ Why this.age is an instance variable?
// 🔹 Because:
// this ka matlab hota hai: current object.

// this.age = current object ke andar ka age (i.e., instance variable).

// Class ke andar jitne bhi non-static variables hote hain, unko instance variables kehte hain.

// Jab this ke saath likhte ho (this.age), toh JVM clearly samajh jaata hai ki tum object ke variable ko refer kar rahe ho.





