class Student 
{
   public int age;          //Note: Public members ko kisi bhi class se access kiya ja sakta hai (agar object available ho).   
   public int marks=80;     // Lekin private members sirf usi class ke andar access ho sakte hain.
   public String name;       //Agar hume private members ko dusri class mein access karna hai,
                            //toh hume unke liye method (getter/setter) banana padta hai, jise object ke zariye access kar sakte hain.
                            // Non-static members (public ya private) ko bina object ke access nahi kar sakte.
                            // Agar bina object ke access karna hai, to member ko static banana padega.
 public void setData()
 {
     age = 18;
     name = "Rahul";
 }
 
 public void show()
 {
     System.out.println(name + " "+ age);
 }

}

public class Encapsulation1B {

    public static void main(String[] args) {
        Student obj = new Student();
        //obj.age = 28;  yaha par hum class student member jo public unhe modify aur use kar sakte hai
        // obj.name = "rahul";
        System.out.println(obj.marks);
        System.out.println(obj.age); // agar ye obj.age ka use karte hai toh yaha pe value assign nhi hui so we get null or 0 value
        obj.setData();
        obj.show();
    } 

}




// | Member Type             | `public` | `static` | Access Without Object?        
// | ----------------------- | -------- | -------- | ------------------------     |
// | `public` + `non-static` | ✅        | ❌        | ❌ Object needed          |
// | `public` + `static`     | ✅        | ✅        | ✅ Allowed via class name |



// Note:
// Public members ko kisi bhi class se access kiya ja sakta hai (agar object available ho).
// Lekin private members sirf usi class ke andar access ho sakte hain.

// Agar hume private members ko dusri class mein access karna hai,
// to hume unke liye method (getter/setter) banana padta hai, jise object ke zariye access kar sakte hain.

// Non-static members (public ya private) ko bina object ke access nahi kar sakte.
// Agar bina object ke access karna hai, to member ko static banana padega.
