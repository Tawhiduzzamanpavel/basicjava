package while_dowhile_string;
//3. Write a program to make a digital tasbih where the program counts each time user press enter until press 0
import java.util.Scanner;

public class program_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enterinput = scanner.nextLine();
        int count =1;

        while(enterinput!="0") {

            if (enterinput.isEmpty()) {
                System.out.println(count);
                count++;

            }

            if (scanner.hasNextLine()) {
                enterinput = scanner.nextLine();
            }
            else {
                enterinput = null;

            }
        }

    }
}
