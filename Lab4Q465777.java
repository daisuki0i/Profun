public class Lab4Q465777 {
    public static void main (String[] args){
        for (int n = 1; n < 1000;n++){
            int sum = 0;
            for (int j = 1; j < n; j++){
                if (n%j == 0){
                sum += j;
                }
            }
            if (sum == n){
                System.out.println(sum);
            }
        }
    }
}
