import java.util.*;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = { 30, 20, 50, 60, 20 };
        int min_value = Integer.MAX_VALUE; // here we are initializing to +infinity
        int max_value = Integer.MIN_VALUE; // max = - infinity
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min_value) {
                min_value = arr[i];
            }
            if (arr[i] > max_value) {
                max_value = arr[i];
            }
        }
        System.out.println("HighestElement : " + max_value);
        System.out.println("LowestElement : " + min_value);
    }
}
