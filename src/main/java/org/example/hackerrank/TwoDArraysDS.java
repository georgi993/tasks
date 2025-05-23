package org.example.hackerrank;

import java.util.List;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class TwoDArraysDS {


    public static int hourglassSum(List<List<Integer>> arr) {
        int sum = 0;
        int temp = 0;
        int rows = arr.size();
        int cols = arr.get(0).size();
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = arr.get(i).get(j);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " " + array[i][j + 1] + " " +  array[i][j + 2]);
                System.out.println();
                 System.out.print("  " + array[i + 1][j + 1] );
                System.out.println();
                System.out.print(array[i + 2][j] + " " + array[i + 2][j + 1] + " " +  array[i + 2][j + 2]);
                System.out.println();
                 System.out.println();

                temp = (array[i][j]) +
                        (array[i][j + 1]) +
                        (array[i][j + 2]) +
                        (array[i + 1][j + 1]) +
                        (array[i + 2][j]) +
                        (array[i + 2][j + 1]) +
                        (array[i + 2][j + 2]);
                System.out.println(temp);
                System.out.println();



                if(i == 0 && j == 0){
                    sum = temp;
                }



                if (temp > sum) {
                    sum = temp;
                }






            }
             System.out.println();
            System.out.println();
        }
        System.out.println("sum:" + sum);
        return sum;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
