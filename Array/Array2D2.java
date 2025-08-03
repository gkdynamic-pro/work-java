public class Array2D2{
    public static void main(String[] args) {
         // int nums[][] = new int[3][];
        // nums[0] = new int[4];
        // nums[1] = new int[2]; //jagged array from this approach M-1
        // nums[2] = new int[3];
        // nums[0][0] = 5;
        // nums[0][1] = 2;
        // nums[1][0] = 8;
        // nums[1][1] = 3;
        // nums[2][0] = 9;
        // nums[2][1] = 4;
                                                      //M-2 approach
        int nums[][] = { {5,2,3,6}, {8,3}, {9,4,8} }; // it is called as jagged array jaha par number of rows fix par number of coloum fix nhi hai

        for( int i=0; i<=2; i++){
            for( int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }

            System.out.println();
        }
    }
}