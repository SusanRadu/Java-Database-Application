package polymorphism.zoo.carnivor;

public class leu extends carnivor{

    public leu(String nume, int varsta){
        super(nume,varsta);
        this.sunetSpecific = "rage";
    }


    public void scoateSunet() {
        System.out.println("leul" + this.sunetSpecific);

    }
}
