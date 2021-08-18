package conditional_statement;

import java.util.Scanner;

//2.Write a program to calculate CGPA and find grade from 4 subjects (GPA will based upon your university)
public class program_5 {
    public static void main(String[] args) {


        double grade = 0,subject=0, totalgrade=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Marks of 4 Subjects");
        for (int i = 0; i < 4; i++) {

            subject = scanner.nextInt();
            if(subject>=80){
                grade=4.00; // A+
            }
            else if(subject>=75 && subject<80){
                grade=3.75; // A
            }
            else if(subject>=70 && subject<75){
                grade=3.50; // A-
            }
            else if(subject>=65 && subject<70){
                grade=3.25; // B+
            }
            else if(subject>=60 && subject<65){
                grade=3.00; // B
            }
            else if(subject>=55 && subject<60){
                grade=2.75; //B-
            }
            else if(subject>=50 && subject<55){
                grade=2.50; // C+
            }
            else if(subject>=45 && subject<50){
                grade=2.25; // C
            }
            else if(subject>=40 && subject<45){
                grade=2.00; // D
            }
            else if(subject<40){
                grade=0.00; // F
            }
            totalgrade += grade;

        }

        System.out.println("CGPA : "  + String.format("%.2f", totalgrade/4) );



    }
}
