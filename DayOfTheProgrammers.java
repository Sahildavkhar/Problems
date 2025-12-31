// https://www.hackerrank.com/challenges/day-of-the-programmer/problem

import java.util.Arrays;
import java.util.Scanner;

public class DayOfTheProgrammers {
    public static int daysInFeb(int year){
        if(year == 1918){
            return 15;
        } else if (year < 1918) {
            if (year % 4 == 0) {
                return 29;
            } else{
                return 28;
            }
        } else { //year > 1918
            if (year % 400 == 0){
                return 29;
            } else if (year % 100 == 0){
                return 28;
            } else if (year % 4 == 0){
                return 29;
            } else {
                return 28;
            }
        }
    }
    
    
    public static int daysInMonth(int month, int year){
        if (month == 2) return daysInFeb(year);
        else if (Arrays.asList(1,3,5,7,8,10,12).contains(month)){
            return 31;
        } else return 30;
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        // your code goes here
        int month = 0;
        int dayssofar = 0;
        while (dayssofar <= 256){
            month++;
            dayssofar += daysInMonth(month,year);
        }
        int day = daysInMonth(month,year);
        if (month == 2 && year == 1918) day += 13;
        while (dayssofar > 256) {
            day--;
            dayssofar--;
        }
        
        System.out.format("%02d.%02d.%04d",day,month,year);
        
    }
}