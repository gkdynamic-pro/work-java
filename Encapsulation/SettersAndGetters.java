class Student 
{
 private int age;  //instance variable
 private String name;


public int getAge() {   //for feteching value or value laake do
    return age;
}

 public void setAge(int age) {      //nya value set karo
    this.age = age;                 //Setter ka use object ke private data ko baad mein value assign karne (yaani later stage par initialize karne) 
 }                                  //aur update karne ke liye hota hai

 public String getName() {
    return name;
 }

 public void setName(String name) {
    this.name = name;
 }

}

public class SettersAndGetters {

    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();

        obj.setAge(18);
        obj1.setAge(25);
        obj.setName("Gourav");
        obj1.setName("kushwaha");
        int stud1Age = obj.getAge();
        String stud1Name = obj.getName();
        System.out.println(stud1Age);
        System.out.println(stud1Name);

      
    } 

}
//Setter ka use object ke private data ko baad mein value assign karne (yaani later stage par initialize karne) aur update karne ke liye hota hai
//jabki Constructor ka use object ke private data ko object banate samay (initial stage par) initialize karne ke liye hota hai