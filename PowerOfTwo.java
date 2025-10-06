import java.util.*;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 8;
        boolean result = false;
        while (num > 1) {
            if (num % 2 == 0) {
                result = true;
            } else {
                result = false;
            }
            num = num / 2;
        }
        System.out.println(result);
    }
}
