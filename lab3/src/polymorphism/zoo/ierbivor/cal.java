package polymorphism.zoo.ierbivor;

public class cal extends ierbivor {

    public cal(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "necheaza";
    }

    public void scoateSunet() {
        System.out.println("calul" + this.sunetSpecific);
    }


}
