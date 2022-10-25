import java.util.Arrays;
import java.util.Scanner;

public class is {
    public static void main(String args[]) {
        int[] data = new int[10];
        topK(data);
    }

    // public static int[] insertionSort(int[] Arr) {
    // for (int i = 1; i < Arr.length; i++) {
    // int j = i;
    // while ((j > 0) && (Arr[j - 1] > Arr[j])) {
    // int tmp = Arr[j];
    // Arr[j] = Arr[j - 1];
    // Arr[j - 1] = tmp;
    // j--;
    // }
    // }
    // return Arr;
    // }

    public static void topK(int[] Arr) {
        Scanner sc = new Scanner(System.in);
        // int[] data = { 5, 3, 8, 4, 10, 3, 1, 5, 9, 7, 0 };
        int data;
        do {
            System.out.println("input int");
            data = sc.nextInt();
            System.out.println(data);

            if (data > 0) {
                for (int i = 1; i < Arr.length; i++) {
                    int j = i;
                    while ((j > 0) && (Arr[j - 1] > Arr[j])) {
                        int tmp = Arr[j];
                        Arr[j] = Arr[j - 1];
                        Arr[j - 1] = tmp;
                        j--;
                    }
                }

                for (int i = Arr.length - 1; i > 0; i--) {
                    Arr[i] = Arr[i - 1];

                }
                Arr[0] = data;

            }
            // Arr = insertionSort(Arr);
            System.out.println(Arrays.toString(Arr));
            System.out.println();
        } while (data > 0);
        sc.close();
    }
}
