package baisc;

import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {


        //---------------------1-----------------------
        System.out.println("Ans to the Question No 1");
        String name ="Tawhid";
        String uname = "CUET";
        System.out.println("Hello,I am " + name +"."+ "I passed from "+ uname + ".");


        //---------------------2-----------------------
        System.out.println("Ans to the Question No 2");
        double a1 = 15;
        int b1 = (int) a1;
        System.out.println(b1);

       //---------------------3-----------------------
        System.out.println("Ans to the Question No 3");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Input the second number:");
        int num2= scanner.nextInt();
        System.out.println("Input the third number:");
        int num3= scanner.nextInt();
        int sum=num1+num2+num3;
        System.out.println("Sum="+sum);
        float avg=((float) num1+(float)num2+(float)num3)/3;
        System.out.println("Average="+ avg);


        //---------------------4-----------------------
        System.out.println("Ans to the Question No 4");

        Scanner random =new Scanner(System.in);
        System.out.println("Enter the max value:");
        int max= random.nextInt();
        System.out.println("Enter the min value:");
        int min= random.nextInt();
        System.out.println("Random Number="+ (int) Math.random()*(max-min)+min);


        //---------------------5-----------------------
        System.out.println("Ans to the Question No 5");
        Scanner square  = new Scanner(System.in);
        System.out.println("Enter a:");
        int a=square.nextInt();
        System.out.println("Enter b:");
        int b=square.nextInt();
        int result =a*a+2*a*b+b*b;
        System.out.println("(a+b)^2="+ result);



    }
}
