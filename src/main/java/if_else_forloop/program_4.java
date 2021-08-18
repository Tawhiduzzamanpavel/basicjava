package if_else_forloop;

import java.util.Scanner;

//4. Write a program to check balance and withdraw money from ATM booth using switch case and if else (1. Check balance 2. Withdraw Money)
//Notes:
//1. If user inputs wrong PIN more than 3 times, following error should be shown: "You have entered wrong PIN more than 3 times. Card has blocked." and takes the valid PIN again
//2. If user inputs an amount that is not divisible by 500, then system should throw an error message as "Balance is not divisible by 500. Please try with another amount" and takes the valid input again
//3. If user inputs more than balance, then system should throw an error message as "Not enough balance. Please input valid amount" and takes the valid input again
public class program_4 {
    public static void main(String[] args) {
        String New;
        System.out.println("1.Check balance");
        System.out.println("2.Withdraw balance");
        int a;
        int b=123456;
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        switch(a){
            case 1:
                System.out.println("Enter your pin");
                int c =scanner.nextInt();
                if(c==b){
                    System.out.println("Your Balance is 4000.00 Tk");
                }
                else{
                    System.out.println("Wrong Pin Inserted, Please try again");
                    for(int i=1;i<4;i++){
                        c =scanner.nextInt();
                        if(c!=b){
                            System.out.println("Wrong Pin Inserted, Please try again");
                            if(i==3){
                                System.out.println("You have inserted wrong pin more then 3 times. Your card is blocked");
                            }
                        }
                        else if(c==b){
                            System.out.println("Your Balance is 4000.00 Tk");
                            break;
                        }



                    }
                }
                break;
            case 2 :

                boolean flag=true;
                System.out.println("Enter your pin");

                int d =scanner.nextInt();
                if(d==b){
                    System.out.println("Input amount that is multiply by 500");
                    int amount = scanner.nextInt();
                    if(amount%500==0){
                        if(amount<=4000){
                            System.out.println("Withdraw Successful. Your Current balance is "+ (4000-amount)+ " Tk");
                        }
                        if(amount>4000){
                            System.out.println("Not enough balance. Please input valid amount.");

                        }
                    }
                    else{

                        System.out.println("Balance Is not multiply by 500. Please try another amount. ");


                    }
                }
                else{
                    System.out.println("Wrong Pin Inserted, Please try again");
                    for(int i=1;i<4;i++){
                        c =scanner.nextInt();
                        if(c!=b){
                            System.out.println("Wrong Pin Inserted, Please try again");
                            if(i==3){
                                System.out.println("You have inserted wrong pin more then 3 times. Your card is blocked");
                            }
                        }
                        else if(c==b){
                            System.out.println("Input amount that is multiply by 500");
                            int amount = scanner.nextInt();
                            if(amount%500==0){
                                if(amount<=4000){
                                    System.out.println("Withdraw Successful. Your Current balance is "+ (4000-amount)+ " Tk");
                                    break;
                                }
                                if(amount>4000){
                                    System.out.println("Not enough balance. Please input valid amount.");

                                }
                            }
                            else{

                                System.out.println("Input amount that is multiply by 500.");

                                if(amount%500==0){
                                    if(amount<=4000){
                                        System.out.println("Withdraw Successful. Your Current balance is "+ (4000-amount)+ " Tk");
                                        break;
                                    }

                                    if(amount>4000){
                                        System.out.println("Not enough balance. Please input valid amount.");

                                    }
                                }
                            }

                        }



                    }
                }
                break;
        }

    }
}
