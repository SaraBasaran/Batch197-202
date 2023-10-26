package ssg_switchcase;

import java.util.Scanner;

public class Ternary_01 {
    public static void main(String[] args) {

          /*Type java code by using ternary.
            Write a program to print absolute value of an integer entered by user.*/

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a number to calculate its absolute value");

        int num= input.nextInt();

       int output= num<0 ? num*-1 : num;

        System.out.println("output = " + output);



    }

    public static class ssgstring {
        public static void main(String[] args) {


            String s = "Marra";

            for(int i = s.length()-1; i >= 0 ; i--){

                String c = s.substring(i, i+1);

                if(s.indexOf(c)==s.lastIndexOf(c)){

                    System.out.println(c);

                }

            }

            int i=1;

            do{
                if(i!=3){
                    System.out.print(i + " ");

                } else {
                    i++;
                    continue;

                }
                i++;

            }while(i<5);

        }
    }
}
