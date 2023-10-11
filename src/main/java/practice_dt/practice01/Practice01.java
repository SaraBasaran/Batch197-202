package practice_dt.practice01;

public class Practice01 {

    public static void main(String[] args) {

        //Initialize variable
        // data type - variable name - assignment operator - value - ;
              int          age                 =   12   ;
              byte        customerAge          = 35     ;
              double       weight              = 87.5   ;

        //Uninitialized variable;

       String name;
       String stuName= "Tom";
        System.out.println("stuName = " + stuName);

        //Print variables with label

        System.out.println("Age is: " + age); //Age is: 12
        System.out.println("Customer age: " + customerAge); //Customer age: 35
        //System.out.println("name = " + name); --> Java gives error if we do not instance the variable

        System.out.println("Weight is: " + weight);

        //Copy the variable's value
        byte myAge=(byte) age;
        System.out.println("myAge = " + myAge);

        double age3= age;
        System.out.println("age3 = " + age3);

        //Declare multiple variables in the same line
        short year=2023, month=9, day=28;

        //Update a variable
        month=12;
        System.out.println(month);

        //Declare a variable: x
        int x;

        //Initialize variable z;
        int z = 40;

        //Initialize x by using z;

        x = z;

        System.out.println(x);


    }
}
