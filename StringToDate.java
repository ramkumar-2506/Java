import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate{
    public static void main(String[] args) {
        try{
            String dateString = "2026-03-11";
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = format.parse(dateString);
            System.out.println("Converted Date:"+date);
        }
        catch(Exception e){
            System.out.println("Invalid date format");
        }
    }
}