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


public class CountingValleys {


    public static int countingValleys(int steps, String path) {

        char[] allSteps = path.toCharArray();
        int counter = 0;
        int vurhove = 0;
        for (char step : allSteps) {
            if (step == 'U') {
                counter++;
                if (counter == 0) {
                    vurhove++;
                }
            } else {
                counter--;
            }
        }
        return vurhove;

    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = CountingValleys.countingValleys(steps, path);

        //bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
