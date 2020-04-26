package facultate;

public class Facultate {

    private Integer cod;
    private String nume;
    private String oras;
    private String specializare;

    public Facultate(Integer cod, String nume, String oras, String specializare) {
        this.cod = cod;
        this.nume = nume;
        this.oras = oras;
        this.specializare = specializare;
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

    public Integer getCod() {
        return cod;
    }

    public String getNume() {
        return nume;
    }

    public String getOras() {
        return oras;
    }
}
