import java.util.*;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 3 };
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        System.out.println(Arrays.toString(arr));
    }
}
