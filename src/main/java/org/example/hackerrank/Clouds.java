package org.example.hackerrank;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Clouds {

    public static int jumpingOnClouds(List<Integer> c) {

        int jumps = 0;
        for (int index = 0; index < c.size() - 1; index++) {
            try {
                if (c.size() - 2 != index && c.get(index + 2) == 0) {
                    index++;
                    jumps++;
                } else {
                    jumps++;
                }
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        return jumps;
    }

    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }


}

