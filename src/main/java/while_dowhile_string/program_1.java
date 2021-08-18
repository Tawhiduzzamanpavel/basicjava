package while_dowhile_string;

import java.util.Scanner;

//1. Write a program to sum of digits of a number by taking from user input
public class program_1 {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum =0;
        while(num!=0){

            int rem = num%10;
            num = num/10;
            sum +=rem;
        }
        System.out.print(sum);
    }
}
