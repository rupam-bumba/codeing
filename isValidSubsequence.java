// import java.util.*;

public class isValidSubsequence {
  public static void main (String[] args) {
    // Write your code here.
		
    int[] arr = {12,34,56,88,74};
    int[] sub = {12,74,88,};
    int index = 0;
    

		for (int i =0 ; i < arr.length-1 ; i++){

      if(arr[i] == sub[index]){
        index ++;
      }
      if (index == sub.length -1 ){
        System.out.println(index);
      }
// Done in algo expert
    }
  }
}
