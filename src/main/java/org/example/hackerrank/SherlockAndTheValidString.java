package org.example.hackerrank;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class SherlockAndTheValidString {

    public static String isValid(String s) {
        String no = "NO";
        String yes = "YES";
        int value = 0;
        int isValid = 0;
        TreeMap<String, Integer> aMap = new TreeMap<>();
        for (char letter : s.toCharArray()) {
            if (aMap.containsKey(Character.toString(letter))) {
                aMap.put(Character.toString(letter), aMap.get(Character.toString(letter)) + 1);
            } else {
                aMap.put(Character.toString(letter), 1);
            }
        }
        for (Map.Entry<String, Integer> entry : aMap.entrySet()) {
            if (entry.getValue() == 1) {
                isValid++;
            }

            if(value == 0 && entry.getValue() != 1){
                value = entry.getValue();
            }else if(value != entry.getValue() && entry.getValue() != 1){
                isValid++;
            }
        }
        if (isValid > 1) {
            return no;
        } else {
            return yes;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bufferedReader.readLine();
        String result = isValid(s);
        bufferedWriter.write(result);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
