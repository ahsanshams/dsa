public class nextLeap {
    public static void main(String[] args) {
        int  z = 1997;
        int n = 7;
        for(int i =0; i<n; i++){

            if ((z % 400 == 0)
                    || (z % 4 == 0 && z % 100 != 0)) {



                System.out.println(z);
                break;
            }
            else{
                z++;

            }

        }
    }
}
