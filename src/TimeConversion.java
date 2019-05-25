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

    public String to24formatOther(String input){
        String isNumber = input.substring(0,2) + input.substring(3,5) + input.substring(6,8);
        String colon = input.substring(2,3) + input.substring(5,6);
        String pm_am = input.substring(8,10);

        try {
             int number = Integer.parseInt(isNumber);
        }catch (NumberFormatException nfe){
            return "Неверный формат" + " \"" + input + "\"";
        }

        if((colon.equals("::")) && ((pm_am.equals("AM") || (pm_am.equals("PM"))))) {
            if (pm_am.equals("PM")){
                int our = Integer.parseInt(input.substring(0,2));
                int res = our + 12;
                return res + input.substring(2,8);
            }else {
                return input.substring(0,9);
            }
        }else return "Неверный формат" + " \"" + input + "\"";
    }
}
