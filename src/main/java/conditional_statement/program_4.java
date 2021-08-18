package conditional_statement;

import java.util.Scanner;

public class program_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter:");
        char letter = scanner.next().charAt(0);
        if( letter>='A' && letter<='Z'){
            System.out.println("This is a capital Letter");
        }
        else if (letter>='a' && letter<='z'){
            System.out.println("This is a small Letter");
        }
        else {
            System.out.println("Please input a valid letter");
        }
    }
}
