import java.time.*;
public class Date_Time {
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("Today's date: " + date);
        System.out.println("Yesterday's date: " + yesterday);
        System.out.println("Tomorrow's date: " + tomorrow);
        LocalDate localDate = LocalDate.of(2003,6,16);
        System.out.println("Local date: " + localDate);
        String dateStr = "2023-06-16";
        LocalDate date1 = LocalDate.parse(dateStr);
        System.out.println("Date1: " + date1);
        String dateStr2 = "2024-04-12";
        LocalDate date2 = LocalDate.parse(dateStr2);
        System.out.println("Date2 : "+date2);
    }
}
