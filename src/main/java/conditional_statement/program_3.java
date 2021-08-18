package conditional_statement;
//1. Write a program that takes a year from user and print whether that year is a leap year or not

import java.util.Scanner;

public class program_3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please Input a valid Year:");
        int year = scanner.nextInt();

        if(year % 4 ==0){
            if(year % 100==0){
                if(year % 400==0){
                    System.out.println("This year is Leap year");
                }
                else{
                    System.out.println("This year is Not Leap year");
                }
            }
            else {
                System.out.println("This year is Leap year");
            }

        }
        else {
            System.out.println("This year is Not Leap year");
        }

    }
}
