package polymorphism.zoo;

public class Zoo {

    private final int nrMaximAnimale;
    Animal[] animaleZoo;
    private int indexCurent;

    public Zoo(int nrMaximAnimale) {
        if(nrMaximAnimale > 0) {
            this.nrMaximAnimale = nrMaximAnimale;
            this.animaleZoo = new Animal[nrMaximAnimale];
        }
        else
            throw new RuntimeException("Nu ati introdus un numar intreg pozitiv");
    }

    public void adaugaAnimal(Animal animal) {
        if (indexCurent < animaleZoo.length){
            animaleZoo[indexCurent] = animal;
            System.out.println("Adaugat animal " + animal.getClass() + " la pozitia " + indexCurent++);

        }

    }

}
