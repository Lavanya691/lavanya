import java.util.*;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, 50, 60 };
        int pos = 2;
        int val = 30;
        for (int i = arr.length - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = val;
        System.out.println(Arrays.toString(arr));
    }

}