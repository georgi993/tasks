package org.example.hackerrank;

import java.io.*;

public class CommonChild {


    public static int commonChild(String s1, String s2) {

        int num = 0;

        //HAAARRY
        char[] s1Char = s1.toCharArray();
        //SALLYYY
        char[] s2Char = s2.toCharArray();

        StringBuilder s1Builder = new StringBuilder();
        StringBuilder s2Builder = new StringBuilder();

        for (char letter : s1Char) {
            if (s2.contains(String.valueOf(letter))) {
                s1Builder.append(letter);
            }
        }

        for (char letter : s2Char) {
            if (s1.contains(String.valueOf(letter))) {
                s2Builder.append(letter);
            }
        }
        System.out.println("s1Builder: " + s1Builder);
        System.out.println("s2Builder: " + s2Builder);
        return num;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        int result = commonChild(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
