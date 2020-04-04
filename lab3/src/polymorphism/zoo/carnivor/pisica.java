package polymorphism.zoo.carnivor;

public class pisica extends carnivor {


    public pisica(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "miauna";
    }

    public void scoateSunet() {
        System.out.println("pisica" + this.sunetSpecific);
    }


}
