import java.util.*;

public class CountingDigits {
    public static void main(String[] args) {
        int val = 1234;
        int count = 0;
        while (val > 0) {
            count++;
            val = val / 10;
        }
        System.out.println(count);
    }
}
