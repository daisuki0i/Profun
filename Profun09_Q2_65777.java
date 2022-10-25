import java.util.Arrays;

public class Profun09_Q2_65777 {
    public static void main(String[] args) {
        int[][] data = { { 11, 12, 13, 14 },
                { 15, 16, 17, 18 },
                { 19, 20, 21, 22 },
                { 23, 24, 25, 26 },
                { 27, 28, 29, 30 },
        };
        // int[] arr = { 1, 2, 3, 20, 5, 6, 7 };
        int[][] hori = flipHorizontal(data);
        for (int i = 0; i < hori.length; i++) {
            System.out.println(Arrays.toString(hori[i]));
        }

    }

    static int[][] flipHorizontal(int[][] data) {
        int[][] aRef = new int[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            aRef[i] = data[data.length - 1 - i];

        }
        // aRef[4] = data[0];
        // aRef[3] = data[1];
        // aRef[2] = data[2];
        // aRef[1] = data[3];
        // aRef[0] = data[4];
        return aRef;
    }
}
