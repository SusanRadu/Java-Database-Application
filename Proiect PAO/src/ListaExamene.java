import Candidat.Candidat;
import Examen.Examen;

import java.util.Arrays;

public class ListaExamene {

    private int nrMaximExamene;
    Examen[] Examene;
    private int indexCurent;

    public ListaExamene(int nrMaximExamene) {
        if (nrMaximExamene > 0) {
            this.nrMaximExamene = nrMaximExamene;
            this.Examene = new Examen[nrMaximExamene];
        } else
            throw new RuntimeException("Nu ati introdus un numar intreg pozitiv");

    }

    @Override
    public String toString() {
        return "ListaExamene{" +
                "Examene=" + Arrays.toString(Examene) + "\n" +
                '}';
    }

    public void adaugaExamen(Examen examen) {
        if (indexCurent < Examene.length) {
            Examene[indexCurent] = examen;
            System.out.println("Adaugat examen " + examen.getClass() + " la pozitia " + indexCurent++);
        }

    }

    public float calculeazaMedie(Candidat candidat) {

        float sum=0;
        for(int i=0;i<indexCurent;i++)
            if(candidat.equals(this.Examene[i].getCandidat()))
                sum+=Examene[i].calculeazaPondere();
        return sum;
    }





}
