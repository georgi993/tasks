package org.example.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BubbleSort {


    public static void swap(int[] arr, int indexOne, int indexTwo) {
        int temp = arr[indexTwo];
        arr[indexTwo] = arr[indexOne];
        arr[indexOne] = temp;
    }


    public static void countSwaps(List<Integer> a) {

        int[] myArray = a.stream().mapToInt(Integer::intValue).toArray();

        int countSwap = 0;

        boolean swapping = true;
        while (swapping) {
            swapping = false;
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    swap(myArray, i, i + 1);
                    swapping = true;
                    countSwap++;
                }
            }
        }
        System.out.println("Array is sorted in " + countSwap + " swaps.");
        System.out.println("First Element: " + myArray[0]);
        System.out.println("Last Element: " + myArray[myArray.length - 1]);

    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        countSwaps(a);

        bufferedReader.close();
    }
}
