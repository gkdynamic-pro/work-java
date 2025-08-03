

class Demo1
{
    int a, b;
    
    public Demo1()
    {
        System.out.println("Parent class Constructor");
    }
    public Demo1(int x, int y)
    {
        System.out.println("parameterized Parent  class Constructor");
        a=x;
        b=y;
    }
}                                  //constructor chaining
class Demo2 extends Demo1         
{
    int m,n;
    public Demo2()
    {

        //super(10,20);    //super(10,20); agar ye bina parameter ke execute ho raha hai toh so it call parent class default constructor aur agar parameter ke sath call ho raha hai so it will call parent class parameterized constructor
        this(10,20);   //agar this method  likh diya toh super method include nhi hoga ab aur this method  execute same class constructor  
                           //aur this method abhi same class ka aisa constructor karega jo parameterized ho kyoki this method mai parameter hai  
                           //fir this ke niche wo execute hoga      
        System.out.println("Child class Constructor");
    }

    public Demo2(int x, int y)
    {
        //super();
        System.out.println("parameterized child class Constructor");
        m=x;
        n=y;
    }
}
public class ConstructorExe 
{
    public static void main(String[] args) 
    {
        
        Demo2 d=new Demo2();

       // Demo2 d2=new Demo2(10,20);
    }
    
}
