public class Bits {
    public static void main(String[] args) {
        int num = 5;
        int k = 3;
        int x = 1;
        boolean result = false;
        for (int i = 0; i < (k - 1); i++) {
            x = x * 2;
            if ((num & x) != 0) {
                result = true;
            }
        }
        System.out.println(result);
    }
}
