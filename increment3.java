class increment3
{
    public static void main(String[] args) 
    {
        int a,b;
        a=5;
        b=a++ + ++a + --a;
        System.out.println(a);
        System.out.println(b);
    }
}