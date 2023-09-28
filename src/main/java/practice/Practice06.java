package practice;

import java.util.Scanner;

public class Practice06 {

    public static void main(String[] args) {

        //Example: Ask user to enter his name and get the initial of a name which contains first name and last name
        //         Tom Hanks ==> TH

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your first name and last name...");

        //input.next(); --> gives the first value part up to the first space for ex: Tom Hanks --> Tom
        // input.nextLine(); --> gives the whole value with spaces for ex: Tom Hanks --> Tom Hanks

        String fullName= input.nextLine(); //Tom Hanks

        char firstChar=fullName.charAt(0); // Tom Hanks --> index value starts from zero

        char lastNameFirstChar= fullName.split(" ")[1].charAt(0);

        System.out.println(firstChar + " "+ lastNameFirstChar);




    }
}
