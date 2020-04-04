package imutabilitate;

//final si abstract nu pot exista in acelasi timp, sunt opuse
//pentru imutabilitate, clasa si fieldurile trebuie sa fie final
//sa lucram doar cu copii ale obiectelor
public final class persoana {

    private final int id;
    private final String nume;
    private final adresa adrs;

    public persoana(int id, String nume, adresa adrs) {
        this.id = id;
        this.nume = nume;
        adresa copieAdresa = new adresa(adrs.getStrada(),adrs.getNumar());
        this.adrs = copieAdresa;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return "persoana{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", adrs=" + adrs +
                '}';
    }
}
