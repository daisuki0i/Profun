import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int row = sc.nextInt();
        int[][] data = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                data[i][j] = sc.nextInt();
            }
        }
        int colToSort = sc.nextInt();
        sc.close();
        int[][] member = { {}, {} };
        for (int i = 0; i < row - 1; i++) {
            for (int j = i; j < row; j++) {
                if (data[i][colToSort] > data[j][colToSort]) {
                    member[0] = data[i];
                    member[1] = data[j];
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(data[i][j]);

                if (j < col - 1) {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
