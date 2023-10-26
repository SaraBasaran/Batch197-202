package practice_dt.practice04;

public class Q01_Varargs {

    public static void main(String[] args) {
        //Type a method that accepts a variable number of integers as arguments and sums them

        // acc mod static int multiply(int a, int b) {
        //   action part--> return a*b;
        //  }

        System.out.println(sum(15,3, 2,5));
        System.out.println(sum(45, 35));//80
        System.out.println(sum(45, 35, 700, 1234, 567, 456, 678));

    }

    public static int sum(int ... numbers){

        int sum=0;

        for ( int w :numbers) {

          sum= sum + w;

        }

        return sum;
    }





}
