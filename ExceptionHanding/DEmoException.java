package Java8.ExceptionHanding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DEmoException {
    public static void main(String[] args) {


        List<String> li = Arrays.asList("1", "2", "3", "xyz");
        //covert to INTEGER
//        List<Integer> in = li.stream().map(Integer::parseInt).collect(Collectors.toList());
//        System.out.println(in);
       li.forEach(s->{
       try{
           System.out.println(Integer.parseInt(s));
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
       });

        List<Integer>num=Arrays.asList(1,2,3,4,5,6,7);
        num.stream()
                .skip(2).limit(3).forEach(System.out::println);


    }



}
