package practice;

public class Practice01 {

    public static void main(String[] args) {

        //Initialize variable
        // data type - variable name- assignment operator - variable value - ;
             byte            age             =                      12      ;

             int             customerAge     = 35;
             double               weight     = 87.4;

        //Uninitialized variable;

        String name;

        //Print variables with label
        System.out.println("Age is = " + age); // Age is = 12
        System.out.println("Customer Age = " + customerAge); // Customer Age = 35
        System.out.println("Weight is = " + weight); //Weight is = 87.4

        //Copy the variable's value
        byte myAge=age;
        System.out.println("myAge = " + myAge);

        //Declare multiple variables in the same line

        int year=2023, day=28, month=9;

        //Update a variable
         month=12;

        System.out.println("month = " + month);

        //Declare a variable: x
        int x;
        //System.out.println("x = " + x); if we want to print an uninstantiated variable java gives error.

        //Initialize variable z;
        int z= 40;

        //Initialize x by using z;

        x=z;
        System.out.println("x = " + x);







    }


}
