import java.util.*;

public class kthSmallest {
    public static void main(String[] args) {
        int[] arr = { 40, 504, 2, 15, 59, -74, 85, 67, 56, 29, -68, 34, 5, 6, 6, 7, 8, 9, 9, 10, 80, 30, 9, 70 };
        int n = arr.length;
        int k = 3;
        quick(arr, 0, n - 1);

        System.out.println(k + "kth leargest is  " +  arr[n-k]);
        System.out.println(k + "kth smallesr  is  " +  arr[k-1]);
    }

    public static void quick(int arr[], int left, int right) {
        if (left < right) {
            int index = partition(arr, left, right);
            System.out.println(" >>>" + index);
            quick(arr, left, index - 1);
            quick(arr, index + 1, right);
        }

    }

    public static int partition(int arr[], int left, int right) {

        int pivote = arr[right];
        int leftIndex = left;
        int rightIndex = right - 1;

        while (leftIndex < rightIndex) {

            while (arr[leftIndex] < pivote && leftIndex <= arr.length - 1) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivote && rightIndex >= 0) {
                rightIndex--;
            }

            if (leftIndex < rightIndex) {
                swap(arr, leftIndex, rightIndex);
                rightIndex--;
                leftIndex++;
            }

        }

        swap(arr, leftIndex, right);

        return leftIndex;
    }

    public static void swap(int arr[], int a, int b) {
        int bkup = arr[a];
        arr[a] = arr[b];
        arr[b] = bkup;
        System.out.println(a + "<>" + b);
        System.out.println(Arrays.toString(arr));

    }

}