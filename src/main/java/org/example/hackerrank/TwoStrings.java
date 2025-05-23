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


public class TwoStrings {


    public static String twoStrings(String s1, String s2) {

        Set<Character> s1Set = new HashSet<>();
        Set<Character> s2Set = new HashSet<>();

        for (char letter : s1.toCharArray()) {
            s1Set.add(letter);
        }

        for (char letter : s2.toCharArray()) {
            s2Set.add(letter);
        }

        boolean isExist = false;

        for (char letter : s1Set) {
            if (s2Set.contains(letter)) {
                isExist = true;
            }
        }
        if (isExist) {
            return "YES";
        } else {
            return "NO";
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();

                String s2 = bufferedReader.readLine();

                String result = twoStrings(s1, s2);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
