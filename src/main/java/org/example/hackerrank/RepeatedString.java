package org.example.hackerrank;

import java.io.*;


public class RepeatedString {


    public static long repeatedString(String letters, long number) {

        char[] strArr = letters.toCharArray();
        long arrLength = letters.length();
        long count = 0;
        long index =  number;
        for (char letter : strArr) {
            if (letter == 'a') {
                count++;
            }
        }

        if(arrLength == 1 && count == 1){
            return number;
        }



        if (index > arrLength) {
            long times = index / arrLength;                                         // 40
            long broyOstanalisimvoli = index - (times * arrLength);                //  2
            long ostatukCount = 0;
            for (char letter : strArr) {
                if (broyOstanalisimvoli == 0) {
                    break;
                }
                if (letter == 'a') {
                    ostatukCount++;
                }
                broyOstanalisimvoli--;
            }
            return (times * count) + (ostatukCount);
        } else if (index == arrLength) {
            return count;
        } else if (index < arrLength) {
            long easycount = 0;
            for (char letter : strArr) {
                if (letter == 'a') {
                    easycount++;
                }
                index--;
                if (index == 0) {
                    break;
                }
            }
            return easycount;
        }
        return number;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bufferedReader.readLine();
        long n = Long.parseLong(bufferedReader.readLine().trim());
        long result = repeatedString(s, n);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
