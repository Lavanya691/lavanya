import java.util.*;

public class Palindrome2 {
    public static void main(String[] args) {
        int num = 79897;
        String s = "" + num;
        int i = 0;
        int j = s.length() - 1;
        boolean IsPalendrome = true;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
                break;
            } else {
                IsPalendrome = false;
            }
        }
        if (IsPalendrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
