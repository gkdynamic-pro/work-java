class Student
{
 
    private String name;
    private int age;  //instance variable
 
 Student(String name, int age )   //Constructor//
 {                                //Constructor ka use object ke private data ko object banate samay (initial stage par) initialize karne ke liye hota hai
   this.name = name;              //or isse aise bhi keh sakte hai ki constructor ek specialize setter method hai jo same class name with no return type  
   this.age = age;                // during object creation constructor call hota hai 

 }
    
//  public void setName(String name) {     //Setter ka use object ke private data ko baad mein value assign karne (yaani later stage par initialize karne)
//     this.name = name;                   // aur update karne ke liye hota hai
//  }

// public void setAge(int age) {      //nya value set karo
//     this.age = age;
//  }

 public String getName() {
    return name;
 }

public int getAge() {   //for feteching value or value laake do
    return age;
}

}

public class Launch1 {

    public static void main(String[] args) {
        
        Student st = new Student("Rahul", 10);   // Constructor se object ke variables ko initial value di gayi or // Constructor se initialize kiya
                                                          // during object creation constructor call hota hai 
        String name = st.getName();
        int age = st.getAge();
        System.out.println(name);
        System.out.println(age);
            
    } 

}