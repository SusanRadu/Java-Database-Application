package polymorphism.zoo.omnivor;

import polymorphism.zoo.Animal;

public abstract class omnivor extends Animal {


    public omnivor(String nume, int varsta){
        super(nume,varsta);
        this.tipHrana = "carne si vegetatie";
    }


    public void seHraneste() {
        System.out.println(this + " se hraneste cu" + this.tipHrana);
    }

}
