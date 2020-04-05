package Facultate;

public class Facultate {

    private String nume;
    private String oras;
    private String specializare;

    public Facultate(String nume, String specializare, String oras) {
        this.nume = nume;
        this.specializare=specializare;
        this.oras = oras;
    }

    public String getSpecializare() {
        return specializare;
    }

    @Override
    public String toString() {
        return "Facultate{" +
                "nume='" + nume + '\'' +
                ", specializare='" + specializare + '\'' +
                '}';
    }
}
