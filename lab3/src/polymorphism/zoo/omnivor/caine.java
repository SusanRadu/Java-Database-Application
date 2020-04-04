package polymorphism.zoo.omnivor;

public class caine extends omnivor {

    public caine(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "latra";
    }

    public void scoateSunet() {
        System.out.println("cainele" + this.sunetSpecific);
    }


}
