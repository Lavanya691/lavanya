public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        /* Pattern 1 */
        /*
         * int row = n;
         * int col = n;
         * for (int i = 1; i <= row; i++) {
         * for (int j = col; j > 0; j--) {
         * System.out.print("\t*");
         * }
         * System.out.println("");
         * }
         * }
         * 
         * }
         */

        /* Pattern 2 */
        /*
         * for (int row = 0; row < n; row++) {
         * for (int col = 0; col <= row; col++) {
         * System.out.print("* ");
         * }
         * System.out.println("");
         * }
         * }
         * }
         */

        /* pattern 3 */
        /*
         * for (int row = 1; row <= n; row++) {
         * for (int col = n; col >= row; col--) {
         * System.err.print("* ");
         * }
         * System.out.println("");
         * }
         * }
         * }
         */

        /* pattern 4 */
        /*
         * for (int row = 1; row <= n; row++) {
         * int sp = n - row;
         * int st = row;
         * for (int col = 1; col <= sp; col++) {
         * System.out.print("  ");
         * }
         * for (int col = 1; col <= st; col++) {
         * System.out.print(" *");
         * }
         * System.out.println("");
         * }
         */

        /* pattern 5 */
        /*
         * for (int i = 1; i <= n; i++) {
         * int sp = n - i;
         * int st = (2 * i) - 1;
         * for (int j = 1; j <= sp; j++) {
         * System.out.print("  ");
         * }
         * for (int j = 1; j <= st; j++) {
         * System.out.print(" *");
         * }
         * System.out.println("");
         * }
         */

        /* pattern 6 */
        /*
         * for (int i = n; i > 0; i--) {
         * int sp = n - i;
         * int st = (2 * i) - 1;
         * for (int j = 1; j <= sp; j++) {
         * System.out.print("  ");
         * }
         * for (int j = 1; j <= st; j++) {
         * System.out.print(" *");
         * }
         * System.out.println("");
         * }
         * }
         * }
         */

        /* Pattern 7 */

        /*
         * public class Patterns {
         * public static void up(int n) {
         * for (int i = 1; i <= n; i++) {
         * int sp = n - i;
         * int st = (2 * i) - 1;
         * for (int j = 1; j <= sp; j++) {
         * System.out.print("  ");
         * }
         * for (int j = 1; j <= st; j++) {
         * System.out.print(" *");
         * }
         * System.out.println("");
         * }
         * }
         * 
         * public static void lw(int n) {
         * for (int i = n; i > 0; i--) {
         * int sp = n - i + 1;
         * int st = (2 * i) - 1;
         * for (int j = 1; j <= sp; j++) {
         * System.out.print("  ");
         * }
         * for (int j = 1; j <= st; j++) {
         * System.out.print(" *");
         * }
         * System.out.println("");
         * }
         * }
         * 
         * public static void main(String[] args) {
         * int n = 5;
         * up(n);
         * lw(n - 1);
         * }
         * }
         */

        /* Pattern 8 */

        /*
         * for (int i = n; i > 0; i--) {
         * int st = i;
         * int sp = ((n - i) * 2) - 1;
         * for (int j = 1; j <= st; j++) {
         * System.out.print("* ");
         * }
         * for (int j = 1; j <= sp; j++) {
         * System.out.print("  ");
         * }
         * if (st == n) {
         * st = st - 1;
         * }
         * for (int j = 1; j <= st; j++) {
         * System.out.print("* ");
         * }
         * System.out.println("");
         * }
         */

        /* pattern 9 */

        /*
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= n; j++) {
         * if ((i == j) || ((i + j) == (n + 1))) {
         * System.out.print("*");
         * } else {
         * System.out.print(" ");
         * }
         * }
         * System.out.println("");
         * }
         */

        /* pattern 10 */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (((i + j) == (n - 1)) || ((i + j) == (n + 1)) || ((i + j) == (n + 3))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
