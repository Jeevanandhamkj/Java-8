package Java8.OptionalClassEx;

import java.util.Optional;

public class OptionalMethodEx {
    public static void main(String[] args) {
        //of,empty,ofNullable
        String k="jeeva";
        String z=null;
        Optional<String>j=Optional.of(k);
       // j.ifPresent((s)-> System.out.println(" present"));
        j.filter((s)->s.contains("jeeva"))
                .map(s->s.toUpperCase())
                .ifPresent(s-> System.out.println(s));



//        Optional<String>op=Optional.empty();
//            System.out.println(op);
           // Optional<String>o=Optional.of(k);
       // System.out.println(o);
       // Optional<String>opp=Optional.ofNullable(z);
       // String m=opp.orElse("sachin");
       // String m=opp.orElseGet(()->"sachin10");
//        String m=opp.orElseThrow(()->new IllegalArgumentException("check value"));
//
//        System.out.println(m);

//        System.out.println(opp);
//        System.out.println(opp.get());//obj retrive from optional class
//        if(opp.isPresent()){
//            System.out.println(opp.get());
//        }
//        else{
//            System.out.println("no value");
//        }


        }



    }



