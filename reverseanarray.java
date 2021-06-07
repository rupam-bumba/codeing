import java.util.*;

public class reverseanarray {
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        
        int n = Sc.nextInt();
        int m = n;
        int arr[] = new int[n];

        for( int i = 0; i < n; i++ ){
            arr[i] = Sc.nextInt();
        }
    

        for (int i=0; i < m/2 ; i++){
            int bkup =  arr[i];
            arr[i] = arr[n-i -1];
            arr[n-i -1] = bkup;
        }


        for( int i = 0; i < n; i++ ){
            System.out.println( arr[i] );
        }


        Sc.close();
    }
   
}
