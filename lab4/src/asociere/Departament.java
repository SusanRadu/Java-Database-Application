package asociere;

public class Departament {//has a
    private String nume;
    private Profesor[] profesori;

    public Departament(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public Profesor[] getProfesori() {
        return profesori;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setProfesori(Profesor[] profesori) {
        this.profesori = profesori;
    }


}


