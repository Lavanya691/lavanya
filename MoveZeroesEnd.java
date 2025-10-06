// import java.util.*;

// public class MoveZeroesEnd {
//     public static void main(String[] args) {
//         int[] arr = { 0, 2, 3, 0, 4, 0, 5, 0, 6, 0 };
//         for (int i = 0; i < arr.length - 1; i++) {
//             if (arr[i] == 0) {
//                 for (int j = i + 1; j < arr.length; j++) {
//                     if (arr[j] != 0) {
//                         int temp = arr[i];
//                         arr[i] = arr[j];
//                         arr[j] = temp;
//                     }
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }

// import java.util.*;

// public class MoveZeroesEnd {
//     public static void main(String[] args) {
//         int arr[] = { 0, 2, 5, 0, 4, 0, 3, 0, 6, 0 };
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));
//         int i = 0;
//         int j = arr.length - 1;
//         while (i <= j) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i += 1;
//             j -= 1;
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }

import java.util.*;

public class MoveZeroesEnd {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 5, 0, 4, 0, 3, 0, 6, 0 };
        int i = 0;
        int j = 0; // non zero value
        while (j < arr.length) {
            if (arr[j] == 0) {
                j++;
            } else if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}