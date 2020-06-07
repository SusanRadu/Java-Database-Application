import Server.DataBaseConnection;
import candidat.Candidat;
import examen.Examen;
import java.io.*;
import java.util.Collections;
import examen.ExamenMatematica;
import examen.ExamenInformatica;

public class Main {

    public static void main(String[] args) {


        ListaCandidati candidati = ListaCandidati.getInstance();

        String[] val = new String[4];
        val[0]="'9527837425'";
        val[1]="'Susan'";
        val[2]="'Loredana'";
        val[3]="'Socolescu'";
        //testam functiile care lucreaza cu baza de date
        //candidati.insereazaData(val);
        //candidati.stergeData("prenume",val[2]);
        //candidati.modificaData("prenume", "'Lori'","liceu",val[3]);

        //verificam daca s-au citit bine lista de examene din baza de date
        //ListaExamene examene = ListaExamene.getInstance();
        //examene.incarcaDate();
        //examene.afisare();

        InserareCandidati interfata = new InserareCandidati();//interfata grafica pentru a adauga un candidat in tabela candidati

    }

}
