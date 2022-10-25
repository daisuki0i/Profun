import java.util.Scanner;
public class Lab6Q2_265777 {
    public static void main (String[] args){
        int segment = 1;
        int magnetic_group = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter magnetic: ");
        String input = sc.nextLine();
        for(int i = 0;i<input.length();i++){
            if(input.charAt(i) == ' ')
                magnetic_group++;
        }
        for(int i = 1;i <= (magnetic_group - 1);i++){
            if(input.charAt(3 * i - 2) == input.charAt((3 * i - 2) + 2)){
                segment++;
            }
        }
        System.out.println("segment = " + segment);
        sc.close();
    }
}
