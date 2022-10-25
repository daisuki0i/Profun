import java.util.Arrays;
import java.util.Scanner;

public class Profun08_Q3_65777 {
    public static void main(String args[]) {
        int[] data = new int[10];
        topK(data);
    }

    public static void topK(int[] Arr) {
        Scanner sc = new Scanner(System.in);
        // int[] data = { 5, 3, 8, 4, 10, 3, 1, 5, 9, 7, 0 };
        int data;
        do {
            System.out.println("input");
            data = sc.nextInt();
            System.out.println(data);
            int is = 0;

            if (data > 0) {
                for (int i = 0; i < Arr.length; i++) {
                    if (data >= Arr[i]) {
                        is = i;
                        break;
                    }
                }

                for (int i = Arr.length - 1; i > is; i--) {
                    Arr[i] = Arr[i - 1];
                }
                Arr[is] = data;

            }
            System.out.println(Arrays.toString(Arr));
            System.out.println();
        } while (data > 0);
        sc.close();
    }
}
