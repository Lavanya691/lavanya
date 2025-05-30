import java.util.*;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
        } else {
            int count = 0;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Give Number is Prime");
            } else {
                System.out.println("Given Number is not a prime");
            }
        }
        sc.close();
    }
}
