public class hackerRank9 {
    public static void main(String[] args) {
        int [] n  = {4 ,4, 1 ,3 , 2, 4};
        int year = 4;
        int count = 0;
        for(int i=0; i<n.length; i++){
            if( year == n[i]){
                count++;
            }

        }
        System.out.println(count);
    }
}
