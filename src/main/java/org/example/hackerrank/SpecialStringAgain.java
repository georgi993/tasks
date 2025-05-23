package org.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SpecialStringAgain {


    static long substrCount(int n, String s) {
        long number = 0L;
        number = s.toCharArray().length;
        char[] symbols = s.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            for (int j = i + 1; j < symbols.length; j++) {
                char[] subArray = Arrays.copyOfRange(symbols, i, j + 1);
                if (isValid(subArray)) {
                    number++;
                }
            }
        }
        return number;
    }

    public static boolean isValid(char[] subArray) {
        boolean isOk = false;
        if (subArray.length == 2) {
            if (subArray[0] == subArray[1]) {
                return true;
            } else {
                return false;
            }
        } else if (subArray.length % 2 != 0) {
            char letter = subArray[0];
            int middle = subArray.length / 2 + 1;
            for (int i = 0; i < subArray.length; i++) {
                if (letter != subArray[i]) {
                    if (i != (middle - 1)) {
                        return false;
                    }
                }
            }
            return true;
        } else if (subArray.length > 2 && subArray.length % 2 == 0) {
            char letter = subArray[0];
            for (int i = 0; i < subArray.length; i++) {
                if (letter != subArray[i]) {
                    return false;
                }
            }
            return true;
        }
        return isOk;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = scanner.nextLine();
        long result = substrCount(n, s);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
