
import java.util.*;
public class subArrays {
    public static void main(String[] args) {
        int arr[] = {5,4,-1,7,8};
        int current_Sum = 0;
        int max_sum=0;
        for(int i =0; i<arr.length; i++){
            max_sum = max_sum + arr[i];
            if(current_Sum > max_sum){
                max_sum = current_Sum;
            }
            if(current_Sum < 0){
                current_Sum =0;
            }

        }
        for(int i =0; i<arr.length; i++){
            max_sum = max_sum + arr[i];
            if(current_Sum > max_sum){
                max_sum = current_Sum;
            }
            if(current_Sum < 0){
                current_Sum =0;
            }

        }
        System.out.println(max_sum);
    }
}
