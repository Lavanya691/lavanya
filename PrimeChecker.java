import java.util.*;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int n = sc.nextInt();
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c += 1;

            }
        }
        if (c == 2) {
            System.out.println("Give Number is Prime");
        } else {
            System.out.println("Given Number is not a prime");
        }

    }
}