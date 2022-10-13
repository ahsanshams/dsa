public class hackerrank_ratio6 {
    public static void main(String[] args) {
        int [] arr = {1, 1, 0, -1, -1};
        int n =arr.length;
         double positvie =0;

        float negative =0;
        float zero = 0;
        for(int i=0; i< arr.length; i++){
            if( arr[i] > 0){
                positvie++;
            }
            else if(arr[i] < 0){
                negative++;
            }
            else {
                zero++;
            }

        }
        System.out.println("ratio of positve no is " + positvie/n);
        System.out.println("ratio of negative no is " + negative/n);
        System.out.println("ratio of zero no is " + zero/n);



    }
}
