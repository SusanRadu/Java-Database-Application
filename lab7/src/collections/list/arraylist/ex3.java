package collections.list.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ex3 {


    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(2,5,3,9,7,110);

        System.out.println(ints);

        Object[] arrayOfInt = ints.toArray();

        Collections.sort(ints);
        System.out.println(ints);
        Collections.binarySearch(ints,9);


    }


}
