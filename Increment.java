class Increment
{
    public static void main(String[] args) {
        int a=5;
        a++;  //a=a+1; iska matlab a ki existing value ko ek number se badana means 5 to 6 ho jayegi yaha
       
       // important baat hai ki ++a (pre-increment) ya a++ (post increment) ho agar same variable hai toh ye dono equivalent hote hai 
      // lekin agar ye dusre variable mai  assign karte hai toh ye alag tarike se kaam karte hai
     
        
        System.out.println(a);
    }
}