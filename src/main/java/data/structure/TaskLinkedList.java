package data.structure;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.ListIterator;

public class TaskLinkedList {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Joe");
        names.add("Reni");


        ListIterator<String> iteratorNames = names.listIterator();

        while (iteratorNames.hasNext()) {
            System.out.println(iteratorNames.next());
        }


        while (iteratorNames.hasPrevious()) {
            System.out.println(iteratorNames.previous());
        }

    }


}
