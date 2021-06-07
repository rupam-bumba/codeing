import java.util.*;

public class Sort_an_array_of_0s_1s_and_2s {
    public static void main(String[] args) {

        int arr[] = { 0, 1, 0 };

        int zero = 0;
        int twos = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + zero + " " + twos);

            if (arr[i] == 0) {
                swap(arr, i, zero);
                zero++;
            }
            if (arr[i] == 2) {
                if (i < twos) {
                    swap(arr, i, twos);
                    twos--;
                }

            }
            System.out.println(Arrays.toString(arr));

        }

    }

    public static void swap(int[] arr, int a, int b) {
        int bkup = arr[a];
        arr[a] = arr[b];
        arr[b] = bkup;
    }

}