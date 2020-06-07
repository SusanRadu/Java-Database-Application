import Server.DataBaseConnection;
import candidat.Candidat;
import facultate.Facultate;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ListaFacultati {

    private static ListaFacultati INSTANCE;
    private ArrayList<Facultate> Facultati = new ArrayList();


    private ListaFacultati() {
    }

    public static ListaFacultati getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ListaFacultati();
        }

        return INSTANCE;
    }

    public ArrayList<Facultate> getFacultati() {
        return Facultati;
    }

    public void incarcaDate(){
        try{

            ResultSet facultati = DataBaseConnection.getData("facultati");
            while (facultati.next()) {
                Facultate facultate = new Facultate(facultati.getInt(1),facultati.getString(2),facultati.getString(3),facultati.getString(4));
                Facultati.add(facultate);
            }
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void insereazaData(String[] valori){

        String[] numeCol = new String[4];
        numeCol[0] = "cod_facultate"; numeCol[1] = "nume"; numeCol[2] = "oras"; numeCol[3] = "specializare";
        DataBaseConnection.insereazaData("facultati",numeCol,valori);

    }

    public void stergeData(String coloana, String valoare){

        String conditie = coloana + "=" + valoare;
        DataBaseConnection.stergeData("facultati",conditie);

    }

    public void modificaData(String coloana, String valoare, String coloanaConditie, String valoareConditie){

        DataBaseConnection.modificaData("facultati",coloana,valoare,coloanaConditie,valoareConditie);

    }


    public void afisare(){
        for(Facultate x: Facultati){
            System.out.println(x);
        }
    }


    public Facultate getFacultate(Integer cod){

        for(int i=0;i<Facultati.size();i++) {
            if(Facultati.get(i).getCod().equals(cod))
                return Facultati.get(i);
        }
        return null;

    }

    public static ListaFacultati getINSTANCE() {
        return INSTANCE;
    }

    public void addFacultate(Facultate facultate){
        Facultati.add(facultate);
    }



}
