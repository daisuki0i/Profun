public class Lab3Q365777 {
    public static void main (String[]args) {
        int a = 1;
        int b = 0;
        int c = 0;
        int d = 0;
        int sum = 0;
        for (b=0;b<999;){
            b = a*3;
            a++;
            sum = sum+b;
        }
        a=1;
        for(c=0;c<995;){
            c = a*5;
            a++;
            sum = sum+c;
        }
        a=1;
        for(d=0;d<990;){
            d = a*15;
            a++;
            sum = sum-d;
        }
        System.out.println(sum);
    }
}
