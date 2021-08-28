package file_json_readwrite;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class program_2 {
    public static void main(String[] args) throws IOException, ParseException {
        //writeJson();
        readJSON();

    }
    public static void writeJson() throws IOException {
        JSONObject jsobj = new JSONObject();
        jsobj.put("name","Pavel");
        jsobj.put("dept","CSE");
        jsobj.put("desegnation","Student");
        JSONObject add = new JSONObject();
        add.put("area","ZakirHossainRoad");
        add.put("po","Mohd");
        add.put("city","Dhaka");
        jsobj.put("address",add);
        System.out.println(jsobj);

        FileWriter fw = new FileWriter("myfile.json");
        fw.write(jsobj.toJSONString());
        fw.flush();
        fw.close();

    }
    public static void readJSON() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader("myfile.json"));
        JSONObject jsobj = (JSONObject) obj;

        System.out.println(jsobj);
        String name = (String) jsobj.get("name");
        System.out.println(name);
        String department = (String) jsobj.get("dept");
        System.out.println(department);
        String designation = (String) jsobj.get("desegnation");
        System.out.println(designation);

        JSONObject addressObj = (JSONObject) jsobj.get("address");
        String area=(String) addressObj.get("area");
        System.out.println(area);
        String po=(String) addressObj.get("po");
        System.out.println(po);
        String city=(String) addressObj.get("city");
        System.out.println(city);


    }

}
