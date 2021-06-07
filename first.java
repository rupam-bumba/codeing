import java.util.*;

class first{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        
        int n = Sc.nextInt();
        int k = 0;
        int arr[] = new int[n];
        int oddarr[] = new int[n];
        
        for( int i = 0; i < n; i++ ){

            arr[i] = Sc.nextInt();
        }

        for( int i = 0; i < n; i++ ){

            if(arr[i] % 2 != 0 ){
               oddarr[k++] = arr[i];
               
            }
        }

        for (int j=0; j< k ; j++ ){
            System.out.println(oddarr[j]);
        }
        
        Sc.close();
    }
}