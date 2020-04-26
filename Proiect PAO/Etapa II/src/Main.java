import candidat.Candidat;
import examen.Examen;
import java.io.*;
import java.util.Collections;
import examen.ExamenMatematica;
import examen.ExamenInformatica;

public class Main {

    public static void main(String[] args) throws IOException {

    ListaExamene examene = ListaExamene.getInstance();
    ListaCandidati candidati = ListaCandidati.getInstance();
    ListaFacultati facultati = ListaFacultati.getInstance();
    ListaSupraveghetori supraveghetori = ListaSupraveghetori.getInstance();

    examene.incarcaCSV();

    //declaram un candidat nou si 2 examene noi
    Candidat c = new Candidat("5235243421","Susan","Loredana","Ion Socolescu");
    candidati.addCandidat(c);//adaugam candidatul la lista de candidati
    Examen e = new ExamenInformatica("Informatica",(float)4,c, facultati.getFacultate(0),supraveghetori.getSupraveghetori("Vasile"));
    Examen e2 = new ExamenMatematica("Matematica",(float)2,c, facultati.getFacultate(0),supraveghetori.getSupraveghetori("Vasile"));
    examene.addExamen(e);//adaugam examenele la lista de examene
    examene.addExamen(e2);

    candidati.afisare();//afisam candidati (incluzandul pe cel adaugat mai sus)
    System.out.println("\n");
    examene.afisare();//afisam examenele (incluzandule pe cele adaugate mai sus)

    for(Examen x: examene.getExamene())//calculam ponderea din media finala pentru fiecare examen in functie de specializarea aleasa
        Pondere.calculeazaProcent(x,x.getFacultate());

    System.out.println("\nCalculam media de intrare pentru fiecare dintre candidatii\n");

    for(Candidat candidat: candidati.getCandidati())
        System.out.println(candidat + " Media de admitere "  + examene.calculeazaMedie(candidat));

    System.out.println("\nSortam lista in functie de note\n");

    candidati.descarcaCSV();//descarcam datele inapoi in csv-uri
    examene.descarcaCSV();

    Collections.sort(examene.getExamene());//sortam lista de examene
    examene.afisare();//afisam lista sortata

    }

}
