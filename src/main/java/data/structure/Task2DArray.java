package data.structure;

import java.util.Arrays;

public class Task2DArray {

    public static void main(String[] args) {


        // O O O
        // O O O
        // O O O

        String [][] arr2d = new String[3][2];
        System.out.println(arr2d.length);

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < 2; j++) {
                arr2d[i][j] = "O";
            }
        }

        String [][] arr2dSecond = new String[][] {
                new String[] {"O", "O", "O"},
                new String[] {"O", "O", "O"},
                new String[] {"O", "O", "O"}
        };

        //System.out.println(Arrays.deepToString(arr2d));
        System.out.println(Arrays.deepToString(arr2dSecond));

    }
}
