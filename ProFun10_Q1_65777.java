public class ProFun10_Q1_65777 {

    static boolean appearsln_(int[] a, int n, int i) {
        if (i == a.length)
            return false;
        if (a[i] == n)
            return true;
        return appearsln_(a, n, i + 1);
    }

    static boolean appearsln(int[] a, int n) {
        return appearsln(a, n);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(appearsln_(arr, 2, 0));
    }
}