package data.structure;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Joe");
        names.add("Nick");
        names.add("Rob");
        names.add("John");
        names.add("Derek");
        names.add("Toni");

        names.get(2);

        //names.stream().forEach(System.out::println);

        System.out.println("-------------");
        names.stream().forEach((value) -> System.out.println(value));
        System.out.println("-------------");

        //names.forEach((value) -> System.out.println(value));

        //System.out.println("-" + names.get(2));

        //List<String> colors = List.of("pink", "blue", "green");
       // colors.add("black");
        //System.out.println("--");
       // System.out.println(colors);
    }
}
