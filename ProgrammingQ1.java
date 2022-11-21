import java.util.Scanner;

public class ProgrammingQ1 {
    public static void main(String[] args) {
        String colsAndrows;
        String rowData;
        Scanner sc = new Scanner(System.in);
        colsAndrows = sc.nextLine();
        // System.out.println(Arrays.toString(colsAndrows.split(" ")));

        int col = Integer.parseInt(colsAndrows.split(" ")[0]);
        int row = Integer.parseInt(colsAndrows.split(" ")[1]);
        // System.out.printf("col: %d, row: %d", col, row);

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            rowData = sc.nextLine();
            String[] rowDataSplitted = rowData.split(" ");
            for (int j = 0; j < rowDataSplitted.length; j++) {
                arr[i][j] = Integer.parseInt(rowDataSplitted[j]);
            }
        }
        int colToSort;
        colToSort = sc.nextInt();
        int[][] member = { {}, {} };
        for (int i = 0; i < row - 1; i++) {
            for (int j = i + 1; j < row; j++) {
                if (arr[i][colToSort] > arr[j][colToSort]) {
                    member[0] = arr[i];
                    member[1] = arr[j];
                    arr[j] = member[0];
                    arr[i] = member[1];
                }

            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);

                if (j < col - 1) {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
