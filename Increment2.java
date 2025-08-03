class Increment2
{
    public static void main(String[] args) {
        int a,b;
        a=5;
        b=a++; // yaha par 'b' ko 'a' ki updated value nhi milegi means non updated value
        System.out.println(b);
        System.out.println(a);

    }
}