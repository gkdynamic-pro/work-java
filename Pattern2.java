public class Pattern2 {
    public static void main(String[] args) {
        int i, j; // aur yaha i , j ka data type humne pehele declare kardiya

        for (i = 0; i < 5; i++) // hum chahe toh i ka data type yaha bhi declare kar sakhte hai
        {
            for (j = 0; j < 5; j++) // hum chahe toh j ka data type yaha bhi declare kar sakhte hai
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}