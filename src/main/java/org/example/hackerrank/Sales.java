package org.example.hackerrank;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Sales implements Serializable{
    public static void main(String[] args) throws IOException {

        System.out.println("asdas" + 10 + 10);
        System.out.println( 10 + 10 + "asdas");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Long result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }


    public static Long sockMerchant(int n, List<Integer> arr) {
        Map<Integer, Long> colors = new HashMap<>();

        // 20 -> 3
        // 30 -> 2
        // 40 -> 1
        // 50 -> 6
        // 80 -> 2

        Long pairs = 0L;
        Long pairsS;
        boolean isOdd = false;

        for (Integer color : arr) {
            if (colors.containsKey(color)) {
                colors.put(color, colors.get(color) + 1L);
            } else {
                colors.put(color, 1L);
            }
        }
        colors.entrySet().forEach(System.out::println);

        for (Long pairsNumber : colors.values()) {
            if (pairsNumber != 1) {

                if (pairsNumber % 2 == 0) {
                    pairs = pairs + (pairsNumber / 2L);
                } else {
                    Long evenNumber = (pairsNumber - 1);
                    pairs = pairs + (evenNumber / 2L);
                }
            }
        }


        return pairs;
    }
}