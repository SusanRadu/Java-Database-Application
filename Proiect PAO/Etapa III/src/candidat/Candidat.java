package candidat;

public class Candidat {

    private String CNP;
    private String nume;
    private String prenume;
    private String liceu;

    public Candidat(String CNP, String nume, String prenume, String liceu) {
        this.CNP = CNP;
        this.nume = nume;
        this.prenume = prenume;
        this.liceu = liceu;
    }

    @Override
    public String toString() {
        return "Candidat{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                '}';
    }

    public String getCNP() {
        return CNP;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getLiceu() {
        return liceu;
    }
}
