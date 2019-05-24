import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Miroshnichenko Anatoliy.
 */
public class TimeConversion {

    public String to24format(String input) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
        Date inputTime = null;
        try {
            inputTime = inputFormat.parse(input);
        } catch (ParseException e) {
           // e.printStackTrace();
            System.out.println("Неверный формат");
        }
        if(inputTime != null) return new SimpleDateFormat("HH:mm:ss").format(inputTime);
        else return "";
    }
}
