package practice.practice02;

import java.util.Scanner;

public class P01_SwitchCase {

    public static void main(String[] args) {

        //Ask user to enter a character, if it is 'Vowel', if it is not a vowel print "Not vowel"

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a letter to check if it is a vowel or not...");

        char c= input.next().toLowerCase().charAt(0);

        switch (c){

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
            break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'y':
            case 'w':
            case 'x':
            case 'z':
                System.out.println("Not vowel");
                break;
            default:
                System.out.println("Enter a letter not other characters...");
        }



    }
}
