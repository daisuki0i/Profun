import java.util.Arrays;

public class Profun09_Q3_65777 {
    public static void main(String[] args) {
        int[][] bMap = {
                { 0, 0, 9, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0 },
                { 0, 9, 9, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 9, 0, 0, 9, 9, 0, 0, 9, 0, 9, 0, 0 },
                { 0, 9, 0, 0, 9, 9, 0, 0, 9, 9, 9, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 9, 9, 0, 0, 0, 0 }
        };
        int[][] a = markMap(bMap);
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }

    static int[][] markMap(int[][] bMap) {
        int[][] mMap = new int[bMap.length][bMap[0].length];
        for (int i = 0; i < bMap.length; i++) {
            for (int j = 0; j < bMap[0].length; j++) {
                mMap[i][j] = bMap[i][j];
            }
        }
        for (int i = 0; i < mMap.length; i++) {
            for (int j = 0; j < mMap[0].length; j++) {
                if (bMap[i][j] != 9) {
                    for (int x = -1; x <= 1; x++) {
                        for (int y = -1; y <= 1; y++) {
                            try {
                                if (mMap[i + x][j + y] == 9) {
                                    mMap[i][j]++;
                                }
                            } catch (IndexOutOfBoundsException e) {
                                continue;
                            }
                        }
                    }
                }

            }
        }

        return mMap;
    }
}
