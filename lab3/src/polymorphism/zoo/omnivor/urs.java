package polymorphism.zoo.omnivor;

public class urs extends  omnivor {

    public urs(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "mormaie";
    }

    public void scoateSunet() {
        System.out.println("ursul" + this.sunetSpecific);
    }

}
