import java.util.*;

public class stringCount {
    public static void main(String[] args) {
        int x = 1234;
        String s = "";
        s = s + x;
        // System.out.println(s.length());
        System.out.println((int) Math.floor(Math.log10(x)) + 1);
    }
}
