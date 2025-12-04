// Converts a time in 12-hour AM/PM format to 24-hour format.
// Example: "07:05:45PM" -> "19:05:45"

public class TimeConversion {
    public static String timeConversion(String s) {
        String ampm = s.substring(8, 10);
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8);
        
        if(ampm.equals("AM")){
            if(hour == 12){
                return "00" + rest;
            }
            else{
                return String.format("%02d", hour)+rest;
            }
        }
        else{
            if(hour != 12){
                hour = hour + 12;
            }
        }
        return hour + rest;
    }

    public static void main(String[] args) {
        String time12h = "07:05:45PM";
        String time24h = timeConversion(time12h);
        System.out.println(time24h); // Output: 19:05:45
    }
}
