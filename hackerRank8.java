public class hackerRank8 {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9};
         int sum =0;
         int i;
        for( i=0; i<= arr.length-1; i++){
            sum = sum+arr[i];




        }
        int max = sum - arr[0];
        System.out.println(max);
        int min = sum - arr[arr.length-1];
        System.out.println(min);






    }
}
