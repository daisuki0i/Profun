import java.util.Scanner;
public class Lab4Q265777 {
    public static void main (String [] args){
        float sumOfprice = 0,lowestPrice;
        float[] priceOfproduct = new
    float[3];
        Scanner sc_price = new
    Scanner(System.in);
        for(int i = 0;i < priceOfproduct.length;i++){
            System.out.print("Enter price of product" +(i+1) + ":");
            priceOfproduct[1] = sc_price.nextFloat();
                sumOfprice += priceOfproduct[i];
        }
        sc_price.close();
        lowestPrice = priceOfproduct[0];
        for(int i = 0;i < priceOfproduct.length;i++){
            if(priceOfproduct[i] < lowestPrice)
                lowestPrice = priceOfproduct[i];
        }
        sumOfprice -= lowestPrice;
        System.out.println("sum:" + sumOfprice + "Bath");
    }
}
