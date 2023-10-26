package practice.practice04;

public class Q01_VarArgs {
    public static void main(String[] args) {

        System.out.println("The sum is: "+sum(1,2,3,4,5));//15
        System.out.println(sum(45,54,789));//888


    }
    //Type a method that accepts a variable number of integers as arguments and sums them
    // 1-access mod  2-static 3-return type 4-method name 5- parenthesis(parameters if there is any) 6-method body--> curly braces

    public static int sum(int ... numbers){

        int sum=0;

        for (int number: numbers) {

                 sum = sum + number; // sum+ = number;

        }
        return sum;
    }


}
