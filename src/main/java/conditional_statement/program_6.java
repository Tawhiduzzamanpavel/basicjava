package conditional_statement;

import java.util.Scanner;

public class program_6 {
    public static void main(String[] args) {
        String _username = "Tawhid";
        String _password = "123456";

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Enter your username");
        String username= scanner.next();
        System.out.println("Please Enter your password");
        String password= scanner.next();

        if(username.equals(_username)  && password.equals(_password) ){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Login Failed, Please enter valid userid and password");
        }
    }
    }
