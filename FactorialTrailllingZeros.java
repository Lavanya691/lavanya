import java.util.*;

public class FactorialTrailllingZeros {
    public static long factorial(int n) {
        long pro = 1;
        for (int i = 1; i <= n; i++) {
            pro = pro * i;
        }
        return pro;
    }

    public static void main(String[] args) {
        int n =4;
        long fact_val = factorial(n);
        int traillingZerosCount = 0;
        while (fact_val % 10 == 0) {
            traillingZerosCount += 1;
            fact_val = fact_val / 10;
        }
        System.out.println("Trailing Zeros Count: " + traillingZerosCount);
    }
}
