public class test3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println(x); // 20
        System.out.println(y); // 10
    }
}
