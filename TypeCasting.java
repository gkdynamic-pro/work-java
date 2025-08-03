class TypeCasting //it is use to convert the one datatype to another datatype and if it is automatic with the help of compiler then it is called implicit typecasting
{
    public static void main(String[] args)
    {
         int a=45;
         double b;
         b=a;
         System.out.println(b);

        double num1=45.5;
        int num2;             // it is explicitly typecasting 
        num2=(int)num1; // truncated
        System.out.println(num2);

        int n1=12;
        int n2=5;
        float result=n1/n2;         //truncated value means we get only integer type of value
        System.out.println(result);
        
    }
}