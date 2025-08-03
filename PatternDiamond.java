public class PatternDiamond{
    public static void main(String[] args) {
        int n=15;
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==(n-1)/2||i-j==(n-1)/2||j-i==(n-1)/2||i+j==(n-1)/2+n-1){ //p1 and p4 point mai sum karke (n-1)/2 but p4 mai n-1 add karna hoga
                    System.out.print("*");                                    // p2,p3point mai difference karna hoga (n-1)/2 
                                                                                // p1, p2, p3 mai (n-1)/2 common haiclac
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }

}