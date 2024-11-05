package data.structure;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TaskSet {

    public static void main(String[] args){

        //no order
        Set<String> color = new HashSet<>();
        color.add("red");
        color.add("blue");
        color.add("green");
        color.add("black");
        color.forEach(System.out::println);
        System.out.println("-");

        Set<String> ballss = new TreeSet<>();
        ballss.add("red");
        ballss.add("blue");
        ballss.add("green");
        ballss.forEach(System.out::println);
        System.out.println("-");

        SortedSet<String> srotedColors = new TreeSet<>();
        srotedColors.add("b");
        srotedColors.add("a");
        srotedColors.add("c");
        srotedColors.forEach(System.out::println);
    }
}
