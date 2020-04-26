import candidat.Candidat;
import examen.Examen;
import examen.ExamenMatematica;
import examen.ExamenInformatica;


import java.io.IOException;
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

    public void incarcaCSV() throws IOException {//functie cu care citim datele din csv si le punem in lista

        //avem nevoie de celelalte clase de care depinde examen
        ListaCandidati candidati = ListaCandidati.getInstance();
        ListaFacultati facultati = ListaFacultati.getInstance();
        ListaSupraveghetori supraveghetori = ListaSupraveghetori.getInstance();
        supraveghetori.incarcaCSV();
        candidati.incarcaCSV();
        facultati.incarcaCSV();
        //citim datele din csv-ul cu examene
        CsvIO read = CsvIO.getInstance();
        read.setPath("./src/files/examene.csv");
        ArrayList<String> buff;
        buff = read.readFile();

        for(int i=1;i<buff.size();i++){
            String[] x;
            x=buff.get(i).split(",");
            Float nota = Float.parseFloat(x[1]);//conversie String->Float
            Integer cod = Integer.parseInt(x[3]);//conversie String->Integer

            //vedem daca examenul este la informatica sau la matematica si il adaugam in lista de examene
            if(x[0].equals("Informatica")) {
                Examen examen = new ExamenInformatica(x[0], nota, candidati.getCandidat(x[2]), facultati.getFacultate(cod),supraveghetori.getSupraveghetori(x[4]));
                Examene.add(examen);
            }
            else if (x[0].equals("Matematica")){
                Examen examen = new ExamenMatematica(x[0], nota, candidati.getCandidat(x[2]), facultati.getFacultate(cod),supraveghetori.getSupraveghetori(x[4]));
                Examene.add(examen);
            }

        }
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

    public void descarcaCSV() throws IOException {//metoda care incarca datele din lista intr-un fisier csv

        CsvIO write = CsvIO.getInstance();
        write.setPath("./src/files/examene.csv");
        ArrayList <String> data = new ArrayList();
        String x = "nume,nota,CNP_candidat,cod_facultate,nume_supraveghetor";

        data.add(x);
        for(int i=0;i<Examene.size();i++){
            x = Examene.get(i).getNume()+','+Examene.get(i).getNota()+','+Examene.get(i).getCandidat().getCNP()+','+Examene.get(i).getFacultate().getCod()+','+Examene.get(i).getSupraveghetor().getNume();
            data.add(x);
        }
        write.writeFile(data);

    }




}
