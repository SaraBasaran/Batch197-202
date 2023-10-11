package practice_dt.practice01;

import java.util.Scanner;

public class Practice06_ScannerClass_GettingInitials {
    public static void main(String[] args) {

        //Example: Ask user to enter his name and get the initial of a name which contains first name and last name
        //         Tom Hanks ==> TH

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your firstname and last name...");

        String fullname= input.nextLine();



       char firstChar= fullname.charAt(0); // T

       char lastnameFirstChar= fullname.split(" ")[1].charAt(0);

        System.out.println(firstChar+ " " + lastnameFirstChar);





    }


}
