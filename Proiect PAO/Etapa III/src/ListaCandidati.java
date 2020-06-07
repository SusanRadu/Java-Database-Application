import Server.DataBaseConnection;
import candidat.Candidat;
import java.io.IOException;
import java.sql.ResultSet;
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

    public void incarcaDate(){

        try{

            ResultSet candidati = DataBaseConnection.getData("candidati");
            while (candidati.next()) {
                Candidat candidat = new Candidat(candidati.getString(1),candidati.getString(2),candidati.getString(3),candidati.getString(4));
                Candidati.add(candidat);
            }
        }

        catch (Exception e){
            e.printStackTrace();
        }

    }

    public void insereazaData(String[] valori){

        String[] numeCol = new String[4];
        numeCol[0] = "CNP"; numeCol[1] = "nume"; numeCol[2] = "prenume"; numeCol[3] = "liceu";
        DataBaseConnection.insereazaData("candidati",numeCol,valori);

    }

    public void stergeData(String coloana, String valoare){

        String conditie = coloana + "=" + valoare;
        DataBaseConnection.stergeData("candidati",conditie);

    }

    public void modificaData(String coloana, String valoare, String coloanaConditie, String valoareConditie){

        DataBaseConnection.modificaData("candidati",coloana,valoare,coloanaConditie,valoareConditie);

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
