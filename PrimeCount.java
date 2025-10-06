import java.util.*;

public class PrimeCount {
    public static void main(String[] args) {
        int n = 17;
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        for (int i = 2; i < n; i++) {
            if (arr[i] == true) {
                for (int j = i * 2; j < n; j = j + i) {
                    arr[j] = false;
                }
            }
        }
        int ct = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == true) {
                ct += 1;
            }
        }
        System.out.println("Count:" + ct);
    }
}
