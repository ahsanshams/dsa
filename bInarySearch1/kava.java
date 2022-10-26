package bInarySearch1;

public class kava {
    public static void main(String[] args) {
        int [] arr = {1 , 2 ,3 , 5 ,6 ,7 , 10 } ;
        int target = 7;

        int ans = binary(arr , target);
        System.out.println(ans);
    }
    public  static  int binary(int [] arr , int target){
        int Start = 0;
        int end = arr.length-1;

        while(Start <= end){
            int mid = Start +  ( end -  Start)/ 2 ;
            if(target < arr[mid]){
                end = mid -1;

            }
            else if(target > arr[mid]){
                Start = mid + 1;

            }
            else {
                return arr[ mid];
            }
        }
        return  -1;

    }
}
