class WhileLoop
{
    public static void main(String[] args) {     //While loop jab tak ki (as long as long ) phele condition check karta hai 
        int i=0;                                 //aur fir update
        while(i<5){
            System.out.println("task within while loop");
            i++;
        }

        int j=0;            //Do While loop ek bar phele execute hota aur fir update and then fir condition checks   
        do { 
            System.out.println("*");
            j++;
        }while(j<5);
    }
}
    