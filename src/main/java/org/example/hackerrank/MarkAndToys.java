package org.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class MarkAndToys {




    public static void swap(int[] arr, int indexOne, int indexTwo) {
        int temp = arr[indexTwo];
        arr[indexTwo] = arr[indexOne];
        arr[indexOne] = temp;
    }






    public static int maximumToys(List<Integer> prices, int k) {
        int[] myArrayPrices = prices.stream().mapToInt(Integer::intValue).toArray();
        int numberToys = 0;
        int moneyToSpend = k;

        Arrays.sort(myArrayPrices);

        for (int i = 0; i < myArrayPrices.length; i++) {
            if(myArrayPrices[i] <= moneyToSpend){
                moneyToSpend = moneyToSpend - myArrayPrices[i];
                numberToys++;
            }else{
                break;
            }
        }








        return numberToys;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> prices = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = maximumToys(prices, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
