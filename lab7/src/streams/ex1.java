package streams;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ex1 {

    private static final String BASE_PATH = ".lab7/src/streams";

    public static void main(String[] args) {

        System.out.println(System.getProperty("file.separator"));
        System.out.println(File.separator);


        File dir1 = new File(BASE_PATH, "/dir");
        System.out.println(dir1.mkdir());

        File dir2 = new File(BASE_PATH, "/a/b/c/dir2");
        System.out.println(dir2.mkdirs());

        File file1 = new File(BASE_PATH,"file1.txt");


        try {
            if (file1.createNewFile()){
                System.out.println(("File created"));
            }
            else {
                System.out.println(file1.exists());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        file1.getAbsoluteFile();
        file1.getName();
        file1.length();


        File f1 = new File(".lab7/src");
        System.out.println(Arrays.toString(f1.listFiles()));


    }


    }






