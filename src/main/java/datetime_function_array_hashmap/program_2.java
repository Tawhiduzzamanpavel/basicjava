package datetime_function_array_hashmap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//2. Find the second largest number from an array by user input using function
public class program_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Declare the array size:");
        int size = scanner.nextInt();
        System.out.println("Enter the Numbers:");
        int num [] =new int[size];
        for(int i=0;i<size;i++){
            num[i]=scanner.nextInt();
        }

        Sort(num,size);
        System.out.println(num[size-2]);


    }
    public static void Sort(int[] num, int size){
        int a = num.length;
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){

        }




    }



}
