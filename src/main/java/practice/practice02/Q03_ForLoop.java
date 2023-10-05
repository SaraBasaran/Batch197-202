package practice.practice02;

public class Q03_ForLoop {

    public static void main(String[] args) {

        //Example : Do not type the lower case letters given in a String
        // Password: Pwd?123Ab;

        String str= "Pwd?123Ab";

        for (int i= 0;   i<str.length();              i++){

           char ch= str.charAt(i);

           if (ch>= 'a' && ch<='z'){

               continue;

           }else{
               System.out.print(ch);
           }

        }






    }
}
