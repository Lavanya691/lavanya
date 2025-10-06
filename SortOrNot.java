import java.util.*;

public class SortOrNot {
    public static void main(String[] args) {
        int arr[] = { 20, 30, 40, 50 };
        boolean sort = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                sort = true;
            }
        }
        if (sort == true) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}
