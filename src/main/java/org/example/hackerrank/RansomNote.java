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

public class RansomNote {


    public static void checkMagazine(List<String> magazine, List<String> note) {

        Map<String, Integer> magazineWords = new HashMap<>();
        for (String word : magazine) {
            if (!magazineWords.containsKey(word)) {
                magazineWords.put(word, 1);
            } else {
                magazineWords.put(word, magazineWords.get(word) + 1);
            }
        }
        boolean isInList = true;
        for (String wordNote : note) {
            if (magazineWords.containsKey(wordNote)) {
                if (magazineWords.get(wordNote) == 1) {
                    magazineWords.remove(wordNote);
                } else {
                    magazineWords.put(wordNote, magazineWords.get(wordNote) - 1);
                }
            } else {
                isInList = false;
                break;
            }
        }
        String answer = null;
        answer = isInList ? "Yes" : "No";
        System.out.println(answer);

    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .collect(toList());

        checkMagazine(magazine, note);

        bufferedReader.close();
    }
}
