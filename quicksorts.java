import java.util.*;

public class quicksorts {

    public static void main(String[] args) {

        int arr[] = { 40, 504, 2, 15, 59, -74, 85, 67, 56, 29, -68, 34, 5, 6, 6, 7, 8, 9, 9, 10, 80, 30, 9, 70 };
        int n = arr.length;
        System.out.println(n);
        System.out.println(Arrays.toString(arr));

        quick(arr, 0, n - 1);
    }

    public static void quick(int[] arr, int start, int end) {

        if (start < end) {
            int index = part(arr, start, end);

            quick(arr, start, index - 1);
            quick(arr, index + 1, end);

        }

    }

    public static int part(int[] arr, int start, int end) {

        int pivote = arr[end];
        int lessThenPivote = start;

        for (int i = start; i <= end - 1; i++) {

            if (arr[i] < pivote) {
                swap(arr, lessThenPivote, i);
                lessThenPivote++;
                // System.out.println(lessThenPivote );

            }

        }

        swap(arr, lessThenPivote, end);

        System.out.println(lessThenPivote + " " + arr[lessThenPivote]);

        return lessThenPivote;
    }

    public static void swap(int[] arr, int a, int b) {
        // System.out.println( arr[a] + "< >" + arr[b] );

        int bkup = arr[a];
        arr[a] = arr[b];
        arr[b] = bkup;
        System.out.println(Arrays.toString(arr));

    }

}
