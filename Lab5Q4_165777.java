public class Lab5Q4_165777 {
    public static void main (String[] args){
        String str = "WWWWMMMMWMWMWMWMMMWWWWWM";
        int student_M = 0;
        int student_W = 0;
        for (int i = 0; i<str.length();i++){
            if (str.charAt(i) == 'W')
            student_W++;
            else
            student_M++;
        }
        System.out.println("Student M:" + student_M + "คน");
        System.out.println("Student W:" + student_W + "คน");
    }
}
