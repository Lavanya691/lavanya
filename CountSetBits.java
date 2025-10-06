public class CountSetBits {
    public static void main(String[] args) {
        int n = 7;
        int bitmask = 1;
        int ct = 0;
        for (int i = 1; i < 32; i++) {
            if ((n & bitmask) != 0) {
                ct += 1;
            }
            bitmask = bitmask << 1;
        }
        System.out.println(ct);
    }
}

// while (n > 0) {
// if ((n & 1) != 0) {
// ct += 1;
// }
// n = n >> 1;
