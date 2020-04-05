package Examen;

import Candidat.Candidat;
import Facultate.Facultate;
import sun.plugin.JavaRunTime;

public class Examen implements Comparable<Examen>{

    private String nume;
    private Float nota;
    private Candidat candidat;
    private Facultate facultate;

    public Examen(String nume, Float nota, Candidat candidat, Facultate facultate) {
        this.nume = nume;
        this.nota = nota;
        this.candidat = candidat;
        this.facultate = facultate;
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

    @Override
    public String toString() {
        return "Examen{" +
                "nume='" + nume + '\'' +
                ", nota=" + nota + "\n" +
                " Candidat=" + candidat + "\n" +
                " Facultate=" + facultate +
                '}' + "\n\n";
    }

    public void noteazaExamen(Float nota) {
        if(this.nota!=null)
            throw new RuntimeException("Deja s-a notat examenul");
        else if(nota<0 || nota >10)
        {throw new RuntimeException("Nota nu este intre 0 si 10");}
             else this.nota=nota;
    }

    public float calculeazaPondere(){return 0;}

    @Override
    public int compareTo(Examen o) {
        return (int)(o.getNota()-this.getNota());
    }

}
