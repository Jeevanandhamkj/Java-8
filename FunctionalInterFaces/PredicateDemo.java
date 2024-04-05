package Java8.FunctionalInterFaces;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
//predicate check condition true or false
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer>p=a->a%2==0;
        System.out.println(p.test(5));

        //used in stream (Filter)

        List<Integer> l= Arrays.asList(1,2,3,4,5);
        l.stream().filter(t->t%2==1).forEach(t-> System.out.println( "odd"+t));
    }
}
