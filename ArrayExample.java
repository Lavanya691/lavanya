import java.util.*;

public class ArrayExample {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 5 }, { 2, 4, 6 } };

        /* Array row by row */
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print((arr[i][j]));
        // }
        // System.out.println("");
        // }

        // for (int[] val : arr) {
        // System.out.println(Arrays.toString(arr));
        // }
        // System.out.println(Arrays.deepToString(arr));

        /* Array col by col */
        int row_length = arr.length;
        int col_length = arr[0].length;
        for (int i = 0; i < col_length; i++) {
            for (int j = 0; j < row_length; j++) {
                System.out.print(arr[j][i] + " ");
            }

            System.out.println();
        }
    }

}
