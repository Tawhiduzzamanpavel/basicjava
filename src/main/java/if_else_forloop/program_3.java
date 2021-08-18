package if_else_forloop;

import java.util.Scanner;

//3. Create a math quiz program. Scenario: 2 numbers will generate randomly and prompt user to input the summation of 2 numbers. If user inputs the correct summation, print "Answer is correct" and user will get 1 point. if user inputs wrong summation,  then user will get 0 point. Finally after 5 iteration, total score will be shown
public class program_3 {
    public static void main(String[] args) {
        int max=100;
        int min =10;
        double point = 0;


        for(int i=1;i<6;i++){
            int a =(int) (Math.random()*(max-min)+min) ;
            int b= (int) (Math.random()*(max-min)+min) ;
            Scanner scanner = new Scanner(System.in);
            System.out.println(i+".What is the sum of "+ a + " and " + b + "?");
            int answer = scanner.nextInt();
            if((a+b)== answer){
                point +=1;
                System.out.println("Correct Answer ");
            }
            else{

                System.out.println("Wrong Answer");
            }


        }

        System.out.println("\nQuiz End.\nYour Total score is "+ (int)point + " out of 5.");

    }
}
