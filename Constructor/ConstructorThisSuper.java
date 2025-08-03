class Student1 {

private int age;
private String name;

public Student1()
{
    //super();
    this("Rohit", 19);
    System.out.println("Default Constructor is called");  
    age=18;
    name="Gourav";
}

public Student1(String name)
{
    this(); 
    this.name=name;
    age=19;

}

public Student1(String name, int age)
{

    this.name=name;
    this.age=age;
}

public void disp(){

     System.out.println(name);
     System.out.println(age);
}


}


public class ConstructorThisSuper {

    public static void main(String[] args) {

        Student1 st1 = new Student1();
        st1.disp();

        Student1 st2 = new Student1("Raju");
        st2.disp();

        Student1 st3 = new Student1( "Sanju", 19);
        st3.disp();   
        
    }
    
}
