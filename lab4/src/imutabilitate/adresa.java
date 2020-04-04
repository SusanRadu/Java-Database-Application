package imutabilitate;

public class adresa {

    private String strada;
    private String numar;

    public adresa(String strada, String numar) {
        this.strada = strada;
        this.numar = numar;
    }

    public adresa(adresa adrs){
        this(adrs.getStrada(),adrs.getNumar());
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    @Override
    public String toString() {
        return "adresa{" +
                "strada='" + strada + '\'' +
                ", numar='" + numar + '\'' +
                '}';
    }
}
