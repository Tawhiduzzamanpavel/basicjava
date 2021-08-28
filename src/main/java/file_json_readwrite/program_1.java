package file_json_readwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class program_1 {
    public static void main(String[] args) throws IOException {
        write();
        read();;

    }
    public static void write() throws IOException {

        FileWriter fw = new FileWriter("myfile.txt",true);
        fw.write("abcd");
        fw.close();
    }
    public static void read() throws IOException {
        FileReader rd = new FileReader("myfile.txt");
        int chr;
        while((chr=rd.read())!= -1){
            System.out.println((char) chr);
        }
        rd.close();
    }

}
