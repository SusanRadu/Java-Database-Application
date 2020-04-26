package supraveghetori;

public class Supraveghetor {

    private String nume;
    private String prenume;
    private String sala;

    public Supraveghetor(String nume, String prenume, String sala) {
        this.nume = nume;
        this.prenume = prenume;
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Supraveghetor{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", sala='" + sala + '\'' +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getSala() {
        return sala;
    }
}
