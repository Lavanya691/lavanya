import java.util.*;

public class leadersofArray {
    public static void main(String[] args) {
        int arr[] = { 7, 10, 2, 3, 6, 5, 4 };
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.print(arr[i]);
                { // avoid extra comma at end
                    System.out.print(", ");
                }
            }
        }
    }
}
