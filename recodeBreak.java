public class recodeBreak {
    public static void main(String[] args) {
        int [] arr = {10 , 5, 20 , 20 , 4 , 5 ,2, 25 , 1};
        int min = arr[0];
        int max = arr[0];
        int max_RecodeBreak = 0;
        int min_RecodeBreak = 0;
        //int size = arr.length;
        for(int i=1; i<arr.length ; i++){
            if(arr[i] >  max){
                max_RecodeBreak++;
                max = arr[i];

            }
            else if(arr[i] < min){
                min_RecodeBreak++;
                min = arr[i];
            } else if (arr[i] == max ) {
                max_RecodeBreak = max_RecodeBreak;

            } else if (arr[i] == min_RecodeBreak) {
                min_RecodeBreak = min_RecodeBreak;


            }


        }
        System.out.println( max_RecodeBreak + " " + min_RecodeBreak);

    }
}
