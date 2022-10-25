public class Lab4Q365777 {
    public static void main (String[] args){
        int amountCharge = 0;
        int hrsPark = 0; 
        for(int i = 0; i < args.length; i++){
            hrsPark = Integer.parseInt(args[i]);
            if(hrsPark > 0 && hrsPark <= 2){
                amountCharge = 4;
            }
            else if (hrsPark > 2 && hrsPark <= 4){
                amountCharge = 4 + (hrsPark - 2)*3;
            }
            else if (hrsPark > 4 && hrsPark < 18){
                amountCharge = 4 + (2)*3 + (hrsPark - 4);
            }
            else if (hrsPark >= 18 && hrsPark <= 24){
                amountCharge = 24;
            }
            else{
                amountCharge = (hrsPark/24)*24;
                hrsPark = hrsPark%24;
                if (hrsPark > 0 && hrsPark <= 2){
                    amountCharge += 4;
                }
                else if (hrsPark > 2 && hrsPark <= 2){
                    amountCharge += 4 + (hrsPark - 2)*3;
                }
                else if (hrsPark > 4 && hrsPark < 18){
                    amountCharge += 4 + (2)*3 + (hrsPark - 4);
                }
                else if (hrsPark >= 18 && hrsPark <= 24){
                    amountCharge += 24;
                }
            }
            System.out.println(amountCharge);
        }
    }
}