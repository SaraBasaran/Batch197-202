package practice;

import java.util.Scanner;

public class Practice04_ScannerClass {


    /*
    Ask user to enter the width, length and the height of a rectangular prism then find the volume.
    Volume = width * length * height
     */
    public static void main(String[] args) {

        //create a Scanner class object
        Scanner input= new Scanner(System.in);

        //Give message to the user
        System.out.println("Enter the width value"); // 5.5

        //Create a proper container for the input

        double width= input.nextDouble();

        System.out.println("Enter the length value"); // 12.4

        double length= input.nextDouble();

        System.out.println("Enter the height value"); // 8.7

        double height= input.nextDouble();

        System.out.println("The volume of rectangular prism is: " + width*length*height);






    }

}
