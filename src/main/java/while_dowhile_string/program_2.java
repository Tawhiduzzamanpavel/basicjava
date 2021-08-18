package while_dowhile_string;

import java.util.Scanner;

//2. Write a program to show range of prime numbers from 2 to n using while loop [n is the number by user input]
public class program_2 {
    public static void main(String[] args) {
        int i;

        System.out.println("Enter a number : ");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int j=2;
        while(j<=number)
        {
            int count=0;
            i=1;
            while(i<=j)
            {
                if(j%i==0)
                {
                    count++;
                }
                i++;
            }
            if(count==2)
                System.out.println(j+"");
            j++;
        }
    }
}
