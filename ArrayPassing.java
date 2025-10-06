import java.util.*;

public class ArrayPassing {

    /* Returning and passing and jagged array */
    // Jagged array :{1,2,3}
    // {2,3}
    // {6,7,8,9}
    public static void main(String[] args) {
        int[][] arr = getArray();
        printArray(arr);
    }

    public static int[][] getArray() {
        return new int[][] {
                { 1, 2, 3 },
                { 2, 3 },
                { 6, 7, 8, 9 },
        };
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
