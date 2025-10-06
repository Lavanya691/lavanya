import java.util.*;

public class OddOneOccuring {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 4, 5, 2, 4, 3, 5 }; // 5 occurs 3 times (odd)

        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR all elements
        }

        System.out.println("The number occurring odd times is: " + result);
    }
}