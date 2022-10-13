import java.util.*;
public class ChocolateDistribution {
    public static void main(String[] args) {
        int arr[] =  {7, 3, 2, 4, 9, 12, 56};
        int n = arr.length;
        int m  = 5;
        int x = chocolate(arr, m , n);
        System.out.println(x);


    }
    static int  chocolate(int arr[] , int m , int n){
        if(m==0 || n==0){
            return 0;
        }
        if(n<m){
            return -1;
        }
        Arrays.sort(arr);
        int min = arr[0];
        for(int i=0; i+m-1<n; i++){
            int diff = arr[i+m-1] - arr[i];



        }
        return 0;



    }
}
