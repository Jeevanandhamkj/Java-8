package Java8.MethodReference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MFDemo {
    public static void main(String[] args) {
        //static


        Function<Integer,Double>f=(i)->Math.sqrt(i);
        System.out.println(f.apply(4));

        //using method referance
        Function<Integer,Double>fs=Math::sqrt;
        System.out.println(fs.apply(9));
        BiFunction<Integer,Integer,Integer>ad=MFDemo::addition;
        System.out.println(ad.apply(10,20));
    }

    private static Integer addition(Integer a, Integer b) {
       return a+b;
    }
}
