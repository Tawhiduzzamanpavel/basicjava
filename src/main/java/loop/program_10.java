package loop;

import java.util.Scanner;
//6. Write a program to print prime numbers from 2 to n [n is a number that will be taken from user input
public class program_10 {
    public static void main(String arg[])
    {
        int i;

        System.out.println("Enter a number : ");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for(int j=2;j<=number;j++)
        {
            int count=0;
            for(i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
            if(count==2)
                System.out.println(j+"");
        }
    }
}
