import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Lab7Q3_65777 {
    static void numDaysFromDate(int date, int month, int year, int myBD) {
        int daysBornTil31Dec2021 = 0;
        int allday = 0;
        int[] allmonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int x = month - 1; x < 12; x++){
            allday += allmonth[x];
        }
        if (year % 4 == 0 || year % 400 == 0 && year % 100 !=0){
            allday +=1;
        }
        allday = allday - date;
        for(int y = year + 1; y < 2022; y++){
            if (y % 4 == 0 || y % 400 == 0 && y % 100 !=0){
                allday += 366;
            }else{
                allday += 366;
            }
        }
        daysBornTil31Dec2021 = allday;
        int daysBornTil2Jan2022 = daysBornTil31Dec2021 + 2; // shift to Sunday Jan 02 2022
        String str = showResult(date, month, year, myBD, daysBornTil2Jan2022);
        System.out.println(str);

    }

    static String showResult(int date, int month, int year, int myBD, int fromNumDaysFromDate) { 
        String[] dayName = { "Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday" };
        int dayFromSun = 0;
        int modResult = fromNumDaysFromDate % 7; 
        dayFromSun = 7 - modResult;
        String str = String.format("You were born on %s and have been born for %d days (2 Jan 2022). Your program says %s", dayName[myBD], fromNumDaysFromDate, dayName[dayFromSun]);
return str; }

public static void main(String[] args) {
    LocalDate mar11yr04 = LocalDate.of(2004, 3, 11); 
    LocalDate jan1yr22 = LocalDate.of(2022, 1, 2);

    long daysBetween;
    daysBetween = ChronoUnit.DAYS.between(mar11yr04, jan1yr22);
    System.out.println(mar11yr04 + "was" + mar11yr04.getDayOfWeek() + ". It is " + daysBetween + "day to Saturday 2022-01-01.");
    numDaysFromDate(11 , 3 , 2004 ,4);
}
}
