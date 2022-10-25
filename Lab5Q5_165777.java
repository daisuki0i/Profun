public class Lab5Q5_165777 {
    public static void main (String[] args){
        int n = 10;
        for(int row = 1;row <= n;row++){
            for(int col = 1;col <= n;col++){
                if(col == row || col == n - (row - 1))
                    System.out.print(" ");
                else
                    System.out.print("x");
            }
            System.out.println();
        }
    }
}
