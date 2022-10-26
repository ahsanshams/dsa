public class divisibleSumPair {
    public static void main(String[] args) {
        int [] arr = {1, 2 ,3 ,4 ,5 ,6};
        int k = 5;
        int size = arr.length;
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                int z = arr[i]+arr[j];
                if(z%k == 0){
                    System.out.println(arr[i] + " "+ arr[j]);
                }

            }
        }
    }
}
