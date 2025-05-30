import java.util.*;

public class Strictdivisors {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of Strict Divisors of " + n + " sum is: " + sum);
    }
}
