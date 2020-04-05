package Examen;

import Candidat.Candidat;
import Facultate.Facultate;

public class ExamenInformatica extends Examen{

    private int procent;

    public ExamenInformatica(String nume, Float nota, Candidat candidat, Facultate facultate) {
        super(nume, nota, candidat, facultate);
    }

    public void setProcent(Integer procent) {
        this.procent = procent;
    }

    @Override
    public float calculeazaPondere() {
        return this.getNota()*this.procent/100;
    }

}
