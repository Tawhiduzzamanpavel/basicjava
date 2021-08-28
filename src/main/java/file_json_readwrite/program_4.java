package file_json_readwrite;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class program_4 {
    public static void main(String[] args) {

    }
    public static void pin() throws IOException, ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin");
        int c =scanner.nextInt();
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader("atm.json"));
        JSONObject jsobj = (JSONObject) obj;
        long b= (long) jsobj.get("pin");
    }
}
