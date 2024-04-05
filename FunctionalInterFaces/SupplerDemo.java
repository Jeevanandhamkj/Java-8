package Java8.FunctionalInterFaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplerDemo {
    public static void main(String[] args) {
        Supplier<String>s=()->"Hai jeeva";
        System.out.println(s.get());

        //in stream

        List<String> l= Arrays.asList();
        System.out.println(l.stream().findAny().orElse("jeeva"));
    }
}
