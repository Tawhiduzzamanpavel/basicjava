package datetime_function_array_hashmap;

import java.util.*;

//5. Create a hashmap that will store 2, 5, 10, 20, 50, 100, 200, 500, 1000 tk note and each time generate 3 notes randomly and show their summation.
//Output: 5 Tk, 50 Tk, 100 Tk. Total=155 Tk
public class program_5 {
    public static void main(String[] args) {
        HashMap<String, Integer> taka = new HashMap<>();
        taka.put("A", 2);
        taka.put("B", 5);
        taka.put("C", 10);
        taka.put("D", 20);
        taka.put("E", 50);
        taka.put("F", 100);
        taka.put("G", 200);
        taka.put("H", 500);
        taka.put("I", 1000);


        Set<String> keySet = taka.keySet();
        List<String> keyList = new ArrayList<>(keySet);

        int size = keyList.size();
        int randIdx1 = new Random().nextInt(size);
        int randIdx2 = new Random().nextInt(size);
        int randIdx3 = new Random().nextInt(size);

        String randomKey1 = keyList.get(randIdx1);
        String randomKey2 = keyList.get(randIdx2);
        String randomKey3 = keyList.get(randIdx3);
        Integer randomValue1 = taka.get(randomKey1);
        Integer randomValue2 = taka.get(randomKey2);
        Integer randomValue3 = taka.get(randomKey3);
        System.out.print(randomValue1 +"Tk, ");
        System.out.print(randomValue2 +"Tk, ");
        System.out.print(randomValue3 +"Tk ");
        System.out.print("Total=" + (randomValue1+randomValue2+randomValue3) +"Tk ");
    }

}
