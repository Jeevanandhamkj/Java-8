package Java8.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingEx {
    public static void main(String[] args) {
        List<Integer>s=new ArrayList<>();
        s.add(5);
        s.add(7);
        s.add(6);
        s.add(3);
        s.add(1);
//        Collections.sort(s);
//        System.out.println(s);
//        Collections.reverse(s);
//        System.out.println(s);
        //using stream
        s.stream().sorted().forEach(s1-> System.out.println(s1));//assending
        s.stream().sorted(Comparator.reverseOrder()).forEach(s2-> System.out.println(s2));//desending


    }
}
