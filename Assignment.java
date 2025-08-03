class Assignment
{
    public static void main(String[] args) {
        int m1,m2,m3,m4;
        m1=m2=m3=m4=10;
        System.out.println(m1 + " " + m2 + " " + m3 + " " + m4);
        
        int a=10; // Compound Assignment : kisi variable ki existing value ko update karna
        a +=5; //yaha par "a" existing value ke sath 5 add ho jayega aur "a" ki value 15 ho jayegi
        System.out.println(a);

        int b=10;
        b -=5; //yaha par "b" existing value ke sath 5 substract ho jayega aur "b" ki value 5 ho jayegi
        System.out.println(b);

        int c=10;
        c /=5;
        System.out.println(c);

        int d=10;
        d *=5;
        System.out.println(d);
    }
}