package polymorphism.zoo.ierbivor;

public class elefant extends ierbivor{


    public elefant(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "trambiteze";
    }

    public void scoateSunet() {
        System.out.println("elefantul" + this.sunetSpecific);
    }


}
