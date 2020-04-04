package polymorphism.zoo;

import polymorphism.zoo.carnivor.leu;
import polymorphism.zoo.carnivor.pisica;
import polymorphism.zoo.ierbivor.cal;
import polymorphism.zoo.ierbivor.elefant;
import polymorphism.zoo.omnivor.caine;
import polymorphism.zoo.omnivor.urs;

import java.util.Scanner;

// java.lang importat default

public class ZooTest {

    public static void main (String[] args){

        /* Integer nrAnimaleZoo = Integer.valueOf(args[0]); */

        public static void adaugaAnimaleLaZoo(Zoo zoo){

            leu Leu = new leu("Simba" , 7);
            zoo.adaugaAnimal(Leu);
            elefant Elefant = new elefant("ELi", 10);
            zoo.adaugaAnimal(Elefant);
            urs Urs = new urs("Fram" , 4);
            zoo.adaugaAnimal(Urs);
            pisica Pisica = new pisica("Tom", 2);
            zoo.adaugaAnimal(Pisica);
            caine Caine = new caine("Toto" , 3);
            zoo.adaugaAnimal(Caine);
            cal Cal = new cal("Thunder",4);
            zoo.adaugaAnimal(Cal);

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Precizati numarul maxim de animale : ");
        int nrAnimaleZoo = scanner.nextInt();
        scanner.close();

        Zoo zooBucuresti = new Zoo(nrAnimaleZoo);
        adaugaAnimaleLaZoo(zooBucuresti);
        for(int i=0;i<zooBucuresti.animaleZoo.length;i++){
            Animal animal = zooBucuresti.animaleZoo[i];
            animal.afiseazaDetalii();
            animal.scoateSunet();
            animal.seHraneste();
        }







    }


}
