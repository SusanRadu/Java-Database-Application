import facultate.Facultate;

import java.io.IOException;
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

    public void incarcaCSV() throws IOException {
        CsvIO read = CsvIO.getInstance();
        read.setPath("./src/files/facultati.csv");
        ArrayList<String> buff;
        buff = read.readFile();

        for(int i=1;i<buff.size();i++){
            String[] x;
            x=buff.get(i).split(",");
            Integer cod = Integer.parseInt(x[0]);
            Facultate facultate = new Facultate(cod,x[1],x[2],x[3]);
            Facultati.add(facultate);
        }
    }

    public void afisare(){
        for(Facultate x: Facultati){
            System.out.println(x);
        }
    }

    public Facultate getFacultate(int index){
        return Facultati.get(index);
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

    public void descarcaCSV() throws IOException {

        CsvIO write = CsvIO.getInstance();
        write.setPath("./src/files/facultati.csv");
        ArrayList <String> data = new ArrayList();

        for(int i=0;i<Facultati.size();i++){
            String x = Facultati.get(i).getCod()+','+Facultati.get(i).getNume()+','+Facultati.get(i).getOras()+','+Facultati.get(i).getSpecializare();
            data.add(x);
        }
        write.writeFile(data);

    }




}
