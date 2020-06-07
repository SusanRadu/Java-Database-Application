import Server.DataBaseConnection;
import facultate.Facultate;
import supraveghetori.Supraveghetor;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class  ListaSupraveghetori {

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

    public void incarcaCSV(){
        try{
            ResultSet supraveghetori = DataBaseConnection.getData("supraveghetori");
            while (supraveghetori.next()) {
                Supraveghetor supraveghetor = new Supraveghetor(supraveghetori.getString(1),supraveghetori.getString(2),supraveghetori.getString(3));
                Supraveghetori.add(supraveghetor);
            }
        }

        catch (Exception e){
            e.printStackTrace();
        }

    }

    public void insereazaData(String[] valori){

        String[] numeCol = new String[3];
        numeCol[0] = "nume"; numeCol[1] = "prenume"; numeCol[2] = "sala";
        DataBaseConnection.insereazaData("supraveghetori",numeCol,valori);

    }

    public void stergeData(String coloana, String valoare){

        String conditie = coloana + "=" + valoare;
        DataBaseConnection.stergeData("supraveghetori",conditie);

    }

    public void modificaData(String coloana, String valoare, String coloanaConditie, String valoareConditie){

        DataBaseConnection.modificaData("supraveghetori",coloana,valoare,coloanaConditie,valoareConditie);

    }


}
