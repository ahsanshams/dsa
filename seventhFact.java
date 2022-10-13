public class seventhFact {
    public static void main(String[] args) {
        int m = 480;
        int n =4;
        int count = 0;
        for(int i=m/2; i>=2; i--){
            if( m%i == 0){
                count++;

                if( count==n){
                    System.out.println(i);


                }
            }
        }


    }
}
