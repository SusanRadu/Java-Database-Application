package examen;

import candidat.Candidat;
import facultate.Facultate;
import supraveghetori.Supraveghetor;

public class Examen implements Comparable<Examen>{

    private String nume;
    private Float nota;
    private Candidat candidat;
    private Facultate facultate;
    private Supraveghetor supraveghetor;

    public Examen(String nume, Float nota, Candidat candidat, Facultate facultate, Supraveghetor supraveghetor) {
        this.nume = nume;
        this.nota = nota;
        this.candidat = candidat;
        this.facultate = facultate;
        this.supraveghetor = supraveghetor;
    }

    public Float getNota() {
        return nota;
    }

    public Facultate getFacultate() {
        return facultate;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public String getNume() {
        return nume;
    }

    public Supraveghetor getSupraveghetor() {
        return supraveghetor;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "nume='" + nume + '\'' +
                ", nota=" + nota + "\n" +
                " Candidat=" + candidat + "\n" +
                " Facultate=" + facultate +
                " Supraveghetor=" + supraveghetor +
                '}' + "\n\n";
    }

    public float calculeazaPondere(){return 0;}

    @Override
    public int compareTo(Examen o) {
        return (int)(o.getNota()-this.getNota());
    }



}
