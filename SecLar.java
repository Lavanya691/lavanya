import java.util.*;

public class SecLar {
    public static void main(String[] args) {
        int[] arr = { 30, 20, 50, 60, 10 };

        // method 1
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // int len = arr.length - 2;
        // System.out.println((arr[len]));

        // method 2
        int fh = -1;
        int sh = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > fh) {
                sh = fh;
                fh = arr[i];
            } else if (arr[i] < fh && arr[i] > sh) {
                sh = arr[i];
            }
        }
        System.out.println(sh);
    }
}
