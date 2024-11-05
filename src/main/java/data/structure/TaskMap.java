package data.structure;

import java.util.HashMap;
import java.util.Map;

public class TaskMap {

    public static void main(String[] args) {


        Map<Integer, String> names = new HashMap();

        names.put(1, "Michael");
        names.put(2, "John");
        names.put(3, "Cecka");
        names.put(4, "Victor");


        names.entrySet().forEach(System.out::println);
        names.keySet().forEach(System.out::println);
        names.values().forEach(System.out::println);





        names.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        names.forEach((key, value) -> System.out.println(key + value));


    }
}
