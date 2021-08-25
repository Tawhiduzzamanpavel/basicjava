package datetime_function_array_hashmap;

import java.util.Scanner;

//4. Write a program to find the position of a matched value from an array. If not matched, return -1 using function.
//Given array is: {10,5,2,3,2,7,7,15,10}
//Input: User inputs 7
//Output: Position: 5
public class program_4 {
    public static void main(String[] args) {
        int [] num ={10,5,2,3,2,7,7,15,10};
        System.out.println("Enter a value:");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        System.out.println(findIndex(num,j));
    }

    private static int findIndex(int[] num, int j) {
        int len = num.length;
        int i = 0;

      while (i < len) {

            // if the i-th element is t
            // then return the index
            if (num[i] == j) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
}
