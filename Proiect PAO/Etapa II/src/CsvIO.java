import java.io.*;
import java.util.ArrayList;
//clasa singleton cu ajutorul careia citim/scriem intr-un fisier csv
public final class CsvIO {

    private static CsvIO INSTANCE;
    private String path;

    private CsvIO() {
    }

    public static CsvIO getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new CsvIO();
        }

        return INSTANCE;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public  ArrayList<String> readFile() throws IOException {//metoda care citeste un fisier csv intr-o lista de stringuri

        Loggin.log("read");

        String row;

        ArrayList <String> data = new ArrayList();

        BufferedReader csvReader = new BufferedReader(new FileReader(path));
        while ((row = csvReader.readLine()) != null)
            data.add(row);

        csvReader.close();
        return data;
    }

    public void writeFile(ArrayList<String> list) throws IOException {//metoda care scrie o lista de stringuri intr-un csv

        Loggin.log("write");

        BufferedWriter csvWriter = new BufferedWriter(new FileWriter(path));

        for(String word: list) {
            csvWriter.write(word);
            csvWriter.newLine();
        }

        csvWriter.close();

    }


}
