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

public class MakingAnagrams {

    public static int makeAnagram(String a, String b) {

        int deleteTimes = 0;
        Map<String, Integer> aMap = new HashMap<>();
        Map<String, Integer> bMap = new HashMap<>();
        for (char letter : a.toCharArray()) {
            if (aMap.containsKey(Character.toString(letter))) {
                aMap.put(Character.toString(letter), aMap.get(Character.toString(letter)) + 1);
            } else {
                aMap.put(Character.toString(letter), 1);
            }
        }
        for (char letter : b.toCharArray()) {
            if (bMap.containsKey(Character.toString(letter))) {
                bMap.put(Character.toString(letter), bMap.get(Character.toString(letter)) + 1);
            } else {
                bMap.put(Character.toString(letter), 1);
            }
        }
        for (Map.Entry<String, Integer> entry : bMap.entrySet()) {
            if (aMap.containsKey(entry.getKey())) {
                if (!entry.getValue().equals(aMap.get(entry.getKey()))) {
                    int number = entry.getValue() - aMap.get(entry.getKey());
                    if (number < 0) {
                        number = number * (-1);
                        deleteTimes = number + deleteTimes;
                    } else {
                        deleteTimes = number + deleteTimes;
                    }
                }
            } else {
                deleteTimes = deleteTimes + entry.getValue();
            }
        }
        for (Map.Entry<String, Integer> entry : aMap.entrySet()) {
            if (!bMap.containsKey(entry.getKey())) {
                deleteTimes = deleteTimes + entry.getValue();
            }

        }
        return deleteTimes;


    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }


}
