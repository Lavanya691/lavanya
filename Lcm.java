import java.util.*;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        int LCM = Math.max(a, b);
        while (!(LCM % a == 0 && LCM % b == 0)) {
            LCM++;
        }
        System.out.print(LCM);
    }
}
