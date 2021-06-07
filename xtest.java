import java.util.*;

public class xtest {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int n = Sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        Sc.close();
        int arr2[] =  arr;
       System.out.println(Arrays.toString(arr));  
        fun1(arr);
        System.out.println(Arrays.toString(arr));  

      int arr3[] = fun2(arr2);

      fun1(arr2 );
      
      System.out.println(Arrays.toString(arr));  
        System.out.println(Arrays.toString(arr2));  
        System.out.println(Arrays.toString(arr3));  
  
    }



    public static void fun1 (int[] arr) {
        
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[i] * 3;
        }
        
    }



    public static int[] fun2 (int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr ;
    }



}
