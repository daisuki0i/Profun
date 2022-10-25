public class Lab7Q2_65777 {
    static int maxElement(int[] arr){
        int [] data = {7,1,2,-1,3,4,10,-12,3,21,-9};
        int sam;
        int max = 0;
        for (int i = 0; i < data.length; i++){
            sam = data[i];
            if (sam >= max){
                max = sam;
            }
        }
        System.out.println(max);
        return 0;
    }
    public static void main (String[] args){
        int [] a = {};
        maxElement(a);
    }
}
