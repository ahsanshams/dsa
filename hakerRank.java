public class hakerRank {
    public static void main(String[] args) {
        int [] arr = {1,3,5, 7 , 9};
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        int i;
        for( i=1; i<= arr.length-1; i++) {
            sum = sum + arr[i];
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }



        }
        // System.out.println(sum);
        int arrMax = sum - min;
        int arrMin = sum-max;
        System.out.println(arrMax + " " + arrMin);




        }
}
