package practice.practice02;

import java.util.Scanner;

public class Q02_IfStatement {

    public static void main(String[] args) {

          /*
           Ask user to enter his age, then print his situation according to the given table
           0-4==>Baby  5-12==>Kid  13-20==>Young   21-30==>Adult  31-?==>Undefined
        */

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your age...");
        byte age= input.nextByte();

       if (age<0){
           System.out.println("Negative numbers can not be age values...");
       }else if ( age<5 ){
           System.out.println("Baby");
       }else if (age <13){
           System.out.println("Kid");
       }else if (age <21){
           System.out.println("Young");
       }else if (age <31){
           System.out.println("Adult");
       }else{
           System.out.println("Undefined...");
       }









    }



}
