package bInarySearch1;

public class orderAgnostic {
    public static void main(String[] args) {
        int  [] arr = {};


    }
    public  static  int Agnotic(int [] arr , int target){
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end + start)/2;


        boolean isASC;
        if(arr[start] < arr[end]){
            isASC = true;

        }

        else {
            isASC = false;
        }
        while (start <= end){
            if(target < arr[end]){
                end = mid -1 ;

            } else if ( target > arr[mid]) {
                start = mid +1;

            }
            else {
                return mid;
            }
        }
        return  -1;
    }
}
