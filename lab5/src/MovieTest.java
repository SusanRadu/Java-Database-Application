import java.util.Arrays;

public class MovieTest {


    public static void main(String[] args) {


        Movie[] movies= {new Movie("BB",2014,9.4),
                new Movie("SW",1977,8.8),
                new Movie("DH",1990,8)
        };

        System.out.println(movies);
        Arrays.sort(movies);
        System.out.println(movies);
    }



}
