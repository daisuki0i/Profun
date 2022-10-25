import java.util.Scanner;
public class Lab7Q1_65777 {
    static int factorial(int n){
        int fr=1;
        for(int i =n; i>1; i--){
            fr *= i;
        }
        return fr;
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = factorial(n);
        System.out.println(x);
        input.close();
        }
}
