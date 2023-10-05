package practice.practice01;

public class Practice02InterviewQuestion {
    public static void main(String[] args) {
        //Example1: Type code to swap two integers
        //          a= 12 and b=5  ==> a=5 and b= 12

        //1.way: by creating a third empty container
        int a=12;
        int b= 5;

        System.out.println("Before swapping :"+a + " " + b);
        int temp=0;

        temp=a;
        a=b;

        b=temp;
        System.out.println("After swapping :"+ a + " " + b);

        //2. way: do not create third variable

        int x=12;
        int y=5;
        System.out.println("before swapping " + x +" " + y);

        x=x+y; //12+5=17

        y= x-y; // 17-5 =12

        x= x-y;

        System.out.println("after swapping " + x +" " + y);





    }
}
