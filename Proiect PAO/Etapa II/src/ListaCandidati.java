import candidat.Candidat;
import java.io.IOException;
import java.util.ArrayList;

public class ListaCandidati {

    private static ListaCandidati INSTANCE;
    private ArrayList<Candidat> Candidati = new ArrayList();


    private ListaCandidati() {
    }

    public static ListaCandidati getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ListaCandidati();
        }

        return INSTANCE;
    }

    public void incarcaCSV() throws IOException {

        CsvIO read = CsvIO.getInstance();
        read.setPath("./src/files/candidati.csv");
        ArrayList<String> buff;
        buff = read.readFile();

        for(int i=1;i<buff.size();i++){
            String[] x;
            x=buff.get(i).split(",");
            Candidat candidat = new Candidat(x[0],x[1],x[2],x[3]);
            Candidati.add(candidat);
        }

    }

    public void descarcaCSV() throws IOException {

        CsvIO write = CsvIO.getInstance();
        write.setPath("./src/files/candidati.csv");
        ArrayList <String> data = new ArrayList();
        String x = "CNP,nume,prenume,liceu";
        data.add(x);
        for(int i=0;i<Candidati.size();i++){
            x = Candidati.get(i).getCNP()+','+Candidati.get(i).getNume()+','+Candidati.get(i).getPrenume()+','+Candidati.get(i).getLiceu();
            data.add(x);
        }
        write.writeFile(data);

    }



    public void afisare(){

        for(Candidat x: Candidati){
            System.out.println(x);
        }
    }

    public Candidat getCandidat(int index){
        return Candidati.get(index);
    }

    public Candidat getCandidat(String cnp){

            for(int i=0;i<Candidati.size();i++) {
                if(Candidati.get(i).getCNP().equals(cnp))
                    return Candidati.get(i);
            }
            return null;

    }

    public void addCandidat(Candidat candidat){
        Candidati.add(candidat);
    }


    public ArrayList<Candidat> getCandidati() {
        return Candidati;
    }
}
