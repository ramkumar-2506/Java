import java.util.Calendar;
public class calender {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println("Day:"+cal.get(Calendar.DATE));
        System.out.println("Month:"+cal.get(Calendar.MONTH));
        System.out.println("Hour:"+cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute:"+cal.get(Calendar.MINUTE));
        System.out.println("Second:"+cal.get(Calendar.SECOND));
    }
}
