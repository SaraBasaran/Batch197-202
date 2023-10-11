package ssg_switchcase;

import java.util.Scanner;

public class Ternary_02 {

      /*
         if the gender input is male --> check if the year value is over or equal to
                                               65 than print "Retired" on the console, if not print "Not Retired"
         if the gender input is female --> check if year value is over 60 than print "Retired" on the console,
                                               if not print "Not Retired"
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your gender");
        String gender= input.next();

        System.out.println("Enter your age");
        int age= input.nextInt();

       String isRetired= (gender.equalsIgnoreCase("male")) ? (age>=65 ? ("Retired"): ("Not Retired"))
                                                                      : (age>=60 ? ("Retired"): ("Not Retired"));

        System.out.println(isRetired);


    }



}
