package bInarySearch1;

public class ceiling {
    public static void main(String[] args) {
        int [] arr = {2 , 3 ,5 , 9 , 14 , 16 ,18 } ;
        int target = 15;
        int ans  = binary(arr , target);
        System.out.println(ans);
    }
    public  static  int binary(int [] arr , int target){
        int Start = 0;
        int end = arr.length-1;

        while (Start <= end){
            int  mid  = Start + (end -   Start) /2 ;
            if(target < arr[mid]){
                end = mid -1;

            }
            else if (target > arr[mid]){
                Start = mid + 1;
            }
            else {
                return  mid;
            }
        }
        return arr[Start];
    }
}
