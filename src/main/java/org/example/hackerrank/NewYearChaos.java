package org.example.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class NewYearChaos {


    public static void minimumBribes(List<Integer> q) {

        List<Integer> regularyList = new ArrayList<>();
        for (int i = 0; i < q.size(); i++) {
            regularyList.add(i+1);
        }

        int minNumber = 0;
        boolean isChaotic = false;
        for (int i = 0; i < q.size(); i++) {
            if (q.get(i) == i + 1) {
                //System.out.println("All good");
            } else {
                int difference = Math.abs(q.get(i) - (i + 1));

                if (difference <= 2 && q.get(i) >= (i + 1)) {         //HERE
                    minNumber = minNumber + difference;

                    regularyList.remove(q.get(i));
                    regularyList.add((i ), q.get(i));

                } else if (difference > 2 && q.get(i) > (i + 1)) {
                    isChaotic = true;
                }
            }
        }
        if (isChaotic) {
            System.out.println("Too chaotic");
        } else {
            if(q.equals(regularyList)){
                System.out.println(minNumber);
            }else{
                int index = 0;
                int difference = 0;
                Integer temp = 0;
                for (int i = 0; i < regularyList.size(); i++) {
                    if(!regularyList.get(i).equals(q.get(i))){
                        temp = regularyList.get(i);
                         index = q.indexOf(regularyList.get(i));
                        difference = Math.abs(i - index);
                        minNumber = minNumber + difference;
                        regularyList.remove(temp);
                        regularyList.add(index, temp);
                    }
                }
                System.out.println(minNumber);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());
        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());
                minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
    }
}
