class Student {

private int age;
private String name;

public Student(){

    age=18;
    name="Gourav";
}

public Student(String name){
 this.name=name;
 age=19;

}

public Student(String name, int age){

    this.name=name;
    this.age=age;
}

public void disp(){

     System.out.println(name);
     System.out.println(age);
}


}


public class ConstructorOverloding {

    public static void main(String[] args) {

        Student st1 = new Student();
        st1.disp();

        Student st2 = new Student("Raju");
        st2.disp();

        Student st3 = new Student( "Sanju", 19);
        st3.disp();   
        
    }
    
}
