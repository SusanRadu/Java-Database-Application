import Examen.ExamenInformatica;
import Examen.ExamenMatematica;
import Facultate.Facultate;

public class Pondere {


    //functie care calculeaza procentul fiecarei note din examen, in functie de specializarea aleasa
    public static void calculeazaProcent(Object examen, Facultate facultate){

        if(facultate.getSpecializare()=="Informatica") {
            if (examen instanceof ExamenMatematica) {
                ExamenMatematica examenMatematica = (ExamenMatematica) examen;
                examenMatematica.setProcent(30);
            } else if (examen instanceof ExamenInformatica) {
                ExamenInformatica examenInformatica = (ExamenInformatica) examen;
                examenInformatica.setProcent(70);

            } else throw new RuntimeException("unsupported object type");
        }
        else if(facultate.getSpecializare()=="Matematica"){
            if (examen instanceof ExamenMatematica) {
                ExamenMatematica examenMatematica = (ExamenMatematica) examen;
                examenMatematica.setProcent(80);
            } else if (examen instanceof ExamenInformatica) {
                ExamenInformatica examenInformatica = (ExamenInformatica) examen;
                examenInformatica.setProcent(20);

            } else throw new RuntimeException("unsupported object type");


        }
    }



}
