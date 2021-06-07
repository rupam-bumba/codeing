import java.util.*;

public class minmax {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int n = Sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int j = 0 ; j < n; j++ ){
            if( min > arr[j] ){
                min  = arr[j];
            }

            if( max < arr[j] ){
                max = arr[j];
            }
        }

        System.out.println(min);
        System.out.println(max);

        Sc.close();
    }

}