public class Lab6Q2_165777 {
    public static void main (String[] args){
        int [] data = {7, 1, 2, -1, 3, 4, 10, -12, 3, 21, -9};
        int max = data[0];
        for (int i = 1; i < data.length; i++)
        {
            if(max < data[i])
            {
                max = data[i];
            }
        }
        System.out.println("maximum  is " + max);
    }
}
