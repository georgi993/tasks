package other;

import java.util.*;

public class Pyramid {

    public static void main(String[] args) {

        int randomNumber = 33;

        Map<Integer, List<Integer>> rows = fillRows(randomNumber);

        printPyramid(rows);

    }

    public static Map<Integer, List<Integer>> fillRows(int max) {
        Map<Integer, List<Integer>> rows = new HashMap<>();
        int current = 1;
        int row = 1;

        while (current <= max) {
            List<Integer> rowValues = new ArrayList<>();

            for (int i = 0; i < row && current <= max; i++) {
                rowValues.add(current);
                current++;
            }

            rows.put(row, rowValues);
            row++;
        }
        return rows;
    }


    public static void printPyramid(Map<Integer, List<Integer>> rows) {
        List<Integer> keys = new ArrayList<>(rows.keySet());
       // Collections.sort(keys);
        List<String> rowStrings = new ArrayList<>();
        int maxWidth = 0;
        for (Integer key : keys) {
            List<Integer> numbers = rows.get(key);
            StringBuilder sb = new StringBuilder();
            for (Integer number : numbers) {
                sb.append(number).append(" ");
            }
            if (!sb.isEmpty()) {
                sb.setLength(sb.length() - 1);
            }
            String rowStr = sb.toString();
            rowStrings.add(rowStr);
            if (rowStr.length() > maxWidth) {
                maxWidth = rowStr.length();
            }
        }

        for (String rowStr : rowStrings) {
            int padding = (maxWidth - rowStr.length()) / 2;
            for (int i = 0; i < padding; i++) {
                System.out.print(" ");
            }
            System.out.println(rowStr);
        }
    }
}
