public class Running_sum_1d_array {
    public static void main(String[] args) {
        int arr [] = {1, 2, 3 ,4};
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
            System.out.print(sum +  " ");
        }

    }
}
