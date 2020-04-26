package lamba.ex1;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex3 {

    public static void main(String[] args) {


        Consumer<String> c1 = x -> System.out.println(x);
        c1.accept("abc");

        Supplier<LocalDate> ld1 = () -> LocalDate.now();
        ld1.get();

        Function<String, Integer> f1 = s -> s.length();
        f1.apply("fasdfasdfa");

        Predicate<Integer> p1 = x -> x % 2 == 0;
        p1.test(45);


    }


}
