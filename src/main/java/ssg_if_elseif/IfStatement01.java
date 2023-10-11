package ssg_if_elseif;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //conditional statements can be typed by using if statements
        //Ask user to enter his/her gender and age and return for "male" return boy/man (age is less than 13 you should give boy
        //for "female" girl/woman as an output on the console

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your gender please");
        String gender= input.next().toLowerCase();
        System.out.println("Enter your age please");
                byte age= input.nextByte();

        if (gender.equals("male")){
           if (age<13){
               System.out.println("Boy");
           }else{
               System.out.println("Man");
           }
        }else if (gender.equals("female")){

            if (age<13){
                System.out.println("Girl");
            }else{
                System.out.println("Woman");
            }

        }else{
            System.out.println("Enter male or female not the oher characters");

        }









    }

}
