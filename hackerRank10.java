public class hackerRank10 {
    public static void main(String[] args) {
        int [] n = {73, 67 ,38, 33};
        for(int i =0; i< n.length; i++){
            if(n[i] < 38){
                System.out.println(n[i]);
            }
            if(n[i]  >  38  && n[i]/5 > 3){
                n[i] = n[i] + (5-n[i]%5);
            }
            else{
                System.out.println(n[i]);
            }
        }

    }
}
