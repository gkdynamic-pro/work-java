class Student 
{

  private int age;               // Note:   Hum private variables/members ko sirf same class mein access kar sakte hain.
  private String name;           // Agar hume private members ko dusri class mein access karna hai, to uske liye
  public void setData()          // getter/setter ya koi method banana padta hai, jise object ke through call kar sakte hain.                       
  {                              // Student class ke public ya private non-static members ko bina object ke access nahi kar sakte.
    age =18;                     // Agar bina object ke access karna hai, to member ko static banana padega.
    name = "Rahul";     
 }
 
 public void show()
 {
     System.out.println(name + " "+ age);
 }

}

public class Encapsulation2 {

    public static void main(String[] args) {
        Student obj = new Student();
        // obj.age = 18;  ❌  private member direct access nahi kar sakte
        // obj.name = "rahul"; ❌ private member direct access nahi kar sakte
        obj.setData();
        obj.show();
    } 

}






// | Modifier                 | Static | Access Without Object? | Explanation                             |
// | ------------------------ | ------ | ---------------------- | --------------------------------------- |
// | `private` + `non-static` | ❌      | ❌                      | Sirf class ke andar object se           |
// | `public` + `non-static`  | ❌      | ❌                      | Object jaruri hai                       |
// | `public` + `static`      | ✅      | ✅                      | Class name se access ho sakta hai       |
// | `private` + `static`     | ✅      | ❌ (outside class)      | Sirf class ke andar access ho sakta hai |
