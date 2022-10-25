import java.util.Arrays;

public class ProFun10_Q3_65777 {

    public static void main(String[] args) {
        int[] arr = { 1, -2, 3, 4, -5 };
        System.out.println(Arrays.toString(negativeToZero(arr)));
    }

    static int[] negativeToZero_(int[] a, int i) {
        if (i == a.length) {
            return (a);
        }
        if (a[i] < 0) {
            a[i] = 0;
            negativeToZero(a);
        }
        return (negativeToZero_(a, i + 1));

    }

    public static int[] negativeToZero(int[] a) {
        int i = 0;
        return (negativeToZero_(a, i));
    }

}
