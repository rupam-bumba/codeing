import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int n = Sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }

        Sc.close();


    
    }



    public static void swap(int arr[], int a, int b) {
        int bkup = arr[a];
        arr[a] = arr[b];
        arr[b] = bkup;
        System.out.println(a + "<>" + b);
        System.out.println(Arrays.toString(arr));

    }

}