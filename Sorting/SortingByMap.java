package Java8.Sorting;

import java.util.*;

public class SortingByMap {
    public static void main(String[] args) {
        Map<Integer, String> m = new LinkedHashMap<>();
        m.put(2, "kj");
        m.put(5, "jee");
        m.put(1, "aji");
        System.out.println("before sorting");

        m.entrySet().stream().forEach(s-> System.out.println(s));

        System.out.println("after sorting");
//        List<Map.Entry<Integer,String>>l=new ArrayList<>(m.entrySet());
//        Collections.sort(l, new Comparator<Map.Entry<Integer, String>>() {
//            @Override
//            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
//                return o1.getKey().compareTo(o2.getKey());
//            }
//        });
//        m.entrySet().stream().sorted(Map.Entry.comparingByKey().reversed())
//                .forEach(s-> System.out.println(s.getKey()+""+s.getValue()));
//        System.out.println("sort by value");
        m.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(s-> System.out.println(s));
        System.out.println("Sort by key (descending order):");
        m.entrySet().stream()
                .sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
//       m.forEach((key,value)-> System.out.println(key+":"+value));
//        System.out.println("after sorting");
//       List<Map.Entry<Integer,String>>l=new ArrayList<>(m.entrySet());
//       Collections.sort(l, new Comparator<Map.Entry<Integer, String>>() {
//           @Override
//           public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
//               return o1.getValue().compareTo(o2.getValue());
//           }
//       });
//       l.stream().forEach(s-> System.out.println(s));

    }
}