public class EnhanceForLoop1 {
    
    
    public static void main(String[] args)
    {
        int nums[][] = { {5,2,3,6}, {8,3}, {9,4,8} };
        for(int n[]:nums){
            for(int b:n){
                System.out.print(b + " ");  
                }
                System.out.println();
        }
   }
}
