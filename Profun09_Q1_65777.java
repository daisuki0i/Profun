import java.util.Arrays;

public class Profun09_Q1_65777 {
    public static void main(String[] args) {
        int[] data = { 0, 1, 0, 1, 1, 0, 0, 0, 1 };
        shake(data);
        System.out.println(Arrays.toString(data));
    }

    static void shake(int[] data) {
        int left = 0;
        int right = data.length - 1;
        while (right > left) {
            if (data[left] == 1) {
                data[left]--;
            } else {
                right--;
            }
            if (data[right] == 0) {
                data[right]++;
            } else {
                left++;
            }

        }
    }
}
