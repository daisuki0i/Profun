public class Lab5Q5_265777 {
    public static void main (String[] args){
        int number [][] = new int[4][];
        int count = 1;
        int num = 4;
        for (int i = 0; i < 4; i++){
            number[i] = new int[count++];
            for (int j = 0; j <= i; j++){
                number[i][j] = num;
                System.out.print(number [i][j] - j + "\t");
            }
            System.out.println();
        }
    }
}