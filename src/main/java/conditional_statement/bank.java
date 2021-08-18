package conditional_statement;

import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        System.out.println("1. Check balance ");
        System.out.println("2. Withdraw Money");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        int pin = 1234;
        switch (option) {
            case 1:
                System.out.println("Please enter your pin");
                int password = scanner.nextInt();
                if (password == pin) {
                    System.out.println("Your Balance is 4000.00 Tk");
                } else {
                    System.out.println("Your have entered wrong pin, please try again.");
                    for (int i = 1; i < 40; i++) {

                        password = scanner.nextInt();
                        if (password == pin) {
                            System.out.println("Your Balance is 4000.00 Tk");
                            break;
                        } else {
                            if (i%3==0) {

                                System.out.println("You have entered wrong PIN more than 3 times. Your card has blocked.");
                                System.out.println("Please enter your pin");

                            } else {
                                System.out.println("Your have entered wrong pin, please try again.");
                            }

                        }
                    }

                }
        }
    }
}
