import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Logger;

/**
 * Created by ezo on 16-Sep-16.
 */
public class WelcomeMessage {
    private static Logger log = Logger.getLogger(WelcomeMessage.class.getName());

    public static void main(String[] args) {
        log.info("Greeting message.");
        System.out.println("hey");
        System.out.println(setMessage()+" "+setTime());
    }

    public static String setPartOfDay(){
        int hour = Calendar.HOUR_OF_DAY;
        log.info("Identified part of a day.");
        if (hour < 6) return "night";
        else if (hour < 9) return "morning";
        else if (hour < 19) return "day";
        else return "evening";
    }
    public static String setMessage(){
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", Locale.getDefault());
        log.info("Choose a message.");
        return resourceBundle.getString(setPartOfDay());
    }
    public static String setTime(){
        DateFormat format= new SimpleDateFormat("HH:mm");
        Date date = new Date();
        log.info("Set format for time and time itself.");
        return format.format(date);
    }

}
