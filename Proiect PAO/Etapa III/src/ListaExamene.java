import Server.DataBaseConnection;
import candidat.Candidat;
import examen.Examen;
import examen.ExamenMatematica;
import examen.ExamenInformatica;


import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ListaExamene {

    private static ListaExamene INSTANCE;
    private ArrayList<Examen> Examene = new ArrayList();


    private ListaExamene() {
    }

    public static ListaExamene getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ListaExamene();
        }

        return INSTANCE;
    }

    public ArrayList<Examen> getExamene() {
        return Examene;
    }

    public void incarcaDate(){
        try{
            ListaCandidati candidati = ListaCandidati.getInstance();
            ListaFacultati facultati = ListaFacultati.getInstance();
            ListaSupraveghetori supraveghetori = ListaSupraveghetori.getInstance();
            supraveghetori.incarcaCSV();
            candidati.incarcaDate();
            facultati.incarcaDate();

            ResultSet examene = DataBaseConnection.getData("examene");
            while (examene.next()) {
                Examen examen = new Examen(examene.getInt(1),examene.getString(2),examene.getFloat(3), candidati.getCandidat(examene.getString(4)),facultati.getFacultate(examene.getInt(5)),supraveghetori.getSupraveghetori(examene.getString(6)));
                Examene.add(examen);
            }
        }

        catch (Exception e){
            e.printStackTrace();
        }

    }

    public void insereazaData(String[] valori){

        String[] numeCol = new String[6];
        numeCol[0] = "cod_examen"; numeCol[1] = "nume"; numeCol[2] = "nota"; numeCol[3] = "CNP_candidat";
        numeCol[4] = "cod_facultate"; numeCol[5] = "nume_supraveghetor";

        DataBaseConnection.insereazaData("examene",numeCol,valori);

    }

    public void stergeData(String coloana, String valoare){

        String conditie = coloana + "=" + valoare;
        DataBaseConnection.stergeData("examene",conditie);

    }

    public void modificaData(String coloana, String valoare, String coloanaConditie, String valoareConditie){

        DataBaseConnection.modificaData("examene",coloana,valoare,coloanaConditie,valoareConditie);

    }



    public void afisare() {

        for (Examen x : Examene) {
            System.out.println(x);
        }
    }

    public float calculeazaMedie(Candidat candidat) {

        float sum=0;
        for(Examen x: Examene)
            if(x.getCandidat().equals(candidat)) {
                sum += x.calculeazaPondere();
            }
        return sum;
    }

    public void addExamen(Examen examen){
        Examene.add(examen);
    }




}
