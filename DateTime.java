import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.getYear());
        System.out.println(today.getDayOfYear());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        LocalDateTime now = LocalDateTime.now();
        System.out.println("current Date and Time:"+now);
        System.out.println("After 5 hours:"+now.plusHours(5));
    }
}
