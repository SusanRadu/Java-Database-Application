import Candidat.Candidat;
import Examen.Examen;
import Examen.ExamenMatematica;
import Examen.ExamenInformatica;
import Facultate.Facultate;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {



    Candidat[] candidati = {new Candidat("9478295323", "Susan", "Radu", "Grigore Moisil"),
                            new Candidat("9285739534", "Gheorghe", "Gigel", "Marin Preda"),
                            new Candidat("8367593725","Anon","Aghel","Gheorghe Lazar"),
                            new Candidat("8957123953","Gigel","Andrei","Grigore Moisil"),
                            new Candidat("9432715798","Gigica","Vlad","Tudor Vianu")
    };

    Facultate[] facultatii = {new Facultate("FMI","Informatica","Bucuresti"),
                              new Facultate("FMI","Matematica","Bucuresti")
    };

    Examen[] examene = {new ExamenMatematica("Matematica",(float)7,candidati[0],facultatii[0]),
                        new ExamenInformatica("Informatica",null,candidati[0],facultatii[0]),
                        new ExamenMatematica("Matematica",(float)5,candidati[1],facultatii[0]),
                        new ExamenInformatica("Informatica",(float)6,candidati[1],facultatii[0]),
                        new ExamenMatematica("Matematica",(float)8,candidati[2],facultatii[1]),
                        new ExamenInformatica("Informatica",(float)3,candidati[2],facultatii[1]),
                        new ExamenMatematica("Matematica",(float)10,candidati[3],facultatii[1]),
                        new ExamenInformatica("Informatica",(float)5,candidati[3],facultatii[1]),
                        new ExamenMatematica("Matematica",(float)8,candidati[4],facultatii[0]),
                        new ExamenInformatica("Informatica",(float)10,candidati[4],facultatii[0])
    };


    examene[1].noteazaExamen((float)9);


    for(int i=0;i<examene.length;i++)//calculam ponderea din media finala pentru fiecare examen in functie de specializarea aleasa
        Pondere.calculeazaProcent(examene[i],examene[i].getFacultate());

    System.out.println(examene);

    ListaExamene lista = new ListaExamene(10);

    for(int i=0;i<examene.length;i++)
        lista.adaugaExamen(examene[i]);

    System.out.println(lista);

    System.out.println("\nCalculam cat din media finala va fi fiecare examen din lista\n");

    for(int i=0;i<examene.length;i++)
        System.out.println(examene[i].getCandidat() + " Ponderea la "  + examene[i].getNume() + " " + examene[i].calculeazaPondere());

    System.out.println("\nCalculam media de intrare pentru fiecare dintre candidatii\n");

    for(int i=0;i<candidati.length;i++)
        System.out.println(candidati[i] + " Media de admitere "  + lista.calculeazaMedie(candidati[i]));

    System.out.println("\nSortam lista in functie de note\n");
    Arrays.sort(lista.Examene);

    System.out.println(lista);

    }

}
