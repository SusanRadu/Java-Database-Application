package polymorphism.zoo.carnivor;

import polymorphism.zoo.Animal;

public abstract class carnivor extends Animal {

    public carnivor(String nume, int varsta){
        super(nume,varsta);
        this.tipHrana = "carne";
    }


    public void seHraneste() {
        System.out.println(this + " se hraneste cu" + this.tipHrana);
    }
}
