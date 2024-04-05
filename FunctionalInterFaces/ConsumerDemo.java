package Java8.FunctionalInterFaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
      Consumer<String>s2=(St)-> System.out.println(St);
      s2.accept("jeeva");

      //consumer using stream (forEach)
        List<String>l=Arrays.asList("kj","jk");
        l.stream().forEach(t-> System.out.println(t));
}}
