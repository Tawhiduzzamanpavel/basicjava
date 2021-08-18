package conditional_statement;

import java.util.Scanner;

public class program_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Please enter the second number:");
        int num2 = scanner.nextInt();
        System.out.println("Please enter the third number:");
        int num3 = scanner.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("Num1 is the greatest number");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Num2 is the greatest number");
        }
        else{
            System.out.println("Num3 is the greatest number");
        }


    }
}
