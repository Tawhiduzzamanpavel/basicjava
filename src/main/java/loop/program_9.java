package loop;

import java.util.Scanner;
//Take a number as input from the user. Now write a program to show table of the given numbers
public class program_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number:");
        int number = scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number + "*" + i +"=" +(number*i));
        }
    }
}
