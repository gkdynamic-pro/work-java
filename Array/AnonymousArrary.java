class Calc // Method overloading
{
	public int add( int nums[])
    {
        int result = 0;
        for(int n : nums){
            result = result + n;
        }
           return result;
        }
        
    }

public class AnonymousArrary   {
public static void main(String[] agrs){

	Calc obj = new Calc();

        int result = obj.add(new int[]{5, 3, 4, 7}); //anonymous array use only on one time only 
        System.out.println(result);
      
	}
}