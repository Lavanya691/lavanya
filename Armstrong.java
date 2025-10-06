import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int s = 0, r;
        int m = n;
        while (n != 0) {
            r = n % 10;
            s = s + r * r * r;
            n = n / 10;
        }
        if (m == s) {
            System.out.println(m + " is an Armstrong number");
        } else {
            System.out.println(m + " is not an Armstrong number");
        }
    }
}
