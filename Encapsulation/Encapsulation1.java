class Student 
{
 public int age;        
 public String name;
 public void show()     // Yeh user-defined method hai
 {
     System.out.println(name + " "+ age);
 }
    
}

public class Encapsulation1 {  //Basically agar hume Encapsulation1 ke andar kisi bhi member ko call karna hai jo Student class mai hai 
                               //toh hume object ka use karna padega aur dhyan rahe static ka alag concept hai
                               // yahan hum Student class ke non-static members ko object ke through access kar rahe hain
                               // aur Encapsulation1 hai  wo Student ke liye outside world hai
    public static void main(String[] args) {
        Student obj = new Student();
        obj.age = 18;  //yaha par hum value change kar rahe hai agar ye  obj.age = 18; 18 nhi likhe toh default value milegi /✅ public member direct access  kar sakte
        obj.name = "rahul"; //same yaha pe bhi /✅ public member direct access kar sakte
        obj.show();
    } 

}




// | Concept           | Explanation                                     |
// | ----------------- | ----------------------------------------------- |
// | Non-static member | Object-specific hota hai                        |
// | Life start        | Jab object banega (`new Student()`)             |
// | Life end          | Jab object destroy ho jaye / memory se hat jaye |
// | Memory location   | Heap memory                                     |
