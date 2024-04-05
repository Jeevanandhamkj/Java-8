package Java8.OptionalClassEx;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalInstanceDemo {
    public static void main(String[] args) {
jeeva je=new jeeva();
kk k=je::sc;
k.j();
List<String> li= Arrays.asList("1","2","3","4");
List<Integer>in=li.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(in);
//
//Optional<Integer> op=li.stream().reduce(Integer::sum);
//      System.out.println(op.get());
//       Integer sum=li.stream().reduce(0,(a,b)->a+b);
//        System.out.println(sum);
//        Integer ss=li.stream().reduce(1,(a,b)->a*b);
//        System.out.println(ss);
//        Optional<Integer>oo=li.stream().reduce(Integer::min);
//        System.out.println(oo.get());

    }
}
interface kk{
    void j();
}
class jeeva{
    void sc(){
        System.out.println("hi");
    }
}