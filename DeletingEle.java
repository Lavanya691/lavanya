import java.util.*;

public class DeletingEle {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int ele = 3;
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                idx = i;
            }
        }
        for (int i = idx; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        System.out.println(Arrays.toString(arr));
    }
}
