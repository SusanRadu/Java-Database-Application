import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
//serviciu de retinere a logurilor pentru read/write pe fisierele csv
public class Loggin{


    public static void log(String actiune) throws IOException {

        Date timeStamp = new Date();
        String text ="\n" + actiune+','+timeStamp;
        File file = new File("./src/files/logs.csv");
        FileWriter fr = new FileWriter(file,true);
        fr.write(text);

        fr.close();

    }



}
