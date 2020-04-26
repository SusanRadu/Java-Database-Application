package streams;

import java.io.*;

public class ex2 {

    private static final String BASE_PATH = ".lab7/src/streams";

    public static void main(String[] args) {

        try (FileReader fr = new FileReader(BASE_PATH + "file1.txt")){
        FileWriter fw = new FileWriter(new File(BASE_PATH + "file2.txt"),true);
        }
        catch (IOException e) {
        e.printStackTrace();

        }
        }


}






