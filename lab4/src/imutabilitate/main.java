package imutabilitate;

public class main {

    public static void main(String[] args) {

        adresa domiciliu = new adresa("Timisoara" , "4A");

        persoana pers = new persoana(1 , "Teo" , domiciliu);

        String numePersoana = pers.getNume().toUpperCase();
        System.out.println(pers);
        System.out.println(numePersoana);

        String stradaUpp = domiciliu.getStrada().toUpperCase();
        domiciliu.setStrada(stradaUpp);
        System.out.println(pers);

      //  adresa adresaDomiciliu = persoana.getAdresa();
      //  domiciliu.setStrada();



    }

}
