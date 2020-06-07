package examen;

import candidat.Candidat;
import facultate.Facultate;
import supraveghetori.Supraveghetor;

public class ExamenInformatica extends Examen{

    private int procent;

    public ExamenInformatica(Integer cod, String nume, Float nota, Candidat candidat, Facultate facultate, Supraveghetor supraveghetor) {
        super(cod,nume, nota, candidat, facultate, supraveghetor);
    }

    public void setProcent(Integer procent) {
        this.procent = procent;
    }

    @Override
    public float calculeazaPondere() {
        return this.getNota()*this.procent/100;
    }

}
