import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        int num = 717;
        int n = num;
        int rn = 0;
        while (n > 0) {
            int ld = n % 10;
            rn = rn * 10 + ld;
            n = n / 10;
        }
        if (num == rn) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
