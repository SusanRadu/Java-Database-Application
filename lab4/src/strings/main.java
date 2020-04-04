package strings;

public class main {

    static String membruClasa;

    public static void main(String[] args){

        System.out.println(membruClasa);//default null

        String s1 = "";//empty string
        String b = "  ";//blank string , isBlank()
        String s2 = " abc ";
        System.out.println(s2);//abc
        s2.toUpperCase();
        System.out.println(s2);//abc
       // s2 = s2.toUpperCase();// "ABC"
       // System.out.println(s2);//ABC

        String s3 = new String( " abc ");
        String s4 = "abc";

        System.out.println(s2 == s3); // false
        System.out.println(s2 == s4); // true
        System.out.println(s3 == s4); // false

        System.out.println(s2.equals(s3)); // true
        s3 = s3.intern();
        System.out.println(s2 == s3); // true

        String adresa = s1 + s2 + s3.toUpperCase() + s4.length();//nu este eficient ca executie si memorie, se creeaza prea multe variabile string
        StringBuilder sb = new StringBuilder(adresa);
        sb.append(1234);
        System.out.println(sb);

        StringBuffer sbf = new StringBuffer(adresa);
        StringBuffer sbf1 = new StringBuffer(sb);
        StringBuilder sb1 = new StringBuilder(sbf);


    }

}
