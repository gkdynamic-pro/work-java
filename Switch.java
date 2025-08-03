public class Switch
{
    public static void main(String[] args) 
    {
        int num=200;

        switch(num) // agar break keyword nhi lagayenge toh jiski case ki condition satisfy  hui hai wo aur uske
                    // niche wale saare case execute ho jayenge
        {
            case 200: System.out.println("case1");
            break;
            case 300: System.out.println("case2");
            break;
            case 100: System.out.println("case3");
            break;
            default: System.out.println("default"); 


        }
    }
}