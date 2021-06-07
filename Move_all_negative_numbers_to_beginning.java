import java.util.*;
public class Move_all_negative_numbers_to_beginning {
    

    public static void main(String[] args) {

        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int zero = 0;


        for (int i=0 ; i< arr.length ; i++){
        System.out.println(i + " " + zero );

            if ( arr[i] < 0 ){
                swap(arr, i ,zero);
                zero++;
            }
 
             
        }
         System.out.println(Arrays.toString(arr));


    }

    public static void swap (int[] arr , int a, int b){
        int bkup = arr[a];
        arr[a] = arr[b];
        arr[b] = bkup;
    }

}
