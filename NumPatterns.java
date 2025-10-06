public class NumPatterns {
    public static void main(String[] args) {

        /* pattern 2 */
        /*
         * for (int row = 1; row <= n; row++) {
         * for (int col = 1; col <= row; col++) {
         * System.out.print(row + " ");
         * }
         * System.out.println(" ");
         * }
         */

        /* pattern 3 */
        /*
         * for (int row = 1; row <= n; row++) {
         * for (int col = 1; col <= n; col++) {
         * System.out.print(col + "  ");
         * }
         * System.out.println(" ");
         * }
         */

        /* pattern 4 */
        /*
         * for (int row = 1; row <= n; row++) {
         * for (int col = 1; col <= n; col++) {
         * System.out.print(row + "  ");
         * }
         * System.out.println(" ");
         * }
         */

        /* Pattern 5 */
        /*
         * for (int row = 3; row >= 1; row--) {
         * for (int col = 1; col <= row; col++) {
         * System.out.print(row + "  ");
         * }
         * System.out.println(" ");
         * }
         */

        /* Pattern 6 */
        for (int row = 3; row >= 1; row--) {
            int value = row;
            while (value > 0) {
                System.out.print(value + "  ");
                value -= 1;
            }
            System.out.println(" ");
        }
    }
}
