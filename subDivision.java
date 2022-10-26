public class subDivision {
    public static void main(String[] args) {
        int [] arr = {1, 2 ,1 ,3 ,5};
        int day = 3;
        int count = 0;
        for(int i = 0; i<arr.length ; i++){
            for(int j = 1; j<arr.length; j++ ){
                if(arr[i] + arr[j] == day){
                    count++;
                }


            }
        }
        System.out.println(count);
    }
}
