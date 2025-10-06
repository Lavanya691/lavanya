import java.util.*;

public class Power {
    public static void main(String[] args) {
        int x = 5;
        int n = 2;
        int pro = 1;
        for (int i = 1; i <= n; i++) {
            pro = pro * x;
        }
        System.out.println(pro);
    }
}
