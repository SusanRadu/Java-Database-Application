public class VirtualCoffee {


    public static void prepareCup(Cup cup){
        cup.wash();
    }


    public static void main (String args[]){


        //static polymorphism
        //dynamic polymorphism
        Cup cup = new Cup();
        prepareCup(cup);

        Cup coffeCup = new CoffeCup();
        prepareCup(coffeCup);

        Cup teaCup = new TeaCup();
        prepareCup(teaCup);

    }

}
