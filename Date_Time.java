import java.time.*;
public class Date_Time {
    public static void main(String[] args){

        // Methods of LocalDate class
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

        // Methods of LocalTime class
        LocalTime time = LocalTime.now();
        LocalTime time1 = time.minusHours(2);
        LocalTime time2 = time.plusHours(2);
        System.out.println("Current time: " + time);
        System.out.println("Time 2 hours ago: "+ time1);
        System.out.println("Time 2 hours later: "+ time2);
        LocalTime localTime = LocalTime.of(12, 45, 20);
        System.out.println("Local time: " + localTime);
        String timeStr = "12:45:20";
        LocalTime time3 = LocalTime.parse(timeStr);
        System.out.println("Time3: " + time3);
        String timeStr2 = "23:45:20";
        LocalTime time4 = LocalTime.parse(timeStr2);
        System.out.println("Time4: " + time4);

        // Methods of LocalYear class
        Year year = Year.now();
        System.out.println("Current year: " + year);
        Year year1 = year.minusYears(5);
        Year year2 = year.plusYears(5);
        System.out.println("Year 5 years ago: " + year1);
        System.out.println("Year 5 years later: " + year2);
        Year year3 = Year.of(2023);
        System.out.println("Year3: " + year3);
        String yearStr = "2024";
        Year year4 = Year.parse(yearStr);
        System.out.println("Year4: " + year4);
        String yearStr2 = "2025";
        Year year5 = Year.parse(yearStr2);
        System.out.println("Year5: " + year5);

        // getDayOfWeek() and getDayOfMonth() methods
        LocalDate date3 = LocalDate.now();
        DayOfWeek dayOfWeek = date3.getDayOfWeek();
        int dayOfMonth = date3.getDayOfMonth();
        System.out.println("Day of week: " + dayOfWeek);
        System.out.println("Day of month: " + dayOfMonth);

        // getMonth() and getMonthValue() methods
        LocalDate date4 = LocalDate.now();
        Month month = date4.getMonth();
        int monthValue = date4.getMonthValue();
        System.out.println("Month: " + month);
        System.out.println("Month value: " + monthValue);

        // isLeapYear
        LocalDate date5 = LocalDate.now();
        System.out.println("Is leap year: " + date5.isLeapYear());
        LocalDate date6 = LocalDate.of(2030, 6, 16);
        System.out.println("Is leap year: " + date6.isLeapYear());

        LocalDate d1 = LocalDate.of(2020, 6, 16);
        LocalDate result = d1.withYear(2023);
        System.out.println("With Year: " + result);

        OffsetTime time5 = OffsetTime.now();
        int m = time5.getMinute();
        System.out.println("Current time: " + time5);
        System.out.println("Minute: " + m);
    }
}
