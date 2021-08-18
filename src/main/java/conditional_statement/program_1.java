package conditional_statement;

import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to check positive or negative:");
        int num = scanner.nextInt();

            if(num >=0){
                System.out.println("Positive number");
            }
            else if(num<0){
                System.out.println("Negative number");
            }

    }
}
