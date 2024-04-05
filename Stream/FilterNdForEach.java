package Java8.Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterNdForEach {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("jeeva");
        l.add("sachin");
        l.add("ajith");
//        System.out.println(l);
    for(String k:l){
        if(k.startsWith("s")){
            System.out.println(k);
        }
    }


        //with lambda
//        }
       // l.stream().forEach(m-> System.out.println(m));
       // l.stream().filter(m->m.startsWith("s")).forEach(m-> System.out.println(m));
       // System.out.println(  l.stream().filter(m->m.startsWith("j")));


        Map<Integer,String> m=new HashMap<>();
    m.put(1,"jeeva");
    m.put(2,"sachin");
    m.put(3,"kj");
    m.put(4,"kj");
//    for(Map.Entry k:m.entrySet()){
//        System.out.println(k.getKey()+" "+k.getValue());
//    }
    //with lambda
//m.forEach((key,value)-> System.out.println(key+":"+value));

//with stream
//        m.entrySet().stream()
//                .filter(kk->kk.getValue().equals(kk.getValue().toUpperCase()))
//                .forEach(kk-> System.out.println(kk));
        m.entrySet().stream().filter(kk->kk.getValue().startsWith("k")).forEach(mp-> System.out.println(mp));

m.entrySet().stream().filter(n->n.getKey()%2==0).forEach(n-> System.out.println(n));
    }
}
