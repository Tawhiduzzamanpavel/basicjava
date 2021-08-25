package datetime_function_array_hashmap;
//3. Write a program to show the duplicates values . Given array is: {10,5,2,3,2,7,7,15,10}
public class program_3 {
    public static void main(String[] args) {
        int [] num ={10,5,2,3,2,7,7,15,10};
        int dup =num[0];
        Duplicate(num);
    }
    public static void Duplicate(int[] num){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    System.out.println(num[j]);
                }

            }


        }
    }
}
