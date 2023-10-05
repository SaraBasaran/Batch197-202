package practice.practice01;

public class Practice05_CalculationOfHypotenus {

    public static void main(String[] args) {

        //Type a code that calculates the hypotenuse.
        //Formula of hypotenuse: a²+b²=c²
        //a*a

        double a = 12;

        double b= 5;

        //If there is readily created methods, best practice is ot use those methods.

        double c= Math.sqrt(a*a+b*b);

        System.out.println("Hypotenuse is: " + c);




    }

}
