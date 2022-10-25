public class ProFun10_Q2_65777 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 2 };
        // int n = arr.length;
        System.out.println(occurrences_(arr, 2, 0));
    }

    static int occurrences_(int[] a, int n, int i) {
        if (i == a.length)
            return 0;
        if (a[i] == n)
            return 1 + occurrences_(a, n, i + 1);
        return occurrences_(a, n, i + 1);
    }

    static int occurrences(int[] a, int n) {
        return occurrences(a, n);
    }
}