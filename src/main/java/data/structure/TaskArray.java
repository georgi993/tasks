package data.structure;


import java.util.Arrays;

public class TaskArray {

    public static void main(String[] args) {

        String[] arr = new String[5];
        arr[0] = "1";
        arr[1] = "2";
        arr[2] = "3";
        arr[3] = "4";
        arr[4] = "5";

        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);




        Arrays.stream(arr).forEach(System.out::println);

        byte byteArr[] = { 10, 20, 15, 22, 35 };
        char charArr[] = { 'g', 'p', 'q', 'c', 'i' };
        int intArr[] = { 10, 20, 15, 22, 35 };
        double doubleArr[] = { 10.2, 15.1, 2.2, 3.5 };
        float floatArr[] = { 10.2f, 15.1f, 2.2f, 3.5f };
        short shortArr[] = { 10, 20, 15, 22, 35 };

        Arrays.sort(byteArr);
        Arrays.sort(charArr);
        Arrays.sort(intArr);
        Arrays.sort(doubleArr);
        Arrays.sort(floatArr);
        Arrays.sort(shortArr);

    }
}
