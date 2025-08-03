interface A 
{
    void show();
    default void config()                        // lekin java 8 mai ye feature aya ki hum interface mai method ko define kar sakte hai by "default" keyword
    {                                            //isse ye bhi hoga ki hum jis class mai ye interface implements kar rahe ho wha iss method define karne ki jarurat nhi hai 
        System.out.println("in config");      //aur bhi tarike se define kar sakte jaise default(non -static method), static methods in interface and functional interfaces
    }
    static void abc()
    {
        System.out.println("in abc");
    }
}

class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
}

public class Java8Fe {
    public static void main(String[] args) {
        A.abc();        //this call directly because it is static method
        A obj = new B();
        obj.config();
    }
}
