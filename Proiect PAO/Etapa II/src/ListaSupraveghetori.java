import supraveghetori.Supraveghetor;

import java.io.IOException;
import java.util.ArrayList;

public class ListaSupraveghetori {

    private static ListaSupraveghetori INSTANCE;
    private ArrayList<Supraveghetor> Supraveghetori = new ArrayList();


    private ListaSupraveghetori() {
    }

    public static ListaSupraveghetori getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ListaSupraveghetori();
        }

        return INSTANCE;
    }

    public ArrayList<Supraveghetor> getSupraveghetori() {
        return Supraveghetori;
    }

    public Supraveghetor getSupraveghetori(String nume){
        for(int i=0;i<Supraveghetori.size();i++) {
            if(Supraveghetori.get(i).getNume().equals(nume))
                return Supraveghetori.get(i);
        }
        return null;

    }

    public void incarcaCSV() throws IOException {

        CsvIO read = CsvIO.getInstance();
        read.setPath("./src/files/supraveghetori.csv");
        ArrayList<String> buff;
        buff = read.readFile();

        for(int i=1;i<buff.size();i++){
            String[] x;
            x=buff.get(i).split(",");
            Supraveghetor supraveghetor = new Supraveghetor(x[0],x[1],x[2]);
            Supraveghetori.add(supraveghetor);
        }

    }

    public void descarcaCSV() throws IOException {

        CsvIO write = CsvIO.getInstance();
        write.setPath("./src/files/supraveghetori.csv");
        ArrayList <String> data = new ArrayList();
        String x = "nume,prenume,clasa";
        data.add(x);
        for(int i=0;i<Supraveghetori.size();i++){
            x = Supraveghetori.get(i).getNume()+','+Supraveghetori.get(i).getPrenume()+','+
                    Supraveghetori.get(i).getSala();
            data.add(x);
        }
        write.writeFile(data);

    }







}
